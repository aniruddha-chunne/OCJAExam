package com.OCJA.chapter8_HandlingExceptions;

/**
 *
 * 188 - Exceptional_Handling
 * 594 - Answer
 *
 *
 * 50. What is the output of the following application?
 * package bed;
 * public class Sleep {
 *  public static void snore() {
 *  try {
 *  String sheep[] = new String[3];
 *  System.out.print(sheep[3]);
 *  } catch (RuntimeException e) {
 *  System.out.print("Awake!");
 *  } finally {
 *  throw new Exception(); // x1
 *  }
 *  }
 *  public static void main(String... sheep) { // x2
 *  new Sleep().snore(); // x3
 *  }
 * }
 *
 *
 * A. Awake!, followed by a stack trace
 * B. The code does not compile because of line x1.
 * C. The code does not compile because of line x2.
 * D. The code does not compile because of line x3
 *
 * 50. B. The finally block of the snore() method throws a new
 * checked exception on line x1, but there is no try-catch block
 * around it to handle it, nor does the snore() method declare any
 * checked exceptions. For these reasons, line x1 does not compile,
 * and Option B is the correct answer. The rest of the lines of code
 * compile without issue, even line x3 where a static method is
 * being accessed using an instance reference. Note that the code
 * inside the try block, if it ran, would produce an
 * ArrayIndexOutOfBoundsException, which would be caught by the
 * RuntimeException catch block, printing Awake!. What happens
 * next would depend on how the finally block was corrected.
 *
 */

public class Que50
{
    public static void main(String[] args)
    {
        
    }
}
