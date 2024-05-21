package com.OCJA.chapter8_HandlingExceptions;

/**
 * 186 - Exceptional_Handling
 * 592 - Answer
 *
 * 45. If a try statement has catch blocks for both
 * IllegalArgumentException and ClassCastException, then which
 * of the following statements is correct?
 * A. The catch block for IllegalArgumentException must appear
 * before the catch block for ClassCastException.
 * B. The catch block for ClassCastException must appear before
 * the catch block for IllegalArgumentException.
 * C. The catch blocks for these two exception types can be
 * declared in any order.
 * D. A try statement cannot be declared with these two catch
 * block types because they are incompatible.
 *
 * C
 *
 * 45. C. Both IllegalArgumentException and ClassCastException
 * inherit RuntimeException, but neither is a subclass of the other.
 * For this reason, they can be listed in either order, making
 * Option C the correct statement.
 *
 */

public class Que45 {
    public static void main(String[] args) {
        
    }
}
