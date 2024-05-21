package com.OCJA.chapter8_HandlingExceptions;

/**
 * 184 - Exceptional_Handling
 * - Answer
 *
 * 41. Given the following application, which type of exception will be
 * printed in the stack trace at runtime?
 * package carnival;
 * public class WhackAnException {
 *  public static void main(String... hammer) {
 *  try {
 *  throw new ClassCastException();
 *  } catch (IllegalArgumentException e) {
 *  throw new IllegalArgumentException();
 *  } catch (RuntimeException e) {
 *  throw new NullPointerException();
 *  } finally {
 *  throw new RuntimeException();
 *  }
 *  }
 * }
 * A. IllegalArgumentException
 * B. NullPointerException
 * C. RuntimeException
 * D. The code does not compile.
 *
 * C
 *
 * 41. C. For this question, notice that all the exceptions thrown or
 * caught are unchecked exceptions. First, the ClassCastException
 * is thrown in the try block and caught by the second catch block
 * since it inherits from RuntimeException, not
 * IllegalArgumentException. Next, a NullPointerException is
 * thrown, but before it can be returned the finally block is
 * executed and a RuntimeException replaces it. The application
 * exits and the caller sees the RuntimeException in the stack trace,
 * making Option C the correct answer. If the finally block did not
 * throw any exceptions, then Option B would be the correct
 * answer.
 *
 */

public class Que41_Imp {
    public static void main(String[] args) {

    }
}
