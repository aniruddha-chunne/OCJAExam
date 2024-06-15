package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 132 - MethodAndEncapsulation
 * 566 - Answer
 *
 * 21. How many final modifiers would need to be removed for this
 * application to compile?
 * package end;
 * public final class Games {
 *  public final static int finish(final int score) {
 *  final int win = 3;
 *  final int result = score++ < 5 ? 2 : win;
 *  return result+=win;
 *  }
 *  public static void main(final String[] v) {
 *  System.out.print(finish(Integer.parseInt(v[0])));
 *  }
 * }
 * A. None
 * B. One
 * C. Two
 * D. The code will not compile regardless of the number of final
 * modifiers that are removed.
 *
 * 21. C. The finish() method modifies two variables that are marked
 * final, score and result. The score variable is modified by the
 * post-increment ++ operator, while the result variable is
 * modified by the compound addition += operator. Removing both
 * final modifiers allows the code to compile. For this reason,
 * Option C is the correct answer.
 *
 *
 */

public class Que21_Imp
{
    public static void main(String[] args)
    {
        
    }
}
