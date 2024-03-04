package com.OCJA.chapter5_loopConstruct;

/**
 * - 110 loop_Construct
 * - 556 Answer
 *
 * 16. What is the output of the following code?
 * package chicago;
 * public class Loop {
 *  private static int count;
 *  private static String[] stops = new String[] {
 * "Washington", "Monroe", "Jackson", "LaSalle" };
 *
 *  public static void main(String[] args)
 *  {
 *          0       4
 *  while (count < stops.length) {
 *  if (stops[count++].length() < 8) {
 *  break;
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
 */

public class Que16
{
    private static int count;
    private static String[] stops = new String[] {"Washington", "Monroe", "Jackson", "LaSalle" };
    public static void main(String[] args) {
        while (count < stops.length) {
            if (stops[count++].length() < 8) {
                break;
            }
        }
        System.out.println(count);

    }
}
