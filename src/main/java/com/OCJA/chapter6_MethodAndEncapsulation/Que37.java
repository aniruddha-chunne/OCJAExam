package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 138 - MethodAndEncapsulation
 * 569 - Answer
 *
 *37. What is the output of the following application?
 * package pet;
 * public class Puppy {
 *  public static int wag = 5; // q1
 *  public void Puppy(int wag) { // q2
 *  this.wag = wag;
 *  }
 *  public static void main(String[] tail) {
 *  System.out.print(new Puppy(2).wag); // q3
 *  }
 * }
 * A. 2
 * B. It does not compile because of line q1.
 * C. It does not compile because of line q2.
 * D. It does not compile because of line q3.
 *
 * D
 *37. D. The Puppy class does not declare a constructor, so the default
 * no-argument constructor is automatically inserted by the
 * compiler. What looks like a constructor in the class is actually a
 * method that has a return type of void. Therefore, the line in the
 * main() method to create the new Puppy(2) object does not
 * compile, since there is no constructor capable of taking an int
 * value, making Option D the correct answer.
 */

public class Que37 {
    public static void main(String[] args) {
        
    }
}
