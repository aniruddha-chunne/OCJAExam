package com.OCJA.chapter3_operators;

/*

// 78 - operators
// 541 - Answer

28. How many 1s are outputted when the following application is
compiled and run?
package city;
public class Road {
 public static void main(String... in) {
 int intersections = 100;
 int streets = 200;
 if (intersections < 150) {
 System.out.print("1");
 } else if (streets && intersections > 1000) {
 System.out.print("2");
 } if (streets < 500)
 System.out.print("1");
 else
 System.out.print("2");
 }
}
A. None
B. One
C. Two
D. The code does not compile.

28. D. The code does not compile, making Option D the correct
answer. The reason the code does not compile is due to the test
in the second if-then statement. The expression (streets &&
intersections > 1000) is invalid because streets is not a
boolean expression and cannot be used as the left-hand side of
the conjunctive logical && operator. The line of code is designed
to resemble the corrected expression (streets > 1000 &&
intersections > 1000. Notice the fixed expression requires two
relational > operators. If the second if-then statement was
corrected, then the application would compile and produce two
1’s, making Option C the correct answer.



*/

public class Que28
{

}
