#!/bin/bash

curl -w "@curl-format.txt" -o /dev/null -s "$1\?crc_token\=$2"
