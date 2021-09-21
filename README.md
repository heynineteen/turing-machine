# turing-machine

## Overview
This library defines a grammar for defining Turing Machines as described in [The Annotated Turing by Charles Petzold](https://www.amazon.co.uk/Annotated-Turing-Through-Historic-Computability/dp/0470229055/).

Users can define a machine in a text file, and pass it to the machine for execution.

The grammar can be found [here](https://github.com/heynineteen/turing-machine/blob/master/src/HeyNineteen.TuringMachine.Grammar/TuringMachine.g4)

## Example Machines
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
b -> anyOrNone     -> Pe,R,Pe,R,P0,R,R,P0,L,L -> o;
 
o -> 1             -> R,Px,L,L,L              -> o;
o -> 0             ->                         -> q;
 
q -> any           -> R,R                     -> q;
q -> none          -> P1,L                    -> p;
 
p -> x             -> E,R                     -> q;
p -> e             -> R                       -> f;
p -> none          -> L,L                     -> p;
 
f -> any           -> R,R                     -> f;
f -> none          -> P0,L,L                  -> o;
```
Result after 224 steps:
```
eef0 0 1 0 1 1 0 1 1 1 0 1 1 1 1 0 1 1 1 1 1
```
## Changing the grammar

## Running the Console Application

## Consuming the Library