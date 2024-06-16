package com.OCJA.chapter7_Inheritance;

/**
 * 158 - Inheritance
 * 579 - Answer
 *
 * 31. Which statement about the following class is correct?
 * package shapes;
 * abstract class Parallelogram {
 *  private int getEqualSides() {return 0;}
 * }
 * abstract class Rectangle extends Parallelogram {
 *  public static int getEqualSides() {return 2;} // x1
 * }
 * public final class Square extends Rectangle {
 *  public int getEqualSides() {return 4;} // x2
 *  public static void main(String[] corners) {
 *  final Square myFigure = new Square(); // x3
 *  System.out.print(myFigure.getEqualSides());
 *  }
 * }
 * A. The code does not compile due to line x1.
 * B. The code does not compile due to line x2.
 * C. The code does not compile due to line x3.
 * D. The code compiles and runs without issue
 *
 * D
 *
 * 31. B. The code does not compile, so Option D is incorrect. The issue
 * here is that the override of getEqualSides() in Square is invalid.
 * A static method cannot override a non-static method and vice
 * versa. For this reason, Option B is the correct answer.
 */

public class Que31 {
    public static void main(String[] args) {
        
    }
}
