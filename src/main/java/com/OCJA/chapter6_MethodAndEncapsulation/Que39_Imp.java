package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 138 - MethodAndEncapsulation
 * 569 - Answer
 *
 * 39. What is the output of the following application?
 * package ship;
 * public class Phone {
 *  private int size;
 *  public Phone(int size) {this.size=size;}
 *  public static void sendHome(Phone p, int newSize) {
 *  p = new Phone(newSize);
 *  p.size = 4;
 *  }
 *  public static final void main(String... params) {
 *  final Phone phone = new Phone(3);
 *  sendHome(phone,7);
 *  System.out.print(phone.size);
 *  }
 * }
 * A. 3
 * B. 4
 * C. 7
 * D. The code does not compile.
 *
 * A
 *
 *
 * 39. A. The code compiles without issue, so Option D is incorrect.
 * The key here is that Java uses pass by value to send object
 * references to methods. Since the Phone reference p was
 * reassigned in the first line of the sendHome() method, any
 * changes to the p reference were made to a new object. In other
 * words, no changes in the sendHome() method affected the object
 * that was passed in. Therefore, the value of size was the same
 * before and after the method call, making the output 3 and
 * Option A the correct answe
 */

public class Que39_Imp {
    public static void main(String[] args)
    {

    }
}
