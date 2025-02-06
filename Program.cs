using System.Collections.Generic;
using System;

//tester test = new();

/*

DF test = new DF("{(U,S) |}");
test.parse("({1,2,3},{{1,2},{2,3},{1,2,3}})");
 
Console.WriteLine(test["U"]);
Console.WriteLine(test["S"]);


DF test2 = new DF("{(U,S,(T,V)) |}");
test2.parse("({1,2,3},{{1,2},{2,3},{1,2,3}},({a},{b}))");

Console.WriteLine(test2["U"]);
Console.WriteLine(test2["S"]);
Console.WriteLine(test2["T"]);
Console.WriteLine(test2["V"]);


DF test3 = new DF("{(a,b,c) | a is set, b is list, c is int}");
test3.parse("({1,2,3},(1,2,3),3)");

Console.WriteLine(test3["a"]);
Console.WriteLine(test3["b"]);
Console.WriteLine(test3["c"]);


//DF test4 = new DF("(a,b) where a is set, b is list");
//test4.parse("((1,2,3),(1,2,3))");



DF test5 = new DF("{(n,e) | n is set, e subset n cross n}");
test5.parse("({1,2,3},{(1,2),(2,3)})");
Console.WriteLine(test5["n"]);
Console.WriteLine(test5["e"]);

*/

DF isograph = new DF("{((n1,e1),(n2,e2)) | n1 is set, e1 subset n1 unorderedcross n1, n2 is set, e2 subset n2 unorderedcross n2}");

isograph.parse("(({1,2,3},{{1,2},{2,3}}),({a,b,c},{{b,c},{c,a}}))");

Console.WriteLine(isograph["n1"]);
Console.WriteLine(isograph["e1"]);
Console.WriteLine(isograph["n2"]);
Console.WriteLine(isograph["e2"]);

