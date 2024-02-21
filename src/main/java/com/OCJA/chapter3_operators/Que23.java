package com.OCJA.chapter3_operators;

/*

// 76 - operators
// 540 - Answer

23. What is the output of the following application?
package transporter;
public class Rematerialize {
 public static void main(String[] input) {
 int dog = 11;
 int cat = 3;
 int partA = dog / cat;
 int partB = dog % cat;
 int newDog = partB + partA * cat;
 System.out.print(newDog);
 }
}
A. 9
B. 11
C. 15
D. The code does not compile.

3. B. The code compiles without issue, making Option D incorrect.
The focus of this question is showing how the division and
modulus of two numbers can be used to reconstitute one of the
original operands. In this example, partA is the integer division
of the two numbers. Since 3 does not divide 11 evenly, it is
rounded down to 3. The variable partB is the remainder from the
first expression, which is 2. The newDog variable is an expression
that reconstitutes the original value for dog using the division
value and the remainder. Note that due to operator precedence,
the multiplication * operation is evaluated before the addition +
operation. The result is the original value of 11 for dog is
outputted by this program.


*/
public class Que23
{

}
