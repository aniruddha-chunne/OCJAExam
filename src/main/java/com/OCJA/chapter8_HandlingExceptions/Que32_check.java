package com.OCJA.chapter8_HandlingExceptions;

/**
 * 180 - Exceptional_Handling
 * 590 - Answer
 *
 * package zoo;
 * class BigCat
 * {
 *  void roar(int level) throw RuntimeException
         *  { // m1
         *  if(level<3)
 *              throw new IllegalArgumentException("Incomplete");
         *  System.out.print("Roar!");
         *  }
 * }
 * public class Lion extends BigCat
 * {
                 *  public void roar()
         *          { // m2
                 *  System.out.print("Roar!!!");
                 *  }
 *
                 *  public static void main(String[] cubs)
         *          {
                 *  final BigCat kitty = new Lion(); // m3
                 *  kitty.roar(2);
                 *  }
 * }
 *
 * A. The code does not compile because of line m1.
 * B. The code does not compile because of line m2.
 * C. The code does not compile because of line m3.
 * D. The code compiles but a stack trace is printed at runtime.
 *
 * A
 *
 * 32. A. The application does not compile because the roar() method
 * in the BigCat class uses throw instead of throws, making Option
 * A the correct answer. Note that if the correct keyword was used,
 * the code would compile without issues, and Option D would be
 * correct. Also the override of roar() in the Lion class is valid,
 * since the overridden method has a broader access modifier and
 * does not declare any new or broader checked exceptions.
 *
 */

public class Que32_check
{
    public static void main(String[] args)
    {

    }
}
