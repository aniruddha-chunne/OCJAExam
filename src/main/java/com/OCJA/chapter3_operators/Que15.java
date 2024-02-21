package com.OCJA.chapter3_operators;


/*

// 74 - operators
// 539 - Answer

15. What is the output of the following code snippet?
int hops = 0;
int jumps = 0;
jumps = hops++;
if(jumps)
 System.out.print("Jump!");
else
 System.out.print("Hop!");
A. Jump!
B. Hop!
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

15. C. The value of jumps and hops is unimportant because this code
does not compile, making Option C the correct answer. Unlike
some other programming languages, Java does not
automatically convert integers to boolean values for use in ifthen statements. The statement if(jumps) evaluates to if(0),
and since 0 is not a boolean value, the code does not compile.
Note that the value of the jumps variable is irrelevant in this
example; no integer evaluates to a boolean value in Java.


*/
public class Que15 {
}
