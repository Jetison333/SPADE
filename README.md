# SPADE
SPADE is a language designed to parse, validate, and allow access to discrete math data structures. 

# Installation

to install SPADE into a c# project use
```bash
dotnet add package DiscreteParser --version 0.1.1
```

and then import with
```c#
using DiscreteParser;
```

antlr commands should be done inside of grammar/
to test grammer rules, use

```bash
antlr4-parse coll.g4 start -gui
```

To regenerate the antlr code after editing coll.g4 use
```bash
antlr4 coll.g4
```
