package com.OCJA.chapter5_loopConstruct;

/**
 * - 109 loop_Construct
 * - 555 Answer
 *
 * 13. What does the following code output?
 * public static void main(String[] args) {
 *  List<String> bottles = Arrays.asList("glass", "plastic");
 *  for (int type = 0; type < bottles.size();) {
 *  System.out.print(bottles.get(type) + ",");
 *  break;
 *  }
 *  System.out.print("end");
 * }
 * A. glass,end
 * B. glass,plastic,end
 * C. The code does not compile.
 * D. None of the above
 *
 * 13. A. The first time through the loop, the index is 0 and glass, is
 * output. The break statement then skips all remaining executions
 * on the loop and the main() method ends. If there was no break
 * keyword, this would be an infinite loop because there’s no
 * incrementor.
 *
 */

public class Que13 {
    public static void main(String[] args) {
        
    }
}
