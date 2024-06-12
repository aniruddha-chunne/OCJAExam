package com.OCJA.chapter9_JavaAPI;

/**
 * 207 - JavaAPI
 * 602 - Answer
 *
 * 48. What is the output of the following?
 * 12: List<String> magazines = new ArrayList();
 * 13: magazines.add("Readers Digest");
 * 14: magazines.add("People");
 * 15: magazines.clear();
 * 16: magazines.add("The Economist");
 * 17: magazines.remove(1);
 * 18: System.out.println(magazines.size());
 * A. 0
 * B. 1
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * 48. D. Line 12 creates an empty ArrayList. While it isn’t
 * recommended to use generics on only the left side of the
 * assignment operator, this is allowed. It just gives a warning.
 * Lines 13 and 14 add two elements. Line 15 resets to an empty
 * ArrayList. Line 16 adds an element, so now we have an
 * ArrayList of size 1. Line 17 attempts to remove the element at
 * index 1. Since Java uses zero-based indexes, there isn’t an
 * element there and the code throws an
 * IndexOutOfBoundsException.
 *
 *
 *
 *
 */

public class Que48 {
    public static void main(String[] args) {
        
    }
}
