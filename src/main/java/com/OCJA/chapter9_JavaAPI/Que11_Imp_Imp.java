package com.OCJA.chapter9_JavaAPI;

/**
 * 193 - JavaAPI
 * 596 - Answer
 *
 *11. What is the output of the following?
 * 5: StringBuilder line = new StringBuilder("-");
 * 6: StringBuilder anotherLine = line.append("-");
 * 7: System.out.print(line == anotherLine);
 * 8: System.out.print(" ");
 * 9: System.out.print(line.length());
 * A. false 1
 * B. false 2
 * C. true 1
 * D. true 2
 *
 *  11. D. A StringBuilder is mutable, so the length is two after line 6
 * completes. The StringBuilder methods return a reference to the
 * same object so you can chain method calls. Therefore, line and
 * anotherLine refer to the same object. This means that line 7
 * prints true. Then on line 9, both references point to the same
 * object of length 2, and Option D is correct.
 *
 *
 *
 */

public class Que11_Imp_Imp {
    public static void main(String[] args) {
        
    }
}
