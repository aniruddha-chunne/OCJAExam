package com.OCJA.chapter8_HandlingExceptions;

/**
 * 177 - Exceptional_Handling
 * 588 - Answer
 *
 * 23. If an exception matches two or more catch blocks, which catch
 * block is executed?
 * A. The first one that matches is executed.
 * B. The last one that matches is executed.
 * C. All matched blocks are executed.
 * D. It is not possible to write code like this.
 *
 * A
 *
 * 23. A. If an exception matches multiple catch blocks, the first one
 * that it encounters will be the only one executed, making Option
 * A correct, and Options B and C incorrect. Option D is also
 * incorrect. It is possible to write two consecutive catch blocks
 * that can catch the same exception, with the first type being a
 * subclass of the second. In this scenario, an exception thrown of
 * the first type would match both catch blocks, but only the first
 * catch block would be executed, since it is the more specific
 * match.
 */

public class Que23
{
    public static void main(String[] args)
    {
        
    }

}
