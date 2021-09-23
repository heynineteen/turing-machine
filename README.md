
#  turing-machine  
##  Overview  
This library defines a grammar for defining Turing Machines as described in [The Annotated Turing by Charles Petzold](https://www.amazon.co.uk/Annotated-Turing-Through-Historic-Computability/dp/0470229055/).

Users can define a machine in a text file, and pass it to the machine for execution.

The grammar can be found [here](https://github.com/heynineteen/turing-machine/blob/master/src/HeyNineteen.TuringMachine.Grammar/TuringMachine.g4)

##  Example Machines
This machine computes a number made up of alternating 0s and 1s (p. 81):
```
b -> anyOrNone -> P0, R -> c;
c -> anyOrNone -> R     -> e;
e -> anyOrNone -> P1, R -> f;
f -> anyOrNone -> R     -> b;
 ```
Result after 12 steps:
```
0 1 0 1 0 1 b
```
This machine computes a number with increasing numbers of 1s delimited with single 0s (p. 87):
```
b -> anyOrNone     -> Pe, R, Pe, R, P0, R, R, P0, L, L -> o;
 
o -> 1             -> R, Px, L, L, L                   -> o;
o -> 0             ->                                  -> q;
 
q -> any           -> R, R                             -> q;
q -> none          -> P1, L                            -> p;
 
p -> x             -> E, R                             -> q;
p -> e             -> R                                -> f;
p -> none          -> L, L                             -> p;
 
f -> any           -> R, R                             -> f;
f -> none          -> P0, L, L                         -> o;
```
Result after 224 steps:
```
eef0 0 1 0 1 1 0 1 1 1 0 1 1 1 1 0 1 1 1 1 1
```
##  Changing the grammar 
Prerequisites: you will need VirtualBox and Vagrant installed on your system.

To change the grammar and regenerate the Antlr files:
 1. Make your changes to the [grammar file](https://github.com/heynineteen/turing-machine/blob/master/src/HeyNineteen.TuringMachine.Grammar/TuringMachine.g4).
 2. In a bash shell, navigate to the root of the `HeyNineteen.TuringMachine.Grammar` project.
 3. Execute `./generateAntlrFiles.sh`
 4. Make any necessary changes to the [TuringMachineVisitor.cs file](https://github.com/heynineteen/turing-machine/blob/master/src/HeyNineteen.TuringMachine.Library/TuringMachineVisitor.cs) that result from the change to the grammar.
##  Running the Console Application
The console application allow a user to execute a machine they have defined. The help information is as follows:
```
$ ./HeyNineteen.TuringMachine.ConsoleApp.exe --help
HeyNineteen.TuringMachine.ConsoleApp 1.0.0
Copyright (C) 2021 HeyNineteen.TuringMachine.ConsoleApp
USAGE:
Show state of machine defined in file after 1000 steps:
  HeyNineteen.TuringMachine.ConsoleApp.exe --file my.machine
Show state of machine defined in file after 500 steps:
  HeyNineteen.TuringMachine.ConsoleApp.exe --count 500 --file my.machine
Have machine pause for 500ms after each step:
  HeyNineteen.TuringMachine.ConsoleApp.exe --file my.machine --pauseInterval 500
Have machine wait for Enter key between each step:
  HeyNineteen.TuringMachine.ConsoleApp.exe --file my.machine --step-through
Maintain history of machine state:
  HeyNineteen.TuringMachine.ConsoleApp.exe --file my.machine --history

  -f, --file             Required. The name of the file containing the machine
                         definition.

  -s, --step-through     (Default: false) Force user to press any key to execute
                         each step.

  -c, --count            (Default: 1000) The number of steps the machine will
                         execute before exiting.

  -h, --history          (Default: false) Maintain history of state.

  -p, --pauseInterval    (Default: 0) Time in milliseconds the machine will
                         pause between executing steps.

  --help                 Display this help screen.

  --version              Display version information.
```
##  Consuming the Library
Alternativley, you can the `HeyNineteen.TuringMachine.Library` directly from your own code. Here is a sample that executes a machine for 1000 steps and then outputs the result:
```
public void Run(string inputFile)
{
    var input = File.ReadAllText(inputFile);
    var machine = new MachineBuilder().Build(input);

    for (var i = 0; i < 1000; i++)
        machine.Tick();

    Console.WriteLine(machine.State);
}
```