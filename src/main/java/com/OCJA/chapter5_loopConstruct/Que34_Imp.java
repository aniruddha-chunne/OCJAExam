package com.OCJA.chapter5_loopConstruct;

/**
 * - 116 loop_Construct
 * - 559 Answer
 *
 * 34. What is the result of the following?
 * String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
 * String[] times = new String[] { "Day", "Night" };
 * for (int i = 0, j = 0; i < nycTourLoops.length
 *  && j < times.length; i++; j++)
 * {
 *  System.out.print(nycTourLoops[i] + " " + times[j] + "-");
 * }
 * A. Downtown Day-
 * B. Downtown Day-Uptown Night-
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 *34. C. Multiple update expressions are separated with a comma
 * rather than a semicolon. Tricky, we know. But it is an important
 * distinction. This makes Option C correct
 */

public class Que34_Imp {
    public static void main(String[] args) {
        
    }
}
