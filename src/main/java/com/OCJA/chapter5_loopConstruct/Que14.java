package com.OCJA.chapter5_loopConstruct;

/**
 * - 109 loop_Construct
 * - 555 Answer
 *
 *
 * 14. What does the following code output?
 * String letters = "";
 * while (letters.length() != 2)
 *  letters+="a";
 * System.out.println(letters);
 * A. aa
 * B. aaa
 * C. The loops complete with no output.
 * D. This is an infinite loop.
 *
 *
 * 14. A. Immediately after letters is initialized, the loop condition is
 * checked. The variable letters is of length 0, which is not equal
 * to 2 so the loop is entered. In the loop body, letters becomes
 * length 1 with contents "a". The loop index is checked again and
 * now 1 is not equal to 2. The loop is entered and letters becomes
 * length 2 and contains "aa". Then the loop index is checked
 * again. Since the length is now 2, the loop is completed and aa is
 * output. Option A is correct.
 *
 *
 */

public class Que14 {
    public static void main(String[] args) {
        
    }
}
