package com.OCJA.chapter8_HandlingExceptions;

/**
 * 170 - Exceptional_Handling
 * 585 - Answer
 *
 * 9. What is the output of the following application?
 * package game;
 * public class Football {
 *  public static void main(String officials[]) {
 *  try {
 *  System.out.print('A');
 *  throw new RuntimeException("Out of bounds!");
 *  } catch (ArrayIndexOutOfBoundsException aioobe) {
 *  System.out.print('B');
 *  throw t;
 *  } finally {
 *  System.out.print('C');
 *  }
 *  }
 * }
 *
 * A. ABC
 * B. ABC, followed by a stack trace for a RuntimeException
 * C. AC, followed by a stack trace for a RuntimeException
 * D. None of the above
 *
 * C
 *
 * 9. C. The application first enters the try block and outputs A. It
 * then throws a RuntimeException, but the exception is not caught
 * by the catch block since RuntimeException is not a subclass of
 * ArrayIndexOutOfBoundsException (it is a superclass). Next, the
 * finally block is called and C is output. Finally, the
 * RuntimeException is thrown by the main() method and a stack
 * trace is printed. For these reasons, Option C is correct.
 */

public class Que9
{
    public static void main(String[] args) {
        
    }
}
