# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.22

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /users/wjhu/P2/client

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /users/wjhu/P2/client/build

# Include any dependencies generated for this target.
include CMakeFiles/client_app.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/client_app.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/client_app.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/client_app.dir/flags.make

CMakeFiles/client_app.dir/src/client_app.cpp.o: CMakeFiles/client_app.dir/flags.make
CMakeFiles/client_app.dir/src/client_app.cpp.o: ../src/client_app.cpp
CMakeFiles/client_app.dir/src/client_app.cpp.o: CMakeFiles/client_app.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/users/wjhu/P2/client/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/client_app.dir/src/client_app.cpp.o"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/client_app.dir/src/client_app.cpp.o -MF CMakeFiles/client_app.dir/src/client_app.cpp.o.d -o CMakeFiles/client_app.dir/src/client_app.cpp.o -c /users/wjhu/P2/client/src/client_app.cpp

CMakeFiles/client_app.dir/src/client_app.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/client_app.dir/src/client_app.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /users/wjhu/P2/client/src/client_app.cpp > CMakeFiles/client_app.dir/src/client_app.cpp.i

CMakeFiles/client_app.dir/src/client_app.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/client_app.dir/src/client_app.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /users/wjhu/P2/client/src/client_app.cpp -o CMakeFiles/client_app.dir/src/client_app.cpp.s

# Object files for target client_app
client_app_OBJECTS = \
"CMakeFiles/client_app.dir/src/client_app.cpp.o"

# External object files for target client_app
client_app_EXTERNAL_OBJECTS =

