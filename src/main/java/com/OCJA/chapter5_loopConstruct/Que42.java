package com.OCJA.chapter5_loopConstruct;

/**
 * - 119 loop_Construct
 * - 560 Answer
 *
 * 42. What is the result of the following?
 * String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
 * String[] times = new String[] { "Day", "Night" };
 * for (int i = 0, j = 0; i < nycTourLoops.length
 *  && j < times.length; i++, j++)
 * {
 *  System.out.print(nycTourLoops[i] + " " + times[j] + "-");
 * }
 * A. Downtown Day
 * B. Downtown Day-Uptown Night
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * 42. B. This code is correct. It initializes two variables and uses both
 * variables in the condition check and the update statements.
 * Since it checks the size of both arrays correctly, it prints the first
 * two sets of elements, and Option B is correct.
 *
 */

public class Que42
{
    public static void main(String[] args)
    {
        
    }
}
