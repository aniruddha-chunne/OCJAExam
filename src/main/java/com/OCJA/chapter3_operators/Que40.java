package com.OCJA.chapter3_operators;

/*

// 83 - operators
// 544 - Answer

40. What is the output of the following application?
package transporter;
public class TurtleVsHare {
 public static void main(String[] arguments) {
 int turtle = 10 * (2 + (3 + 2) / 5); //30
 int hare = turtle < 5 ? 10 : 25; //22
 System.out.print(turtle < hare ? "Hare wins!" :
"Turtle wins!");
 }
}
A. Hare wins!
B. Turtle wins!
C. The code does not compile.
D. The code compiles but throws a division by zero error at
runtime

40. B. The code compiles and runs without issue, making Options C
and D incorrect. The key here is understanding operator
precedence and applying the parentheses to override precedence
correctly. The first expression is evaluated as follows: 10 * (2 +
(3 + 2) / 5) → 10 * (2 + 5 / 5) → 10 * (2 + 1) → 10 * 3,
with a final value of 30 for turtle. Since turtle is not less than 5,
a value of 25 is assigned to hare. Since turtle is not less than
hare, the last expression evaluates to Turtle wins!, which is
outputted to the console, making Option B the correct answer

*/

public class Que40
{
    public static void main(String[] args) {

    }
}
