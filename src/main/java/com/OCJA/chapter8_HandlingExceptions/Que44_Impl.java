package com.OCJA.chapter8_HandlingExceptions;

/**
 * 185 - Exceptional_Handling
 * 592 - Answer
 *
 * 44. What is the result of compiling and running the following
 * application?
 * package castles;
 * class DragonException extends Exception {}
 * public class Lair {
 *  public void openDrawbridge() throws Exception { // r1
 *  try {
 *  throw new Exception("This Exception");
 *  } catch (RuntimeException e) {
 *  throw new DragonException(); // r2
 *  } finally {
 *  throw new RuntimeException("Or maybe this one");
 *  }
 *  }
 *  public static void main(String[] moat) throws Exception
 * {
 *  new Lair().openDrawbridge(); // r3
 *  }
 * }
 * A. The code does not compile because of line r1.
 * B. The code does not compile because of line r2.
 * C. The code does not compile because of line r3.
 * D. The code compiles, but a stack trace is printed at runtime.
 *
 * C
 *
 * 44. D. The openDrawbridge() is capable of throwing a variety of
 * exceptions, including checked Exception and DragonException as
 * well as an unchecked RuntimeException. All of these are handled
 * by the fact that the method declares the checked Exception class
 * in the method signature, which all the exceptions within the
 * class inherit. For this reason, the openDrawbridge() method
 * compiles without issue. The call to openDrawbridge() in the
 * main() method also compiles without issue because the main()
 * method declares Exception in its signature. For these reasons,
 * the code compiles but a stack trace is printed at runtime, making
 * Option D the correct answer. In case you are wondering, the
 * caller would see RuntimeException: Or maybe this one in the
 * stack trace at runtime, since the exception in the finally block
 * replaces the one from the try block. Note that the exception in
 * the catch block is never reached because the RuntimeException
 * type declared in the catch block does not handle Exception.
 */

public class Que44_Impl {
    public static void main(String[] args) {
        
    }
}
