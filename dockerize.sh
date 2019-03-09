#!/bin/sh
read -p "Enter image version: " version

echo "Creating images with version $version"

read -p "Enter maven goals: " mvnCommand

echo Maven $mvnCommand has started
mvn $mvnCommand

for d in *; do
    if [ -f ./$d/Dockerfile ]; then

        echo Creating image $d:$version
        docker build -t $d:$version ./$d
    fi
done
