package com.OCJA.chapter8_HandlingExceptions;

/**
 * 174 - Exceptional_Handling
 * 586 - Answer
 *16. Which statement about the role of exceptions in Java is
 * incorrect?
 * A. Exceptions are often used when things “go wrong” or
 * deviate from the expected path.
 *
 * B. An application that throws an exception will terminate.
 *
 * C. Some exceptions can be avoided programmatically.
 *
 * D. An application that can properly handle its exception may
 * recover from unexpected problems.

 *  B
 *
 *  16. B. Option A is a true statement about exceptions and when they
 * are often applied. Option B is the false statement and the correct
 * answer. An application that throws an exception can choose to
 * handle the exception and avoid termination. Option C is also a
 * true statement. For example, a NullPointerException can be
 * avoided on a null object by testing whether or not the object is
 * null before attempting to use it. Option D is also a correct
 * statement. Attempting to recover from unexpected problems is
 * an important aspect of proper exception handling.
 */

class one extends Exception
{
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
public class Que16 {
    public static void main(String[] args) {
        
    }
}
