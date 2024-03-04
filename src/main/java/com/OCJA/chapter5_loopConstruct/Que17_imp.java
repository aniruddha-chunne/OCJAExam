package com.OCJA.chapter5_loopConstruct;

/**
 * - 111 loop_Construct
 * - 556 Answer
 *
 * 17. What is the result of the following code?
 * do {
 *  int count = 0;
 *  do {
 *  count++;
 *  } while (count < 2);
 *  break;
 * } while (true);
 * System.out.println(count);
 * A. 2
 * B. 3
 * C. The code does not compile.
 * D. This is an infinite loop.
 *
 */

public class Que17_Imp {
    public static void main(String[] args) {

//   do
//           {
//                int count = 0;
//
//                       do
//                       {
//                       count++;
//                       }
//                       while (count < 2);
//           break;
//          };
//   while (true)
//  {
//      System.out.println("count");
//  }
//

        int i = 0;
        do
        {
            System.out.println("one");
            i++;

        }
        while(i < 4);


    }
}
