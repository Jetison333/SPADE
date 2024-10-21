using System.Collections.Generic;
using System;

//tester test = new();

/*

DF test = new DF("(U,S) where");
test.parse("({1,2,3},{{1,2},{2,3},{1,2,3}})");
 
Console.WriteLine(test["U"]);
Console.WriteLine(test["S"]);

*/

DF test2 = new DF("(U,S,(T,V)) where");
test2.parse("({1,2,3},{{1,2},{2,3},{1,2,3}},({a},{b}))");

Console.WriteLine(test2["U"]);
Console.WriteLine(test2["S"]);
Console.WriteLine(test2["T"]);
Console.WriteLine(test2["V"]);

/*

DF test3 = new DF("(a,b,c) where a is set, b is list, c is int");
test3.parse("({1,2,3},(1,2,3),3)");

Console.WriteLine(test3["a"]);
Console.WriteLine(test3["b"]);


DF test4 = new DF("(a,b) where a is set, b is list");
test4.parse("((1,2,3),(1,2,3))");


*/

//DF test5 = new DF("(n,e) where n is set, e subset n cross n");
//test5.parse("({1,2,3},{(1,2),(2,3)})");
//Console.WriteLine(test5["n"]);
