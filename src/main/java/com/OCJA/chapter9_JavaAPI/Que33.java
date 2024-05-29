package com.OCJA.chapter9_JavaAPI;

/**
 * 201 - JavaAPI
 * 599  - Answer
 *
 * 33. What is the output of the following?
 * 1: public class Legos {
 * 2: public static void main(String[] args) {
 * 3: StringBuilder sb = new StringBuilder();
 * 4: sb.append("red");
 * 5: sb.deleteCharAt(0);
 * 6: sb.delete(1, 2);
 * 7: System.out.println(sb);
 * 8: }
 * 9: }
 * A. e
 * B. d
 * C. ed
 * D. None of the above
 *
 *  A
 *
 *  33. A. Line 3 creates an empty StringBuilder. Line 4 adds three
 * characters to it. Line 5 removes the first character, resulting in
 * ed. Line 6 deletes the characters starting at position 1 and ending
 * right before position 2, which removes the character at index 1,
 * which is d. The only character left is e, so Option A is correct.
 *
 */

public class Que33 {
    public static void main(String[] args)
    {
         StringBuilder sb = new StringBuilder();
            sb.append("red");
            sb.deleteCharAt(0);
            sb.delete(1, 2);

        System.out.println(sb);



    }
}
