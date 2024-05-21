package com.OCJA.chapter8_HandlingExceptions;

/**
 * 167 - Exceptional_Handling
 * 584 - Answer
 *
 * 1. What is the result of compiling and executing the following
 * application?
 * package mind;
 * public class Remember {
 *  public static void think() throws Exception
 *  { // k1
         *  try {
         *  throw new Exception();
         *      }
 *  }
 *  public static void main(String... ideas) throws Exception
     *  {
     *  think();
     *  }
 * }
 * A. The code compiles and runs without printing anything.
 * B. The code compiles but a stack trace is printed at runtime.
 * C. The code does not compile because of line k1.
 * D. The code does not compile for another reason.
 *
 * 1. D. A try block must include either a catch or finally block, or
 * both. The think() method declares a try block but neither
 * additional block. For this reason, the code does not compile, and
 * Option D is the correct answer. The rest of the lines compile
 * without issue, including k1.
 */

public class Que1 {
    public static void main(String[] args) {
        
    }
}