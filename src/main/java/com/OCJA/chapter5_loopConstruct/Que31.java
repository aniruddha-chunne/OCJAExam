package com.OCJA.chapter5_loopConstruct;

/**
 * - 115 loop_Construct
 * - 558 Answer
 *
 * 31. What is the result of the following?
 * int k = 0;
 * for (int i = 10; i > 0; i‐‐) {
 *  while (i > 3) i ‐= 3;
 *  k += 1;
 * }
 * System.out.println(k);
 * A. 1
 * B. 2
 * C. 3
 * D. 4
 *
 * 31. A. On the first iteration of the outer loop, i starts out at 10. The
 * inner loop sees that 10 > 3 and subtracts 3, making the 7 the
 * new value of i. Since 7 > 3, we subtract 3 again, making i set to
 * 4. Yet again 4 > 3, so i becomes 1. Then k is finally incremented
 * to 1. The outer loop decrements i i, making it 0. The boolean
 * condition sees that 0 is not greater than 0. The outer loop ends
 * and 1 is printed out. Therefore, Option A is correct.
 */

public class Que31 {
    public static void main(String[] args)
    {

    }
}
