package com.OCJA.chapter5_loopConstruct;

/**
 * - 117 loop_Construct
 * - 559 Answer
 *
 * 37. The following code outputs a single letter x. What happens if you
 * remove lines 25 and 28?
 * 23: String race = "";
 * 24: loop:
 * 25: do {
 * 26: race += "x";
 * 27: break loop;
 * 28: } while (true);
 * 29: System.out.println(race);
 * A. It prints an empty string.
 * B. It still outputs a single letter x.
 * C. It no longer compiles.
 * D. It becomes an infinite loop
 *
 *
 * 37. C. The code compiles as is. However, we aren’t asked about
 * whether the code compiles as is. Line 27 refers to a loop label.
 * While the label is still present, it no longer points to a loop. This
 * causes the code to not compile, and Option C is correct
 *
 */

public class Que37_Imp {
    public static void main(String[] args) {

        loop:
        do
        {
            System.out.println("race");
              break loop;
        }
        while(true);
        System.out.println("End");
    }
}
