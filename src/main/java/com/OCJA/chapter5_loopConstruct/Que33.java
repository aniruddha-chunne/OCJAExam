package com.OCJA.chapter5_loopConstruct;

/**
 * - 116 loop_Construct
 * - 559 Answer
 *
 * 33. What does the following code output?
 * public static void main(String[] args) {
 *  List<String> bottles = Arrays.asList("glass", "plastic");
 *  for (int type = 0; type < bottles.size();)
 *  System.out.print(bottles.get(type) + ",");
 *  break;
 *  System.out.print("end");
 * }
 * A. glass,end
 * B. glass,plastic,end
 * C. The code does not compile.
 * D. None of the above
 *
 * 33. C. Since there are no brackets around the for statement, the
 * loop body is only one line. The break statement is not in the
 * loop. Since break cannot be used at the top level of a method, the
 * code does not compile, and Option C is correct.
 *
 */

public class Que33 {
    public static void main(String[] args) {
        
    }
}
