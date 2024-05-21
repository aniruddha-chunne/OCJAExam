package com.OCJA.chapter8_HandlingExceptions;

/**
 * 172 - Exceptional_Handling
 * 585 - Answer
 *
 * 12. What is the output of the following application?
 * package game;
 * public class BasketBall {
 *  public static void main(String[] dribble) {
 *  try {
 *  System.out.print(1);
 *  throw new ClassCastException();
 *  } catch (ArrayIndexOutOfBoundsException ex) {
 *  System.out.print(2);
 *  } catch (Throwable ex) {
 *  System.out.print(3);
 *  } finally {
 *  System.out.print(4);
 *  }
 *  System.out.print(5);
 *  }
 * }
 * A. 1345
 * B. 1235
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * A
 *
 * 12. A. The code compiles and runs without issues, so Options C and
 * D are incorrect. The try block throws a ClassCastException.
 * Since ClassCastException is not a subclass of
 * ArrayIndexOutOfBoundsException, the first catch block is
 * skipped. For the second catch block, ClassCastException is a
 * subclass of Throwable, so that block is executed. Afterward, the
 * finally block is executed and then control returns to the main()
 * method with no exception being thrown. The result is that 1345
 * is printed, making Option A the correct answer.
 *
 */

public class Que12 {
    public static void main(String[] args)
    {
        
    }
}
