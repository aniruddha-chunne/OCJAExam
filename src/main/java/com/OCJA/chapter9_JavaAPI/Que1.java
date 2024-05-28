package com.OCJA.chapter9_JavaAPI;

/**
 * 191 - JavaAPI
 * 595 - Answer
 *
 * 1. What is the best reason for using StringBuilder instead of
 * String?
 * A. StringBuilder adds support for multiple threads.
 * B. StringBuilder can use == to compare values.
 * C. StringBuilder saves memory by reducing the number of
 * objects created.
 * D. StringBuilder supports different languages and encodings.
 *
 * C
 *
 * 1. C. Option A is incorrect because StringBuilder does not support
 * multiple threads. In fact, threads aren’t even covered on the
 * OCA, which should be your clue that this answer is wrong! You
 * don’t need to know this for the exam, but StringBuffer supports
 * multiple threads. Option B is incorrect because == compares
 * references, not values. Option D is incorrect because both String
 * and StringBuilder support languages and encodings. Option C is
 * correct and the primary reason to use StringBuilder. String
 * often creates a new object each time you call certain methods on
 * the object like concat(). StringBuilder optimizes operations like
 * append() because it is mutable.
 */

public class Que1 {
    public static void main(String[] args)
    {
        
    }
}
