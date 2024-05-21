package com.OCJA.chapter8_HandlingExceptions;

/**
 * 180 - Exceptional_Handling
 * 590 - Answer
 *
 * 31. Given a try statement, if both the catch block and the finally
 * block each throw an exception, what does the caller see?
 * A. The exception from the catch block
 * B. The exception from the finally block
 * C. Both the exception from the catch block and the exception
 * from the finally block
 * D. None of the above
 *
 * 31. B. If both the catch and finally blocks throw an exception, the
 * one from the finally block is propagated to the caller, with the
 * one from the catch block being dropped, making Option B the
 * correct answer. Note that Option C is incorrect due to the fact
 * that only one exception can be thrown to the caller.
 *
 */

public class Que31_Imp
{
    public static void main(String[] args)
    {
            try
            {
                throw new ArithmeticException();

            }
            catch (ArithmeticException e)
            {
                throw new NullPointerException();
            }
            finally {
                throw new IndexOutOfBoundsException();
            }
    }
}
