#!/bin/bash

#
# Copyright (c) 2013 Juniper Networks, Inc. All rights reserved.
#
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
TARGET=$1
SBTOP=${2:-${DIR}/..}

mkdir -p ${TARGET}
$SBTOP/tools/generateds/generateDS.py -f -o ${TARGET} -g java-api $SBTOP/src/contrail-api-client/schema/vnc_cfg.xsd
