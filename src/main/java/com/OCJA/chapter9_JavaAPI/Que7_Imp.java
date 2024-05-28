package com.OCJA.chapter9_JavaAPI;

/**
 * 192 - JavaAPI
 * 595 - Answer
 *
 * 7. What is the result of the following code?
 * StringBuilder sb = new StringBuilder("radical")
 *  .insert(sb.length(), "robots");
 * System.out.println(sb);
 * A. radicarobots
 * B. radicalrobots
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * c
 *
 * 7. C. Calling the constructor and then insert() is an example of
 * method chaining. However, the sb.length() call is a problem.
 * The sb reference doesn’t exist until after the chained calls
 * complete. Just because it happens to be on a separate line
 * doesn’t change when the reference is created. Since the code
 * does not compile, Option C is correct.
 *
 */

public class Que7_Imp {
    public static void main(String[] args) {
        
    }
}
