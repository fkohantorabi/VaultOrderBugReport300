#!/bin/sh -x

set -e

apk update
apk add jq

chmod a+x /opt/files/run.sh

rm -rf /var/cache/apk/*
