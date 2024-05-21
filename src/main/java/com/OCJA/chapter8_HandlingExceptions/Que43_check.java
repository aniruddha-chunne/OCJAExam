package com.OCJA.chapter8_HandlingExceptions;

/**
 * 185 - Exceptional_Handling
 * 592 - Answer
 *
 * package city;
 * public class Street {
 *  public static void dancing() throws RuntimeException {
 *  try {
 *  throw new IllegalArgumentException();
 *  } catch (Error) {
 *  System.out.print("Unable!");
 *  }
 *  }
 *  public static void main(String... count) throws
 * RuntimeException {
 *  dancing();
 *  }
 * }
 * A. Unable!
 * B. The application does not produce any output.
 * C. The application compiles but produces a stack trace at
 * runtime.
 * D. The code does not compile.
 *
 * D
 *
 * 43. D. The code does not compile because the catch block is missing
 * a variable name, such as catch (Error e). Therefore, Option D
 * is the correct answer. If a variable name was added, the
 * application would produce a stack trace at runtime and Option C
 * would be the correct answer. Because IllegalArgumentException
 * does not inherit from Error, the catch block would be skipped
 * and the exception sent to the main() method at runtime. Note
 * that the declaration of RuntimeException by both methods is
 * unnecessary since it is unchecked, although allowed by the
 * compiler.
 *
 */

public class Que43_check
{
    public static void main(String[] args)
    {
        
    }
}
