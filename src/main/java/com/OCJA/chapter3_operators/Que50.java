package com.OCJA.chapter3_operators;

/*

// 86 - operators
// 546 - Answer

50. What is the output of the following application?
public class Baby {
 public static String play(int toy, int age) {
 final String game;
 if(toy<2)
 game = age > 1 ? 1 : 10; // p1
 else
 game = age > 3 ? "Ball" : "Swim"; // p2
 return game;
 }
 public static void main(String[] variables) {
 System.out.print(play(5,2));
 }
}
A. Ball
B. Swim
C. The code does not compile due to p1.
D. The code does not compile due to p2.

50. C. The key to solving this problem is remembering that the type
of the value returned by a ternary operation is determined by the
expressions on the right-hand side. On line p1, the expressions
are of type int, but the assignment is to the variable game, of type
String. Since the assignment is invalid, the code does not
compile, and Option C is correct

*/

public class Que50
{

}
