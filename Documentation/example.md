## Installation

to install SPADE into a c# project use
```bash
dotnet add package SPADE
```

and then import with
```c#
using SPADE;
```

## Code example

```c#
string definitionString = "{{(N,E) | N is set, E subset N cross N";
string InstanceString = "({A,B,C,D},{(A,B),(B,C),(C,D),(D,A),(A,C)})";

StringParser graph = new(defintionString);
graph.parse(instanceString);
    
Console.WriteLine(graph["N"]);

foreach (UtilCollection c in graph["E"])
{
    Console.WriteLine(c);
}
```

Above is example code for parsing a graph type problem. The StringParser class is provided with a [definition string](DefinitionString.md), and then with a [instance string](InstanceString.md). It then parses and verifies the instance string. Now, you can access items of that problem by using a key access, which returns a [UtilCollection](utilcollection.md) class, which can then be further used however you need to use it. 
