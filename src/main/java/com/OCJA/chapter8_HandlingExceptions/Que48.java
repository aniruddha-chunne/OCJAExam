package com.OCJA.chapter8_HandlingExceptions;

/**
 * 188 - Exceptional_Handling
 * 593 - Answer
 *
 * 48. Given an application that hosts a website, which of the following
 * would most likely result in a java.lang.Error being thrown?
 * A. Two users try to register an account at the same time.
 * B. The application temporarily loses connection to the
 * network.
 * C. A user enters their password incorrectly.
 * D. The application runs out of memory.
 *
 * 48. D. A Java application tends to only throw an Error when the
 * application has entered a final, unrecoverable state. Options A
 * and C are incorrect. These types of errors are common and
 * expected in most software applications, and should not cause
 * the application to terminate. Option B uses the word
 * temporarily, meaning the network connection will come back.
 * In this case, a regular exception could be used to try to recover
 * from this state. Option D is the correct answer because running
 * out of memory is usually unrecoverable in Java
 *
 */

public class Que48 {
    public static void main(String[] args) {
        
    }
}
