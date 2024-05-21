package com.OCJA.chapter8_HandlingExceptions;

/**
 * 185 - Exceptional_Handling
 * 592 - Answer
 *
 * 42. Which of these method signatures is allowed in a class
 * implementing the Outfielder interface?
 * class OutOfBoundsException extends BadCatchException {}
 * class BadCatchException extends Exception {}
 * public interface Outfielder {
 *  public void catchBall() throws OutOfBoundsException;
 * }
 * A. public int catchBall() throws OutOfBoundsException
 * B. public int catchBall() throws BadCatchException
 * C. public int catchBall() throws Exception
 * D. None of the above
 *
 * D
 *
 * 42. D. Trick question! Options A, B, and C are each invalid overrides
 * of the method because the return type must be covariant with
 * void. For this reason, Option D is the correct answer. If the
 * return types were changed to be void, then Option A would be a
 * valid override. Options B and C would still be incorrect, since
 * overridden methods cannot throw broader checked exceptions
 * than the inherited method
 *
 */

public class Que42_Imp {
    public static void main(String[] args) {
        
    }
}
