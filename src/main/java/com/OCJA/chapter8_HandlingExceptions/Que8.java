package com.OCJA.chapter8_HandlingExceptions;

/**
 * 170 - Exceptional_Handling
 * 585 - Answer
 *
 * 8. If a try statement has catch blocks for both Exception and
 * IOException, then which of the following statements is correct?
 * A. The catch block for Exception must appear before the catch
 * block for IOException.
 * B. The catch block for IOException must appear before the
 * catch block for Exception.
 * C. The catch blocks for these two exception types can be
 * declared in any order.
 * D. A try statement cannot be declared with these two catch
 * block types because they are incompatible.
 *
 * B
 *
 * 8. B. IOException is a subclass of Exception, so it must appear first
 * in any related catch blocks. If Exception was to appear before
 * IOException, then the IOException block would be considered
 * unreachable code because any thrown IOException is already
 * handled by the Exception catch block. For this reason, Option B
 * is correct.
 */

public class Que8 {
    public static void main(String[] args) {
        
    }
}
