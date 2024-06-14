package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 125 - MethodAndEncapsulation
 * 562 - Answer
 *
 * 4. What is true about the following program?
 * package figures;
 * public class Dolls {
 *  public void nested() { nested(2,true); } // g1
 *  public int nested(int level, boolean height) { return
 * nested(level); }
 *  public int nested(int level) { return level+1; }; // g2
 *  public static void main(String[] outOfTheBox) {
 *  System.out.print(new Dolls().nested());
 *  }
 * }
 * A. It compiles successfully and prints 3 at runtime.
 * B. It does not compile because of line g1.
 * C. It does not compile because of line g2.
 * D. It does not compile for some other reason.
 *
 * 4. D. The three overloaded versions of nested() compile without
 * issue, since each method takes a different set of input
 * arguments, making Options B and C incorrect. The code does
 * not compile, though, due to the first line of the main() method,
 * making Option A incorrect. The no-argument version of the
 * nested() method does not return a value, and trying to output a
 * void return type in the print() method throws an exception at
 * runtime.
 */

public class Que4_Imp
{
    public static void main(String[] args)
    {
        
    }
}
