package com.OCJA.chapter8_HandlingExceptions;

/**
 * 178 - Exceptional_Handling
 * 589 - Answer
 *
 * 27. Which of the following is not a reason to add checked exceptions
 * to a method signature?
 * A. To force a caller to handle or declare its exceptions
 * B. To notify the caller of potential types of problems
 * C. To ensure that exceptions never cause the application to
 * terminate
 * D. To give the caller a chance to recover from a problem
 *
 * C
 *
 * 27. C. Checked exceptions are commonly used to force a caller to
 * deal with an expected type of problem, such as the inability to
 * write a file to the file system. Without dealing with all checked
 * exceptions thrown by the method, the calling code does not
 * compile, so Option A is a true statement. Option B is also a true
 * statement. Declaring various different exceptions informs the
 * caller of the potential types of problems the method can
 * encounter. Option C is the correct answer. There may be no
 * recourse in handling an exception other than to terminate the
 * application. Finally, Option D is also a true statement because it
 * gives the caller a chance to recover from an exception, such as
 * writing file data to a backup location.
 */

public class Que27
{
    public static void main(String[] args)
    {

    }
}
