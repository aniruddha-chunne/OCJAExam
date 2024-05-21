package com.OCJA.chapter8_HandlingExceptions;

/**
 * 175 - Exceptional_Handling
 * 587 - Answer
 *
 * 20. Which statement about the following classes is correct?
 * class GasException extends Exception {}
 * class Element
 * {
         *  public int getSymbol() throws GasException
         *  {
         *      return -1;
         *   } // g1
 * }
 * public class Oxygen extends Element
 * {
     *  public int getSymbol()
     *  {
     *      return 8;
     *  } // g2
 *
         *  public void printData()
         *  {
                 *  try {
                 *  System.out.print(getSymbol());
                 *  } catch { // g3
                 *  System.out.print("Unable to read data");
                 *  }
         *  }
 * }
 * A. The code does not compile because of line g1.
 * B. The code does not compile because of line g2.
 * C. The code does not compile because of line g3.
 * D. None of the above
 *
 * 20. C. The code does not compile because the catch block is missing
 * a variable type and name, such as catch (Exception e) .
 * Therefore, Option C is the correct answer. Both
 * implementations of getSymbol() compile without issue,
 * including the overridden method. A subclass can swallow a
 * checked exception for a method declared in a parent class; it just
 * cannot declare any new or broader checked exceptions
 */

public class Que20 {
    public static void main(String[] args) {
        
    }
}
