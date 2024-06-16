package com.OCJA.chapter7_Inheritance;

/**
 * 161 - Inheritance
 * 580 - Answer
 *
 * 40. What is the output of the following application?
 * class Math {
 *  public final double secret = 2;
 * }
 * class ComplexMath extends Math {
 *  public final double secret = 4;
 * }
 * public class InfiniteMath extends ComplexMath {
 *  public final double secret = 8;
 *  public static void main(String[] numbers) {
 *  Math math = new InfiniteMath();
 *  System.out.print(math.secret);
 *  }
 * }
 * A. 2
 * B. 4
 * C. 8
 * D. The code does not compile.
 *
 * A
 *
 * 40. A. The code compiles without issue, so Option D is incorrect.
 * Java allows methods to be overridden, but not variables.
 * Therefore, marking them final does not prevent them from
 * being reimplemented in a subclass. Furthermore, polymorphism
 * does not apply in the same way it would to methods as it does to
 * variables. In particular, the reference type determines the
 * version of the secret variable that is selected, making the output
 * 2 and Option A the correct answer
 *
 */

class Math {
    public final double secret = 2;
}
class ComplexMath extends Math {
    public final double secret = 4;
}


public class Que40 extends ComplexMath
{
    public final double secret = 8;
    public static void main(String[] args) {

        System.out.println(new ComplexMath().secret);
        System.out.println(new Math().secret );


        Math a =  new Que40();
        System.out.println(a.secret);
    }
}