client_app: CMakeFiles/client_app.dir/src/client_app.cpp.o
client_app: CMakeFiles/client_app.dir/build.make
client_app: lib739kv.so
client_app: /usr/local/lib/libgrpc++.a
client_app: /usr/local/lib/libgrpc++_reflection.a
client_app: /usr/local/lib/libprotobuf.a
client_app: /lib/x86_64-linux-gnu/libutf8proc.so
client_app: /usr/local/lib/libgrpc++.a
client_app: /usr/local/lib/libgrpc.a
client_app: /usr/local/lib/libupb_json_lib.a
client_app: /usr/local/lib/libupb_textformat_lib.a
client_app: /usr/local/lib/libupb_mini_descriptor_lib.a
client_app: /usr/local/lib/libupb_wire_lib.a
client_app: /usr/local/lib/libutf8_range_lib.a
client_app: /usr/local/lib/libupb_message_lib.a
client_app: /usr/local/lib/libupb_base_lib.a
client_app: /usr/local/lib/libupb_mem_lib.a
client_app: /usr/local/lib/libre2.a
client_app: /usr/local/lib/libz.a
client_app: /usr/local/lib/libabsl_statusor.a
client_app: /usr/local/lib/libcares.a
client_app: /usr/local/lib/libgpr.a
client_app: /usr/local/lib/libabsl_status.a
client_app: /usr/local/lib/libabsl_flags_internal.a
client_app: /usr/local/lib/libabsl_flags_reflection.a
client_app: /usr/local/lib/libabsl_raw_hash_set.a
client_app: /usr/local/lib/libabsl_hashtablez_sampler.a
client_app: /usr/local/lib/libabsl_flags_config.a
client_app: /usr/local/lib/libabsl_flags_program_name.a
client_app: /usr/local/lib/libabsl_flags_private_handle_accessor.a
client_app: /usr/local/lib/libabsl_flags_commandlineflag.a
client_app: /usr/local/lib/libabsl_flags_commandlineflag_internal.a
client_app: /usr/local/lib/libabsl_flags_marshalling.a
client_app: /usr/local/lib/libabsl_log_internal_check_op.a
client_app: /usr/local/lib/libabsl_log_internal_conditions.a
client_app: /usr/local/lib/libabsl_log_internal_message.a
client_app: /usr/local/lib/libabsl_log_internal_nullguard.a
client_app: /usr/local/lib/libabsl_examine_stack.a
client_app: /usr/local/lib/libabsl_log_internal_format.a
client_app: /usr/local/lib/libabsl_log_internal_proto.a
client_app: /usr/local/lib/libabsl_log_internal_log_sink_set.a
client_app: /usr/local/lib/libabsl_log_globals.a
client_app: /usr/local/lib/libabsl_hash.a
client_app: /usr/local/lib/libabsl_city.a
client_app: /usr/local/lib/libabsl_bad_variant_access.a
client_app: /usr/local/lib/libabsl_low_level_hash.a
client_app: /usr/local/lib/libabsl_log_internal_globals.a
client_app: /usr/local/lib/libabsl_log_sink.a
client_app: /usr/local/lib/libabsl_log_entry.a
client_app: /usr/local/lib/libabsl_strerror.a
client_app: /usr/local/lib/libabsl_vlog_config_internal.a
client_app: /usr/local/lib/libabsl_log_internal_fnmatch.a
client_app: /usr/local/lib/libabsl_random_distributions.a
client_app: /usr/local/lib/libabsl_random_seed_sequences.a
client_app: /usr/local/lib/libabsl_random_internal_pool_urbg.a
client_app: /usr/local/lib/libabsl_random_internal_randen.a
client_app: /usr/local/lib/libabsl_random_internal_randen_hwaes.a
client_app: /usr/local/lib/libabsl_random_internal_randen_hwaes_impl.a
client_app: /usr/local/lib/libabsl_random_internal_randen_slow.a
client_app: /usr/local/lib/libabsl_random_internal_platform.a
client_app: /usr/local/lib/libabsl_random_internal_seed_material.a
client_app: /usr/local/lib/libabsl_random_seed_gen_exception.a
client_app: /usr/local/lib/libabsl_cord.a
client_app: /usr/local/lib/libabsl_bad_optional_access.a
client_app: /usr/local/lib/libabsl_cordz_info.a
client_app: /usr/local/lib/libabsl_cord_internal.a
client_app: /usr/local/lib/libabsl_cordz_functions.a
client_app: /usr/local/lib/libabsl_exponential_biased.a
client_app: /usr/local/lib/libabsl_cordz_handle.a
client_app: /usr/local/lib/libabsl_crc_cord_state.a
client_app: /usr/local/lib/libabsl_crc32c.a
client_app: /usr/local/lib/libabsl_str_format_internal.a
client_app: /usr/local/lib/libabsl_crc_internal.a
client_app: /usr/local/lib/libabsl_crc_cpu_detect.a
client_app: /usr/local/lib/libabsl_synchronization.a
client_app: /usr/local/lib/libabsl_stacktrace.a
client_app: /usr/local/lib/libabsl_symbolize.a
client_app: /usr/local/lib/libabsl_debugging_internal.a
client_app: /usr/local/lib/libabsl_demangle_internal.a
client_app: /usr/local/lib/libabsl_graphcycles_internal.a
client_app: /usr/local/lib/libabsl_kernel_timeout_internal.a
client_app: /usr/local/lib/libabsl_malloc_internal.a
client_app: /usr/local/lib/libabsl_time.a
client_app: /usr/local/lib/libabsl_strings.a
client_app: /usr/local/lib/libabsl_int128.a
client_app: /usr/local/lib/libabsl_strings_internal.a
client_app: /usr/local/lib/libabsl_string_view.a
client_app: /usr/local/lib/libabsl_throw_delegate.a
client_app: /usr/local/lib/libabsl_base.a
client_app: /usr/local/lib/libabsl_spinlock_wait.a
client_app: /usr/local/lib/libabsl_raw_logging_internal.a
client_app: /usr/local/lib/libabsl_log_severity.a
client_app: /usr/local/lib/libabsl_civil_time.a
client_app: /usr/local/lib/libabsl_time_zone.a
client_app: /usr/local/lib/libssl.a
client_app: /usr/local/lib/libcrypto.a
client_app: /usr/local/lib/libaddress_sorting.a
client_app: /usr/local/lib/libprotobuf.a
client_app: CMakeFiles/client_app.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/users/wjhu/P2/client/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable client_app"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/client_app.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/client_app.dir/build: client_app
.PHONY : CMakeFiles/client_app.dir/build

CMakeFiles/client_app.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/client_app.dir/cmake_clean.cmake
.PHONY : CMakeFiles/client_app.dir/clean

CMakeFiles/client_app.dir/depend:
	cd /users/wjhu/P2/client/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /users/wjhu/P2/client /users/wjhu/P2/client /users/wjhu/P2/client/build /users/wjhu/P2/client/build /users/wjhu/P2/client/build/CMakeFiles/client_app.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/client_app.dir/depend

