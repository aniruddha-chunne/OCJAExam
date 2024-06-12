package com.OCJA.chapter9_JavaAPI;

/**
 * 207  - JavaAPI
 * 602  - Answer
 *
 * 50. What is the result of the following?
 * LocalDate xmas = LocalDate.of(2016, 12, 25);
 * xmas.setYear(2017);
 * System.out.println(xmas.getYear());
 * A. 2016
 * B. 2017
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime
 *
 *50. C. The Java 8 date and time classes are immutable. This means
 * they do not contain setter methods and the code does not
 * compile.
 *
 */

public class Que50 {
    public static void main(String[] args) {
        
    }
}
