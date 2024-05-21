package com.OCJA.chapter8_HandlingExceptions;

/**
 * 180 - Exceptional_Handling
 * 591 - Answer
 *
 * 36. If a try statement has catch blocks for both ClassCastException
 * and RuntimeException, then which of the following statements is
 * correct?
 * A. The catch block for ClassCastException must appear before
 * the catch block for RuntimeException.
 * B. The catch block for RuntimeException must appear before
 * the catch block for ClassCastException.
 * C. The catch blocks for these two exception types can be
 * declared in any order.
 * D. A try statement cannot be declared with these two catch
 * block types because they are incompatible.
 *
 *
 * 36. A. ClassCastException is a subclass of RuntimeException, so it
 * must appear first in any related catch blocks. If
 * RuntimeException was to appear before ClassCastException, then
 * the ClassCastException block would be considered unreachable
 * code, since any thrown ClassCastException is already handled
 * by the RuntimeException catch block. For this reason, Option A
 * is correct.
 */

public class Que36 {
    public static void main(String[] args) {
        
    }
}
