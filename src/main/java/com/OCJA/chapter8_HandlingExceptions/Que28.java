package com.OCJA.chapter8_HandlingExceptions;

/**
 * 179 - Exceptional_Handling
 * 589 - Answer
 *
 * 28. What is the output of the following application?
 * package peculiar;
 * public class Stranger {
 *  public static String getFullName(String firstName,
 * String lastName) {
 *  try {
 *  return firstName.toString() + " " +
 * lastName.toString();
 *  } finally {
 *  System.out.print("Finished!");
 *  } catch (NullPointerException npe) {
 *  System.out.print("Problem?");
 *  }
 *  return null;
 *  }
 *  public static void main(String[] things) {
 *  System.out.print(getFullName("Joyce","Hopper"));
 *  }
 * }
 * A. Joyce Hopper
 * B. Finished!Joyce Hopper
 * C. Problem?Finished!null
 * D. None of the above
 *
 * D
 *
 * 28. D. This code does not compile because the catch and finally
 * blocks are in the wrong order, making Option D the correct
 * answer. If the order was flipped, the output would be
 * Finished!Joyce Hopper, making Option B correct
 *
 */

public class Que28
{
    public static void main(String[] args)
    {
        
    }
}
