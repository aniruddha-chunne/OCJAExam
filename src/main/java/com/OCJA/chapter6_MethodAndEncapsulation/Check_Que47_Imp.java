package com.OCJA.chapter6_MethodAndEncapsulation;

import com.OCJA.chapter1.Que47;

/**
 * 142 - MethodAndEncapsulation
 * 572 - Answer
 *
 *
 * 47. What is the output of the following application?
 * package sports;
 * public class Football {
 *  public static Long getScore(Long timeRemaining) {
 *  return 2*timeRemaining; // m1
 *  }
 *  public static void main(String[] refs) {
 *  final int startTime = 4;
 *  System.out.print(getScore(startTime)); // m2
 *  }
 * }
 * A. 8
 * B. The code does not compile because of line m1.
 * C. The code does not compile because of line m2.
 * D. The code compiles but throws an exception at runtime.
 *
 * A
 *
 */

public class Check_Que47_Imp_Imp {

    public static Long getScore(Long timeRemaining) {
   return 2*timeRemaining; // m1
   }
    public static void main(String[] args)
    {
//            int a= 10;

//            Long b = a;
//            new  Check_Que47_Imp_Imp().getScore(a);
    }
}
