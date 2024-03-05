package com.OCJA.chapter5_loopConstruct;

/**
 * - loop_Construct
 * - Answer
 *
 * 48. What is the output of the following?
 * 12: int result = 8;
 * 13: for: while (result > 7) {
 * 14: result++;
 * 15: do {
 * 16: result--;
 * 17: } while (result > 5);
 * 18: break for;
 * 19: }
 * 20: System.out.println(result);
 * A. 5
 * B. 8
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 *
 * 48. C. Remember to look for basic errors before wasting time
 * tracking the flow. In this case, the label of the loop is trying to
 * use the keyword for. This is not allowed, so the code does not
 * compile. If the label was valid, Option A would be correct.
 *
 */

public class Que48_Imp {
    public static void main(String[] args) {
        
    }
}
