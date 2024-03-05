package com.OCJA.chapter5_loopConstruct;

/**
 * - 121 loop_Construct
 * - 561 Answer
 *
 * 49. What is the output of the following?
 * boolean baloonInflated = false;
 * do
 * {
 *          if (!baloonInflated)
           {
                   baloonInflated = true;
                   System.out.print("inflate-");
           }
 * } while (baloonInflated);
 * System.out.println("done");
 * A. done
 * B. inflate-done
 * C. The code does not compile.
 * D. This is an infinite loop.
 *
 * 49. D. On the first iteration of the loop, the if statement executes
 * printing inflate-. Then the loop condition is checked. The
 * variable baloonInflated is true, so the loop condition is true and
 * the loop continues. The if statement no longer runs, but the
 * variable never changes state again, so the loop doesn’t end.
 *
 */

public class Que49 {
    public static void main(String[] args) {
        
    }
}
