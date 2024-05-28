package com.OCJA.chapter9_JavaAPI;

/**
 *
 * 197 - JavaAPI
 * 598 - Answer
 *
 * 20. Which of the answer choices results in a different value being
 * output than the other three choices?
 * StringBuilder sb = new StringBuilder("radical ");
 * sb = ________________________;
 * System.out.print(sb);
 * A. new StringBuilder("radical ")
 * .append("robots")
 * B. new StringBuilder("radical ")
 * .delete(1, 100)
 * .append("obots")
 * .insert(1, "adical r")
 * C. new StringBuilder("radical ")
 * .insert(7, "robots")
 * D. new StringBuilder("radical ")
 * .insert(sb.length(), "robots"
 *
 * 20. C. Option A is straightforward and outputs radical robots.
 * Option B does the same in a convoluted manner. First Option B
 * removes all the characters after the first one. It doesn’t matter
 * that there aren’t actually 100 characters to delete. Then it
 * appends obots to the end, making the builder contain robots.
 * Finally, it inserts the remainder of the string immediately after
 * the first index. Try drawing the flow if this is hard to envision.
 * Option D also creates the same value by inserting robots
 * immediately after the end of the StringBuilder. Option C is
 * close, but it has an off-by-one error. It inserts robots after the
 * letter l rather than after the space. This results in the value
 * radicalrobots followed by a sp
 */

public class Que20 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("radical ")
                .delete(1, 100)
                .append("obots")
                .insert(1, "adical r");

        System.out.println(s);

                StringBuilder sb =  new StringBuilder("radical ")
                .insert(7, "robots");
        System.out.println(sb);

        StringBuilder len = new StringBuilder("radical ");
         len = new StringBuilder("radical ")
                .insert(sb.length(), "robots");

        System.out.println(len);

    }
}
