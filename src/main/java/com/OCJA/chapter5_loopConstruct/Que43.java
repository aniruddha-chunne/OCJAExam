package com.OCJA.chapter5_loopConstruct;

/**
 * - 120 loop_Construct
 * - 560 Answer
 *
 * 43. How many lines does the following code output?
 *  import java.util.*;
 *  public class Exams {
 *  public static void main(String[] args) {
 *  List<String> exams = Arrays.asList("OCA", "OCP");
 *  for (String e1 : exams)
 *  for (String e2 : exams)
 *  System.out.println(e1 + " " + e2);
 *  }
 * }
 * A. One
 * B. Four
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 *
 * 43. B. Looping through the same list multiple times is allowed. The
 * outer loop executes twice. The inner loop executes twice for each
 * of those iterations of the outer loop. Therefore, the inner loop
 * executes four times, and Option B is correct.
 */

public class Que43
{
    public static void main(String[] args)
    {
        
    }
}
