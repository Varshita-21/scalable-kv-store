package com.kvstore.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.kvstore.raft.RaftNode;
import com.kvstore.storage.SQLiteStorage;
import com.kvstore.config.ServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.kvstore.raft.NodeInfo;


import java.io.IOException;

public class KVStoreServer {
    private final int port;
    private final Server server;

    private final RaftNode raftNode;
    private final SQLiteStorage storage;
    private static final Logger logger = LoggerFactory.getLogger(KVStoreServer.class);

    public KVStoreServer(ServerConfig config) throws IOException {
        this.port = Integer.parseInt(config.getNodeId().split(":")[1]);
        this.storage = new SQLiteStorage(config.getStoragePath());
        this.raftNode = new RaftNode(config.getNodeId(), config.getPeers(), storage);
        KVStoreServiceImpl service = new KVStoreServiceImpl(storage, raftNode);
        this.server = ServerBuilder.forPort(port)
                .addService(service)
                .build();
    }

    public void start() throws IOException {
        server.start();
        raftNode.start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("Shutting down gRPC server");
                KVStoreServer.this.stop();
                System.err.println("Server shut down");
            }
        });
    }

    public void stop() {
        if (server != null) {
            logger.info("Shutting down gRPC server");
            server.shutdown();
        }
        if (raftNode != null) {
            logger.info("Shutting down Raft node");
            raftNode.shutdown();
        }
        if (storage != null) {
            logger.info("Closing storage");
            storage.close();
        }
        logger.info("Server shut down complete");
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length != 1) {
            System.err.println("Usage: KVStoreServer <config-file>");
            System.exit(1);
        }
        ServerConfig config = new ServerConfig(args[0]);
        final KVStoreServer server = new KVStoreServer(config);
        server.start();
        server.blockUntilShutdown();
    }
}