package com.OCJA.chapter8_HandlingExceptions;

import java.io.EOFException;
import java.io.IOException;

/**
 * 177 - Exceptional_Handling
 * 588 - Answer
 *
 * 24. What is the output of the following application?
 * package system;
 * public class Computer
 * {
         *  public void compute() throws Exception
         *  {
                throw new RuntimeException("Error processing request");
         *  }
 *  public static void main(String[] bits)
 *  {
             *  try
 *              {
             *  new Computer().compute();
             *  System.out.print("Ping");
             *  }
 *
 *              catch (NullPointerException e)
 *              {
             *  System.out.print("Pong");
             *  throw e;
             *  }
 *  }
 * }
 * A. Ping
 * B. Pong
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 *
 * 24. D. The declaration of Sphere compiles without issue, so Option C
 * is incorrect. The Mars class declaration is invalid because Mars
 * cannot extend Sphere, an interface, nor can Mars implement
 * Planet, a class. In other words, they are reversed. Since the code
 * does not compile, Option D is the correct answer. Note that if
 * Sphere and Planet were swapped in the Mars class definition, the
 * code would compile and the output would be Mars, making
 * Option A the correct answer.
 */

 class CastleUnderSiegeException extends Exception {}

 class KnightAttackingException extends CastleUnderSiegeException {}

public class Que24_Imp
{

    void newthrow() throws CastleUnderSiegeException
    {}
    void lear() throws EOFException
    {

    }
    public static void main(String[] args)
    {
        Que24_Imp a = new Que24_Imp();

            try {
                a.lear();
            } catch (Throwable e) {

            }

            try {
                a.newthrow();
            }
            catch (CastleUnderSiegeException e)
            {
                e.printStackTrace();
            }
    }
}
