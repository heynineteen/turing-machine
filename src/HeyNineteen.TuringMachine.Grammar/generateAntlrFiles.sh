#!/bin/bash

# remove previously generated files
rm -rfv ./Antlr/*

# remove antlr4 git repo
rm -rfv ./antlr4

git clone https://github.com/antlr/antlr4.git

cd antlr4/docker

docker build -t antlr/antlr4 .

cd ../../

echo $(pwd)

# docker run --rm -u $(id -u ${USER}):$(id -g ${USER}) -v /$(pwd):/work antlr/antlr4 bash

docker run --rm -u $(id -u ${USER}):$(id -g ${USER}) -v $(pwd):/work antlr/antlr4 -o /work/Antlr/CSharp -Dlanguage=CSharp -visitor TuringMachine.g4

docker run --rm -u $(id -u ${USER}):$(id -g ${USER}) -v $(pwd):/work antlr/antlr4 -o /work/Antlr/Java -visitor TuringMachine.g4
