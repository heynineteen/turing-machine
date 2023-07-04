# remove previously generated files
rm -r -fo Antlr -ErrorAction Ignore

# remove antlr4 git repo
rm -r -fo antlr4 -ErrorAction Ignore

git clone https://github.com/antlr/antlr4.git

cd antlr4/docker

docker build -t antlr/antlr4 .

cd ..\..\

# docker run --rm -u $(id -u ${USER}):$(id -g ${USER}) -v /$(pwd):/work antlr/antlr4 bash

docker run --rm -v ${pwd}:/work antlr/antlr4 -o /work/Antlr/CSharp -Dlanguage=CSharp -visitor TuringMachine.g4

docker run --rm -v ${pwd}:/work antlr/antlr4 -o /work/Antlr/Java -visitor TuringMachine.g4
