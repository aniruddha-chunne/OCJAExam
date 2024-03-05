package com.OCJA.chapter5_loopConstruct;

/**
 * - 121 loop_Construct
 * - 560 Answer
 *
 * 47. What is the output of the following?
 * public class Shoelaces {
 *  public static void main(String[] args) {
 *  String tie = null;
 *  while (tie == null);
 *  tie = "shoelace";
 *  System.out.print(tie);
 *  }
 * }
 * A. null
 * B. shoelace
 * C. shoelaceshoelace
 * D. None of the above
 *
 * 47. D. The first time the loop condition is checked, the variable tie
 * is null. However, the loop body is empty due to the semicolon
 * right after the condition. This means the loop condition keeps
 * running with no opportunity for tie to be set. Therefore, this is
 * an infinite loop, and Option D is correct.
 *
 */

public class Que47_Imp {
    public static void main(String[] args) {
        
    }
}
