#!/bin/bash

# Function to generate URLs and save to a file
generate_urls() {
  count=$1
  output_file="config_kill.txt"
  start_port=12380
  urls=""

  for ((i=0; i<count; i++)); do
    port=$((start_port + i))
    if [ $i -eq 0 ]; then
      urls="http://127.0.0.1:$port"
    else
      urls="$urls,http://127.0.0.1:$port"
    fi
  done

  # Write the URLs to a .txt file
  echo "$urls" > "$output_file"
  echo "URLs written to $output_file"
}

# Check if user provided input
if [ -z "$1" ]; then
  echo "Usage: $0 <count>"
  exit 1
fi

# Generate URLs and write to file
generate_urls $1
