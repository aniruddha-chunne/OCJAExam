package com.OCJA.chapter5_loopConstruct;

/**
 * - 117 loop_Construct
 * - 559 Answer
 *
 *
 * 36. What is the output of the following?
 * public class Shoelaces {
 *  public static void main(String[] args) {
 *  String tie = null;
 *  while (tie == null)
 *  tie = "shoelace";
 *  System.out.print(tie);
 *  }
 * }
 * A. null
 * B. shoelace
 * C. shoelaceshoelace
 * D. None of the above
 *
 *
 * 36. B. The first time the loop condition is checked, the variable tie
 * is null. The loop body executes, setting tie. Despite the
 * indention, there are no brackets surrounding the loop body so
 * the print does not run yet. Then the loop condition is checked
 * and tie is not null. The print runs after the loop, printing out
 * shoelace once, making Option B correct.
 */

public class Que36 {
    public static void main(String[] args) {
        
    }
}
