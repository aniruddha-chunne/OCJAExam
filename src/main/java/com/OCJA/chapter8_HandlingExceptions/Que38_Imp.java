package com.OCJA.chapter8_HandlingExceptions;

/**
 * 182 - Exceptional_Handling
 * 591 - Answer
 *
 * 38. What is the output of the following application?
 * package body;
 * class Organ {
 *  public void operate() throws RuntimeException {
 *  throw new RuntimeException("Not supported");
 *  }
 * }
 * public class Heart extends Organ {
 *  public void operate() throws Exception {
 *  System.out.print("beat");
 *  }
 *  public static void main(String... cholesterol) throws
 * Exception {
 *  try {
 *  new Heart().operate();
 *  } finally {
 *  }
 *  }
 * }
 *
 * A. beat
 * B. Not supported
 * C. The code does not compile.
 * D. The code compiles but a stack trace is printed at runtime.
 *
 * A
 *
 * 38. C. The code does not compile due to an invalid override of the
 * operate() method. An overridden method must not throw any
 * new or broader checked exceptions than the method it inherits.
 * Even though RuntimeException is a subclass of Exception,
 * Exception is considered a new checked exception, since
 * RuntimeException is an unchecked exception. Therefore, the code
 * does not compile, and Option C is correct.
 *
 */

public class Que38_Imp {
    public static void main(String[] args) {
        
    }
}
