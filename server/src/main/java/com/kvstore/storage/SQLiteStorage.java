package com.kvstore.storage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.kvstore.raft.LogEntry;

public class SQLiteStorage {
    private Connection connection;
    private static final Logger logger = LoggerFactory.getLogger(SQLiteStorage.class);

public SQLiteStorage(String dbUrl) {
    try {
        connection = createConnection(dbUrl);
        initializeDatabase();
    } catch (SQLException e) {
        throw new RuntimeException("Failed to initialize database", e);
    }
}

    protected Connection createConnection(String dbUrl) throws SQLException {
        return DriverManager.getConnection(dbUrl);
    }

private void initializeDatabase() {
    try (Statement stmt = connection.createStatement()) {
        // Create kv_store table
        stmt.execute("CREATE TABLE IF NOT EXISTS kv_store (key TEXT PRIMARY KEY, value TEXT)");

        // Create logs table
        stmt.execute("CREATE TABLE IF NOT EXISTS logs (logindex INTEGER PRIMARY KEY, term INTEGER, key TEXT, value TEXT)");

        // Create state table
        stmt.execute("CREATE TABLE IF NOT EXISTS state (lastApplied INTEGER, commitIndex INTEGER, currentTerm INTEGER, votedFor TEXT)");
        stmt.execute("INSERT OR IGNORE INTO state (lastApplied, commitIndex, currentTerm, votedFor) VALUES (0, 0, 0, NULL)");
    } catch (SQLException e) {
        throw new RuntimeException("Failed to initialize database tables", e);
    }
}

//public long appendLogEntry(LogEntry entry) {
//    String sql = "INSERT INTO logs (term, key, value) VALUES (?, ?, ?)";
//    try (PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
//        pstmt.setLong(1, entry.getTerm());
//        pstmt.setString(2, entry.getKey());
//        pstmt.setString(3, entry.getValue());
//        pstmt.executeUpdate();
//
//        try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
//            if (generatedKeys.next()) {
//                return generatedKeys.getLong(1);
//            } else {
//                throw new SQLException("Creating log entry failed, no ID obtained.");
//            }
//        }
//    } catch (SQLException e) {
//        throw new RuntimeException("Failed to append log entry", e);
//    }
//}
public long appendLogEntry(LogEntry entry) {
    String sql = "INSERT INTO logs (term, key, value) VALUES (?, ?, ?)";
    try (PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        pstmt.setLong(1, entry.getTerm());
        pstmt.setString(2, entry.getKey());
        pstmt.setString(3, entry.getValue());
        int affectedRows = pstmt.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Creating log entry failed, no rows affected.");
        }

        try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                long id = generatedKeys.getLong(1);
                logger.info("Appended log entry: {} at index: {}", entry, id);
                return id;
            } else {
                throw new SQLException("Creating log entry failed, no ID obtained.");
            }
        }
    } catch (SQLException e) {
        logger.error("Failed to append log entry", e);
        throw new RuntimeException("Failed to append log entry", e);
    }
}

    public List<LogEntry> getLogEntries(long startIdx, long endIdx) {
        List<LogEntry> entries = new ArrayList<>();
        String sql = "SELECT term, key, value FROM logs WHERE logindex >= ? AND logindex <= ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, startIdx);
            pstmt.setLong(2, endIdx);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                long term = rs.getLong("term");
                String key = rs.getString("key");
                String value = rs.getString("value");
                entries.add(LogEntry.newBuilder()
                        .setTerm(term)
                        .setKey(key)
                        .setValue(value)
                        .build());
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to get log entries", e);
        }
        return entries;
    }

    public LogEntry getLogEntry(long index) {
        String sql = "SELECT term, key, value FROM logs WHERE logindex = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, index);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                long term = rs.getLong("term");
                String key = rs.getString("key");
                String value = rs.getString("value");
                return LogEntry.newBuilder()
                        .setTerm(term)
                        .setKey(key)
                        .setValue(value)
                        .build();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to get log entry", e);
        }
        return null; // Entry not found
    }

    public long getLastLogIndex() {
        String sql = "SELECT MAX(logindex) FROM logs";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to get log logindex", e);
        }
        return 0; // No logs found
    }

    public long getLastLogTerm() {
        long lastIndex = getLastLogIndex();
        if (lastIndex > 0) {
            LogEntry entry = getLogEntry(lastIndex);
            return entry != null ? entry.getTerm() : 0;
        }
        return 0;
    }

    public long getCommitIndex() {
        String sql = "SELECT commitIndex FROM state";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getLong("commitIndex");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void setCommitIndex(long commitIndex) {
        String sql = "UPDATE state SET commitIndex = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, commitIndex);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public long getLastApplied() {
        String sql = "SELECT lastApplied FROM state";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getLong("lastApplied");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void setLastApplied(long lastApplied) {
        String sql = "UPDATE state SET lastApplied = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, lastApplied);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteLogEntriesFrom(long index) {
        String sql = "DELETE FROM logs WHERE logindex >= ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, index);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateKeyValue(String key, String value) {
        String sql = "INSERT OR REPLACE INTO kv_store (key, value) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, key);
            pstmt.setString(2, value);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void put(String key, String value) {
        updateKeyValue(key, value);
    }

    public String get(String key) {
        String sql = "SELECT value FROM kv_store WHERE key = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, key);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("value");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
