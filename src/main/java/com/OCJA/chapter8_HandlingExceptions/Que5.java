package com.OCJA.chapter8_HandlingExceptions;

/**
 * 169- Exceptional_Handling
 * 584 - Answer
 *
 * 5. What is the output of the following application?
 * package game;
 * public class Baseball
 * {
         *  public static void main(String... teams)
 *          {
                 *  try {
                 *  int score = 1;
                 *  System.out.print(score++);
                 *  }
 *                  catch (Throwable t) {
                 *  System.out.print(score++);
                 *  }
 *                  finally {
                 *  System.out.print(score++);
                 *  }
         *  System.out.print(score++);
         *  }
 * }
 * A. 123
 * B. 124
 * C. 12
 * D. None of the above
 *
 * A
 *
 * 5. D. The application does not compile because score is defined
 * only within the try block. The other three places it is referenced,
 * in the catch block, in the finally block, and outside the trycatch-finally block at the end, are not in scope for this variable
 * and each does not compile. Therefore, the correct answer is
 * Option D
 *
 */

public class Que5 {
    public static void main(String[] args) {
        
    }
}
