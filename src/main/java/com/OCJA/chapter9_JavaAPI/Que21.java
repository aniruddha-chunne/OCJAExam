package com.OCJA.chapter9_JavaAPI;

/**
 * 198 - JavaAPI
 * 598 - Answer
 *
 *
 * 21. What is the output of the following?
 * String[] array = {"Natural History", "Science"};
 * List<String> museums = Arrays.asList(array);
 * museums.set(0, "Art");
 * System.out.println(museums.contains("Art"));
 * A. true
 * B. false
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 *
 *21. A. Since we are creating the list from an array, it is a fixed size.
 * We are allowed to change elements. At the end of this code,
 * museums is [Art, Science]. Therefore, it contains Art, and Option
 * A is correct.
 *
 */

public class Que21 {
    public static void main(String[] args) {
        
    }
}
