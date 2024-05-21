package com.OCJA.chapter8_HandlingExceptions;

/**
 * 174 - Exceptional_Handling
 * 587 - Answer
 *
 * 17. What is the output of the following application?
 * package harbor;
 * class CapsizedException extends Exception {}
 * class Transport {
 *  public int travel() throws CapsizedException { return 2;
 * };
 * }
 * public class Boat {
 *  public int travel() throws Exception { return 4; }; //
 * j1
 *  public static void main(String... distance) throws
 * Exception{
 *  try {
 *  System.out.print(new Boat().travel());
 *  } catch (Exception e) (
 *  System.out.print(8);
 *  )
 *  }
 * }
 * A. 4
 * B. 8
 * C. The code does not compile due to line j1.
 * D. The code does not compile for another reason.
 *
 * 17. D. The code does not compile because the catch block uses
 * parentheses () instead of brackets {}, making Option D the
 * correct answer. Note that Boat does not extend Transport, so
 * while the override on line j1 appears to be invalid since
 * Exception is a broader checked exception than
 * CapsizedException, that code compiles without issue. If the
 * catch block was fixed, the code would output 4, making Option A
 * the correct answer.
 *
 *
 */

public class Que17 {
    public static void main(String[] args) {
        
    }
}
