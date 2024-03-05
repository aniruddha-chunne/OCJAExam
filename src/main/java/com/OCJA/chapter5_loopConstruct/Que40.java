package com.OCJA.chapter5_loopConstruct;

/**
 * - 119 loop_Construct
 * - 559 Answer
 *
 * 40. What is the result of the following code?
 * 6: int count = 0;
 * 7: do {
             do
             {
                  count++; //2
             } while (count < 2);
 * 11: break;
 * 12: } while (true);
 * 13: System.out.println(count);
 * A. 2
 * B. 3
 * C. The code does not compile.
 * D. This is an infinite loop.
 *
 *
 * 40. A. At first this code appears to be an infinite loop. However,
 * there is a break statement. On line 6, count is set to 0. On line 9,
 * it is changed to 1. Then the condition on line 10 runs. count is
 * less than 2 so the inner loop continues. Then count is set to 2 on
 * the next iteration of the inner loop. The loop condition on line
 * 10 runs again and this time is false. The inner loop is completed.
 * Then line 11 of the outer loop runs and sends execution to after
 * the loop on line 13. At this point count is still 2, so Option A is
 * correct.
 */

public class Que40 {
    public static void main(String[] args) {
        
    }
}
