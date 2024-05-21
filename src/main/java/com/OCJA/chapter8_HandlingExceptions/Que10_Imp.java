package com.OCJA.chapter8_HandlingExceptions;


/**
 * 171 - Exceptional_Handling
 * 585 - Answer
 *
 * ========== ****
 * even if you handle the exception using try-catch in the same method it throw but if you declare it using throws
 * in the method signature you have to declare or handle using try-catch in the caller
 *========== ****
 *
 * 10. What is the result of compiling and running the following
 * application?
 * package castles;
 * public class Fortress
 * {
         *  public void openDrawbridge() throws Exception
 *          { // p1
                     *  try {
                     *  throw new Exception("Circle");
                     *  } catch (Exception e) {
                     *  System.out.print("Opening!");
                     *  } finally {
                     *  System.out.print("Walls"); // p2
                     *  }
         *  }
         *
         *  public static void main(String[] moat) {
         *  new Fortress().openDrawbridge(); // p3
         *  }
 * }
 * A. The code does not compile because of line p1.
 * B. The code does not compile because of line p2.
 * C. The code does not compile because of line p3.
 * D. The code compiles, but a stack trace is printed at runtime.
 *
 * c
 *
 * 10. C. The application does not compile, so Option D is incorrect.
 * The openDrawbridge() method compiles without issue, so
 * Options A and B are incorrect. The issue here is how the
 * openDrawbridge() method is called from within the main()
 * method on line p3. The openDrawbridge() method declares the
 * checked exception, Exception, but the main() method from
 * which it is called does not handle or declare the exception. In
 * order for this code to compile, the main() method would have to
 * have a try-catch statement around line p3 that properly handles
 * the checked exception, or the main() would have to be updated
 * to declare a compatible checked exception. For these reasons,
 * line p3 does not compile, and Option C is the correct answer.
 *
 */



public class Que10_Imp {
    public static void main(String[] args) {
        
    }
}
