package com.OCJA.chapter3_operators;

/*

// 79 - operators
// 542 - Answer


30. What is the output of the following code snippet?
int x = 10, y = 5;
boolean w = true, z = false;
x = w ? y++ : y--;
w = !z;
System.out.print((x+y)+" "+(w ? 5 : 10));
A. The code does not compile.
B. 10 10
C. 11 5
D. 12 5

30. C. The code compiles, so Option A is incorrect. Since w starts out
true, the third line takes the first right-hand side of the ternary
expression returning and assigning 5 to x (post-increment
operator) while incrementing y to 6. Note that the second righthand side of the ternary expression y–– is not evaluated since
ternary operators only evaluate one right-hand expression at
runtime. On the fourth line, the value of w is set to !z. Since z is
false, the value of w remains true. The final line outputs the
value of (5+6) and (true ? 5 : 10), which is 11 5, making
Option C the correct answer.

*/

public class Que30_IMP
{
}
