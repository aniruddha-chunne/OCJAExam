package com.OCJA.chapter9_JavaAPI;

/**
 * 207 - JavaAPI
 * 602 - Answer
 *
 * 49. What is the output of the following?
 * public class Costume {
 *  public static void main(String[] black) {
 *  String witch = 'b';
 *  String tail = "lack";
 *  witch = witch.concat(tail);
 *  System.out.println(witch);
 *  }
 * }
 * A. b
 * B. black
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * 49. C. The declaration of witch is incorrect. It tries to store a char
 * into a String variable reference. This does not compile, making
 * Option C correct. If this was fixed, the answer would be Option
 * B
 */

public class Que49 {
    public static void main(String[] args) {
        
    }
}
