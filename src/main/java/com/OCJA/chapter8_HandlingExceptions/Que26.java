package com.OCJA.chapter8_HandlingExceptions;

/**
 * 178 - Exceptional_Handling
 *  589 - Answer
 *
 *  26. Fill in the blanks: A ____________occurs when a program
 * recurses too deeply into an infinite loop, while a(n)
 * ____________occurs when a reference to a nonexistent
 * object is acted upon.
 * A. NoClassDefFoundError, StackOverflowError
 * B. StackOverflowError, NullPointerException
 * C. ClassCastException, IllegalArgumentException
 * D. StackOverflowError, IllegalArgumentException
 *
 * B
 *
 * 26. B. A StackOverflowError occurs when a program recurses too
 * deeply into an infinite loop. It is considered an error because the
 * JVM often runs out of memory and cannot recover. A
 * NullPointerException occurs when an instance method or
 * variable on a null reference is used. For these reasons, Option B
 * is correct. A NoClassDefFoundError occurs when code available at
 * compile time is not available at runtime. A ClassCastException
 * occurs when an object is cast to an incompatible reference type.
 * Finally, an IllegalArgumentException occurs when invalid
 * parameters are sent to a method
 *
 */

public class Que26
{
    public static void main(String[] args)
    {

    }
}
