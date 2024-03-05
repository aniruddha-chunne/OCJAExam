package com.OCJA.chapter5_loopConstruct;

/**
 * - 118 loop_Construct
 * - 559 Answer
 *
 * 38. What is the output of the following code?
 * package chicago;
 * public class Loop {
 *  private static int count; //1
 *  private static String[] stops = new String[] {  "Washington", "Monroe", "Jackson", "LaSalle" };
 *  public static void main(String[] args) {
 *  while (count < stops.length) {
 *  if (stops[count++].length() < 8) {
 *  continue;
 *  }
 *  }
 *  System.out.println(count);
 *  }
 * }
 * A. 1
 * B. 2
 * C. 4
 * D. The code does not compile.
 *
 * 38. C. The continue statement is useless here since there is no code
 * later in the loop to skip. The continue statement merely resumes
 * execution at the next iteration of the loop, which is what would
 * happen if the if-then statement was empty. Therefore, count
 * increments for each element of the array. The code outputs 4,
 * and Option C is correct.
 */

public class Que38 {
    public static void main(String[] args) {
        
    }
}
