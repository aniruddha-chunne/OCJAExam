package com.OCJA.chapter7_Inheritance;

/**
 * 150 - Inheritance
 * 575 - Answer
 *
16. What is the output of the following application?
package transport;
class Ship {
 protected int weight = 3;
 private int height = 5;
 public int getWeight() { return weight; }
 public int getHeight() { return height; }
}
public class Rocket extends Ship {
 public int weight = 2;
 public int height = 4;
 public void printDetails() {
 System.out.print(super.getWeight()+","+super.height);
 }
 public static final void main(String[] fuel) {
 new Rocket().printDetails();
 }
}
A. 2,5
B. 3,4
C. 3,5
D. The code does not compile.

 16. D. The code does not compile because super.height is not visible
 in the Rocket class, making Option D the correct answer. Even
 though the Rocket class defines a height value, the super
 keyword looks for an inherited version. Since there are none, the
 code does not compile. Note that super.getWeight() returns 3
 from the variable in the parent class, as polymorphism and
 overriding does not apply to instance variables




 */

public class Que16_Imp {
    public static void main(String[] args) {
        
    }
}
