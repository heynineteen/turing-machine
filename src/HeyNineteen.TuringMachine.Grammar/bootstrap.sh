#!/usr/bin/env bash

sudo apt install dos2unix

cd /vagrant_data


git clone https://github.com/antlr/antlr4.git

cd antlr4/docker

docker build -t antlr/antlr4 .

docker run --rm -u $(id -u ${USER}):$(id -g ${USER}) -v /vagrant_data:/work antlr/antlr4 -o /work/Antlr/CSharp -Dlanguage=CSharp -visitor TuringMachine.g4

docker run --rm -u $(id -u ${USER}):$(id -g ${USER}) -v /vagrant_data:/work antlr/antlr4 -o /work/Antlr/Java -visitor TuringMachine.g4

