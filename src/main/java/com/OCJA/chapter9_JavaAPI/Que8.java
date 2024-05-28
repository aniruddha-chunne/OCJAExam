package com.OCJA.chapter9_JavaAPI;

/**
 * 193 - JavaAPI
 * 595 - Answer
 *
 * 8. What is the output of the following?
 * List<String> museums = new ArrayList<>(1);
 * museums.add("Natural History");
 * museums.add("Science");
 * museums.add("Art");
 * museums.remove(2);
 * System.out.println(museums);
 * A. [Natural History, Science]
 * B. [Natural History, Art, Science]
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * A
 *
 * 8. A. While the ArrayList is declared with an initial capacity of one
 * element, it is free to expand as more elements are added. Each
 * of the three calls to the add() method adds an element to the end
 * of the ArrayList. The remove() method call deletes the element
 * at index 2, which is Art. Therefore, Option A is correct.
 */

public class Que8 {
    public static void main(String[] args) {
        
    }
}
