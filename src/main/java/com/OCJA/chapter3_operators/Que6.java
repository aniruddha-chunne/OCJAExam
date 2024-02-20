package com.OCJA.chapter3_operators;

/*

// 70 - operators
// 538 - Answer

6. What is the value of thatNumber after the execution of the
following code snippet?
long thatNumber = 5 >= 5 ? 1+2 : 1*1;
if(++thatNumber < 4)
 thatNumber += 1;
A. 3
B. 4
C. 5
D. The answer cannot be determined until runtime.

6. B. The initial assignment of thatNumber follows the first branch
of the ternary expression. Since 5 >= 5 evaluates to true, a value
of 3 is assigned to thatNumber. In the next line, the pre-increment
operator increments the value of thatNumber to 4 and returns a
value of 4 to the expression. Since 4 < 4 evaluates to false, the
if-then block is skipped. This leaves the value of thatNumber as 4,
making Option B the correct answer.

*/
public class Que6
{

}
