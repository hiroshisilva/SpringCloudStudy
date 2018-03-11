#!/usr/bin/env bash

cd products-services && ./gradlew build docker
cd ../order-services && ./gradlew build docker
