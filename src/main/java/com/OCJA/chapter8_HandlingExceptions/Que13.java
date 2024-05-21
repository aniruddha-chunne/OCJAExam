package com.OCJA.chapter8_HandlingExceptions;

/**
 * 172 - Exceptional_Handling
 * 585 - Answer
 *
 * 13. Which of the following statements about a finally block is true?
 * A. Every line of the finally block is guaranteed to be executed.
 * B. The finally block is executed only if the related catch block
 * is also executed.
 * C. The finally statement requires brackets {}.
 * D. The finally block cannot throw an exception.
 *
 * c
 *
 * 13. C. A finally block can throw an exception, in which case not
 * every line of the finally block would be executed. For this
 * reason, Options A and D are incorrect. Option B is also incorrect
 * The finally block is called regardless of whether or not the
 * related catch block is executed. Option C is the correct answer.
 * Unlike an if-then statement, which can take a single statement, a
 * finally statement requires brackets {}.
 *
 */

public class Que13
{
    public static void main(String[] args) {
        
    }
}
