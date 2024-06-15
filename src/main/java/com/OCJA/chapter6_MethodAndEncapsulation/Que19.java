package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 131 - MethodAndEncapsulation
 * 565 - Answer
 *
 * 19. What is the best way to call the following method from another
 * class in the same package, assuming the class using the method
 * does not have any static imports?
 * package useful;
 * public class MathHelper {
 *  public static int roundValue(double d) {
 *  // Implementation omitted
 *  }
 * }
 * A. MathHelper:roundValue(5.92)
 * B. MathHelper.roundValue(3.1)
 * C. roundValue(4.1)
 * D. useful.MathHelper.roundValue(65.3
 *
 *B
 *
 * 19. B. Option A is not a valid syntax in Java. Option C would be
 * correct if there was a static import, but the question specifically
 * says there are not any. Option D is almost correct, since it is a
 * way to call the method, but the question asks for the best way to
 * call the method. In that regard, Option B is the best way to call
 * the method, since we are given that two classes are in the same
 * package, therefore the package name would not be required.
 */

public class Que19 {
    public static void main(String[] args) {
        
    }
}
