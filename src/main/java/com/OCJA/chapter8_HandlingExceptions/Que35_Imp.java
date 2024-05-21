package com.OCJA.chapter8_HandlingExceptions;

/**
 * 180 - Exceptional_Handling
 * 590 - Answer
 *
 * 35. In the following application, the values of street and city have
 * been omitted. Which one of the following is a possible output of
 * executing this class?
 * I. 350 5th Ave - New York
 * II. Posted:350 5th Ave - New York
 * package registration;
 * public class Address {
 *  public String getAddress(String street, String city) {
 *  try {
 *  return street.toString() + " : " +
 * city.toString();
 *  } finally {
 *  System.out.print("Posted:");
 *  }
 *  }
 *  public static void main(String[] form) {
 *  String street = // value omitted
 *  String city = // value omitted
 *  System.out.print(new
 * Address().getAddress(street,city));
 *  }
 * }
 * A. I only
 * B. II only
 * C. I and II
 * D. None of the above
 *
 * B
 *
 * 35. B. If both values are valid non-null String objects, then no
 * exception will be thrown, with the statement in the finally
 * block being executed first, before returning control to the main()
 * method; therefore, the second statement is a possible output. If
 * either value is null, then the toString() method will cause a
 * NullPointerException to be thrown. In both cases, the finally
 * block will execute first, printing Posted:, even if there is an
 * exception. For this reason, the first statement is not a possible
 * output, and Option B is correct.
 *
 */

public class Que35_Imp {
    public static void main(String[] args) {
        
    }
}
