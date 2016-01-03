#!/bin/sh
/data/program/youtube-dl -o "/root/youtube/%(title)s.%(ext)s" --restrict-filenames --exec "/usr/bin/bypy upload {}" $1