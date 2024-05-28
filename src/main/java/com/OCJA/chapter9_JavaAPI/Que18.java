package com.OCJA.chapter9_JavaAPI;

/**
 * 196 - JavaAPI
 * 597 - Answer
 *
 * 18. What is the output of the following?
 * String teams = new String("694");
 * teams.concat(" 1155");
 * teams.concat(" 2265");
 * teams.concat(" 2869");
 * System.out.println(teams);
 * A. 694
 * B. 694 1155 2265 2869
 * C. The code compiles but outputs something else.
 * D. The code does not compile.
 *
 * 18. A. Since String is immutable, each call to concat() returns a new
 * object with the new value. However, that return value is ignored
 * and the teams variable never changes in value. Therefore it stays
 * as 694, and Option A is correct.
 */

public class Que18 {
    public static void main(String[] args) {
        
    }
}
