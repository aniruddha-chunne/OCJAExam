package com.OCJA.chapter8_HandlingExceptions;

/**
 * 181 - Exceptional_Handling
 * 590 - Answer
 *
 * 33. Given the following code snippet, which specific exception will
 * be thrown?
 * final Object exception = new Exception();
 * final Exception data = (RuntimeException)exception;
 * System.out.print(data);
 * A. ClassCastException
 * B. RuntimeException
 * C. NullPointerException
 * D. None of the above
 *
 * A
 * 33. A. Although this code uses the RuntimeException and Exception
 * classes, the question is about casting. Exception is not a subclass
 * of RuntimeException, so the assignment on the second line
 * throws a ClassCastException at runtime, making Option A
 * correct.
 */

public class Que33_Imp {
    public static void main(String[] args)
    {

        Exception e = (RuntimeException) new Exception();

//        final Object exception = new Exception();
//  final Exception data = (RuntimeException)exception;
//  System.out.print(data);

    }
}
