package com.OCJA.chapter9_JavaAPI;

/**
 * 204 - JavaAPI
 * 601 - Answer
 *
 * 41. What is the output of the following class?
 * 1: package rocket;
 * 2: public class Countdown {
 * 3: public static void main(String[] args) {
 * 4: StringBuilder builder = new
 * StringBuilder("54321");
 * 5: builder.substring(2);
 * 6: System.out.println(builder.charAt(1));
 * 7: }
 * 8: }
 * A. 1
 * B. 2
 * C. 3
 * D. 4
 *
 * D
 *
 * 41. D. Line 4 creates a StringBuilder of length 5. Pay attention to
 * the substring() method StringBuilder. It returns a String with
 * the value 321. It does not change the StringBuilder itself. Then
 * line 6 is retrieving the second indexed element from that
 * unchanged value, which is 4. Therefore, Option D is correct.
 *
 */

public class Que41_Imp {
    public static void main(String[] args) {

        StringBuilder a =  new StringBuilder("012345");
        a.substring(2);
        System.out.println(a);
    }
}
