package com.OCJA.chapter8_HandlingExceptions;

/**
 * 176 - Exceptional_Handling
 * 587 - Answer
 * package castles;
 * class CastleUnderSiegeException extends Exception {}
 *
 * class KnightAttackingException extends CastleUnderSiegeException {}
 *
 *
 * public class Citadel {
 *  public void openDrawbridge() throws RuntimeException {
 * // q1
 * 		 try
 * 		          {
 * 		 throw new KnightAttackingException();
 *         }
 *
 * 		 catch (Exception e)
 *         {
 * 		 throw new ClassCastException();
 *         }
 *
 * 		 finally
 *         {
 * 		 throw new CastleUnderSiegeException(); // q2
 *         }
 *
 *  }
 *
 *  public static void main(String[] moat) {
 *  new Citadel().openDrawbridge(); // q3
 *
 *A. The code does not compile because of line q1.
 * B. The code does not compile because of line q2.
 * C. The code does not compile because of line q3.
 * D. The code compiles, but a stack trace is printed at runtime.
 *
 * B
 *
 * 22. B. The application does not compile, so Option D is incorrect.
 * The checked KnightAttackingException thrown in the try block
 * is handled by the associated catch block. The
 * ClassCastException is an unchecked exception, so it is not
 * required to be handled or declared and line q1 compiles without
 * issue. The finally block throws a checked
 */

class CastleUnderSiegeException1 extends Exception {}
class KnightAttackingException1 extends
        CastleUnderSiegeException1 {}

public class Que22_Imp
{

    public void openDrawbridge() throws Exception {
// q1
        try {
            throw new KnightAttackingException1();
        } catch (Exception e) {
//            throw new Exception();
            throw new CastleUnderSiegeException1();
        } finally {
            throw new Exception(); // q2
        }
    }

    public static void main(String[] args)
    {

    }
}
