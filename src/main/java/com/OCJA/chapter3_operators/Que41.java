package com.OCJA.chapter3_operators;

/*

// 83 - operators
// 545 - Answer

41. What is the output of the following application?
public class CountEntries {
 public static int getResult(int threshold) {
 return threshold > 5 ? 1 : 0;
 }
 public static final void main(String[] days) {
 System.out.print(getResult(5)+getResult(1)
 +getResult(0)+getResult(2)+"");
 }
}
A. 0
B. 1
C. 0000
D. 1000

41. A. All of the terms of getResult() in this question evaluate to 0,
since they are all less than or equal to 5. The expression can
therefore be reduced to 0+0+0+0+"". Since Java evaluates the +
operator from left to right, the four operands on the left are
applied using numeric addition, resulting in the expression 0+"".
This expression just converts the value to a String, resulting in
an output of 0, making Option A the correct answer.


*/

public class Que41
{
}
