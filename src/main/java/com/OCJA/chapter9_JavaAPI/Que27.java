package com.OCJA.chapter9_JavaAPI;

/**
 * 199 - JavaAPI
 * 599 - Answer
 *
 * 27. What is the output of the following?
 * 5: String line = new String("-");
 * 6: String anotherLine = line.concat("-");
 * 7: System.out.print(line == anotherLine);
 * 8: System.out.print(" ");
 * 9: System.out.print(line.length());
 * A. false 1
 * B. false 2
 * C. true 1
 * D. true 2
 *
 * 27. A. A String is immutable so a different object is returned on line
 * 6. The object anotherLine points to is of length 2 after line 6
 * completes. However, the original line reference still points to an
 * object of length 1. Therefore, Option A is correct.
 *
 */

public class Que27 {
    public static void main(String[] args) {
        
    }
}
