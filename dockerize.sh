#!/bin/sh
read -p "Enter image version: " version

echo "Creating images with version $version"

read -p "Enter maven goals: " mvnCommand

mvn $mvnCommand

for d in *; do
    if [ -f ./$d/Dockerfile ]; then
        echo Maven clean install has started

        echo Creating image $d:$version
        docker build -t $d:$version ./$d
    fi
done