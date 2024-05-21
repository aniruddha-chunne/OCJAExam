package com.OCJA.chapter8_HandlingExceptions;

/**
 * 187 - Exceptional_Handling
 * 593 - Answer
 *
 *47. What is the output of the following application?
 * package lighting;
 * interface Source {
 *  void flipSwitch() throws Exception;
 * }
 * public class LightBulb implements Source {
 *  public void flipSwitch() {
 *  try {
 *  throws new RuntimeException("Circuit Break!");
 *  } finally {
 *  System.out.print("Flipped!");
 *  }
 *  }
 *  public static void main(String... electricity) throws
 * Throwable {
 *  final Source bulb = new LightBulb();
 *  bulb.flipSwitch();
 *  }
 * }
 * A. A stack trace for a RuntimeException
 * B. Flipped!, followed by a stack trace for a RuntimeException
 * C. The code does not compile because flipSwitch() is an
 * invalid method override.
 * D. The code does not compile for another reason.
 *
 * 47. D. The question is designed to see how closely you pay attention
 * to throw and throws! The try block uses the incorrect keyword,
 * throws, to create an exception. For this reason, the code does not
 * compile, and Option D is correct. If throws was changed to
 * throw, then the code would compile without issue, and Option B
 * would be correct
 */

public class Que47
{
    public static void main(String[] args)
    {

    }
}
