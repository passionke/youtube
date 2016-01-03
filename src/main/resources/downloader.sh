#!/bin/sh
/data/program/youtube-dl --get-filename -o "/root/youtube/%(title)s.%(ext)s" --restrict-filenames --exec "/usr/bin/bypy upload {}" $1