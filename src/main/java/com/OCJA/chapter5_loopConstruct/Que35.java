package com.OCJA.chapter5_loopConstruct;

/**
 * - 116 loop_Construct
 * - 559 Answer
 *
 * 35. What is the result of the following when run with java
 * peregrine.TimeLoop September 3 1940?
 * package peregrine;
 * public class TimeLoop {
 *  public static void main(String[] args) {
 *  for (int i = args.length; i>=0; i‐‐)
 *  System.out.println(args[i]);
 *  }
 * }
 * A. September
 * B. 1940
 * C. The code does not compile.
 * D. None of the above
 *
 * 35. D. There are three arguments passed to the program. This
 * means that i is 3 on the first iteration of the loop. The program
 * attempts to print args[3]. Since indexes are zero based in Java,
 * it throws an ArrayIndexOutOfBoundsException.
 */

public class Que35
{
    public static void main(String[] args)
    {

    }
}
