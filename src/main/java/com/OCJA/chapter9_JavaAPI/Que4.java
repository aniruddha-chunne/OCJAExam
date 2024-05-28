package com.OCJA.chapter9_JavaAPI;

/**
 * 191 - JavaAPI
 * 595 - Answer
 *
 * 4. What is the output of the following?
 * StringBuilder teams = new StringBuilder("333");
 * teams.append(" 806");
 * teams.append(" 1601");
 * System.out.print(teams);
 * A. 333
 * B. 333 806 1601
 * C. The code compiles but outputs something else.
 * D. The code does not compile.
 *
 * B
 *
 * 4. B. Since StringBuilder is mutable, each call to append adds to the
 * value. When calling print, toString() is automatically called
 *
 */

public class Que4 {
    public static void main(String[] args) {
        
    }
}
