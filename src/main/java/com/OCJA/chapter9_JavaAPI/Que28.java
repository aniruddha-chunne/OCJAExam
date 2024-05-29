package com.OCJA.chapter9_JavaAPI;

/**
 * 200 - JavaAPI
 * 599 - Answer
 *
 * 28. What does the following output?
 * Predicate dash = c -> c.startsWith("‐");
 * System.out.println(dash.test("–"));
 * A. true
 * B. false
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * 28. C. While it is common for a Predicate to have a generic type, it is
 * not required. However, it is treated like a Predicate of type
 * Object if the generic type is missing. Since startsWith() does not
 * exist on Object, the first line does not compile, and Option C is
 * correct
 *
 */

public class Que28 {
    public static void main(String[] args) {
        
    }
}
