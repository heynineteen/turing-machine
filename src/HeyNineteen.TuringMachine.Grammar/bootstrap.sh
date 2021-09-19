#!/usr/bin/env bash

sudo apt install dos2unix

cd /vagrant_data

rm -rfv ./Antlr/*

# remove antlr4 git repo
rm -rfv ./antlr4

#cd /vagrant_data \
# && dos2unix ./run.sh \
# && echo user: $USER \
# && sudo chmod +x ./run.sh \
# && ls -al \
# && ./run.sh;

 git clone https://github.com/antlr/antlr4.git
cd antlr4/docker
docker build -t antlr/antlr4 .

docker run --rm -u $(id -u ${USER}):$(id -g ${USER}) -v /vagrant_data:/work antlr/antlr4 -o /work/Antlr -Dlanguage=CSharp -visitor TuringMachine.g4

cd /vagrant_data

cp TuringMachine.g4 ./Antlr
