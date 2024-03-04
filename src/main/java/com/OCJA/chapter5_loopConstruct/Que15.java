package com.OCJA.chapter5_loopConstruct;

/**
 * - 109 loop_Construct
 * - 556 Answer
 *
 * 15. What is the result of the following when run with java
 * peregrine.TimeLoop September 3 1940?
 * package peregrine;
 * public class TimeLoop {
 *  public static void main(String[] args) {
 *  for (int i = args.length; i>=0; i++)
 *  System.out.println("args");
 *  }
 * }
 * A. args
 * B. argsargs
 * C. The code does not compile.
 * D. None of the above
 *
 * 15. D. There are three arguments passed to the program. This
 * means that i is 3 on the first iteration of the loop. The program
 * prints args. Then i is incremented to 4. Which is also greater
 * than or equal to 0. Since i never gets smaller, this code produces
 * an infinite loop and the answer is Option D.
 *
 */

public class Que15 {
    public static void main(String[] args) {
        
    }
}
