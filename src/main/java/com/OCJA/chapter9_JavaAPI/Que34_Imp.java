package com.OCJA.chapter9_JavaAPI;

/**
 * 202 - JavaAPI
 * 600 - Answer
 *
 * 34. What does the following output?
 * Predicate clear = c -> c.equals("clear");
 * System.out.println(clear.test("pink"));
 * A. true
 * B. false
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * 34. B. While it is common for a Predicate to have a generic type, it is
 * not required. When the generic is omitted, it is treated like a
 * Predicate of type Object. Since the equals() method exists on
 * Object, this is fine. Option B is correct because the Predicate
 * tests as false.
 *
 */

public class Que34_Imp {
    public static void main(String[] args) {
        
    }
}
