package com.OCJA.chapter5_loopConstruct;

/**
 * - loop_Construct
 * - Answer
 *
 * 28. What does the following code output?
 * String letters = "";
 * while (letters.length() != 3)
 *  letters+="ab";
 * System.out.println(letters);
 * A. ab
 * B. abab
 * C. The loop completes with no output.
 * D. This is an infinite loop.
 *
 * 28. D. Immediately after letters is initialized, the loop condition is
 * checked. The variable letters is of length 0, which is not equal
 * to 3, so the loop is entered. In the loop body, letters becomes
 * length 2 and contains "ab". The loop index is checked again and
 * now 2 is not equal to 3. The loop is entered and letters becomes
 * length 4 with contents "abab". Then the loop index is checked
 * again. Since the length 4 is not equal to 3, the loop body is
 * entered again. This repeats for 6, 8, 10, etc. The loop never ends,
 * and Option D is correct.
 *
 */

public class Que28 {
    public static void main(String[] args) {
        
    }
}
