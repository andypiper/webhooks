#!/bin/bash

curl -w "@curl-format.txt" -v -s "$1?crc_token=$2"
