package com.OCJA.chapter5_loopConstruct;

/**
 * - 118 loop_Construct
 * - 559 Answer
 *
 * 39. What is the output of the following?
 * StringBuilder builder = new StringBuilder();
 * String str = new String("Leaves growing");
 * do {
 *  System.out.println(str);
 * } while (builder);
 * System.out.println(builder);
 * A. Leaves growing
 * B. This is an infinite loop.
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * 39. C. A do-while loop requires a boolean condition. The builder
 * variable is a StringBuilder and not a boolean. The code does not
 * compile, and Option C is correct.
 *
 */

public class Que39
{
    public static void main(String[] args)
    {

    }
}
