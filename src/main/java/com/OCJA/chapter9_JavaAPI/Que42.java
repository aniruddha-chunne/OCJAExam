package com.OCJA.chapter9_JavaAPI;

/**
 * 204 - JavaAPI
 * 601 - Answer
 *
 *
 * 42. What does the following output?
 * List<Integer> pennies = new ArrayList<>();
 * pennies.add(3);
 * pennies.add(2);
 * pennies.add(1);
 * pennies.remove(2);
 * System.out.println(pennies);
 * A. [3, 1]
 * B. [3, 2]
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * B
 *
 * 42. B. This one is tricky. There are two remove() methods available
 * on ArrayList. One removes an element by index and takes an
 * int parameter. The other removes an element by value. Due to
 * the generics, it takes an Integer parameter in this example.
 * Since the int primitive is a better match, the element with index
 * 2 is removed, which is the value of 1. Therefore, Option B is
 * correct.
 */

public class Que42 {
    public static void main(String[] args) {
        
    }
}
