package com.OCJA.chapter8_HandlingExceptions;

/**
 * 183 - Exceptional_Handling
 * 591 - Answer
 *
 * 40. What is the output of the following application?
 * package clothing;
 * public class Coat {
 *  public Long zipper() throws Exception {
 *  try {
 *  String checkZipper = (String)new Object();
 *  } catch (Exception e) {
 *  throw RuntimeException("Broken!");
 *  }
 *  return null;
 *  }
 *  public static void main(String... warmth) {
 *  try {
 *  new Coat().zipper();
 *  System.out.print("Finished!");
 *  } catch (Throwable t) {}
 *  }
 * }
 * A. Finished!
 * B. Finished!, followed by a stack trace
 * C. The application does not produce any output at runtime.
 * D. The code does not compile
 *
 * B
 *
 * 40. D. In this application, the throw RuntimeException(String)
 * statement in the zipper() method does not include the new
 * keyword. The new keyword is required to create the object being
 * thrown, since RuntimeException(String) is a constructor. For
 * this reason, the code does not compile, and Option D is correct.
 * If the keyword new was inserted properly, then the try block
 * would throw a CastClassException, which would be replaced
 * with a RuntimeException to the calling method by the catch
 * block. The catch block in the main() method would then be
 * activated, and no output would be printed, making Option C
 * correct
 */

public class Que40 {
    public static void main(String[] args) {
        
    }
}
