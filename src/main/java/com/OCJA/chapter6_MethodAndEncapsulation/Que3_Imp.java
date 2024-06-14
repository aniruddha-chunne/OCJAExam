package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 124 - MethodAndEncapsulation
 * 562 - Answer
 *
 * package stocks;
 * public class Bond
 * {
         *  private static int price = 5;
             *  public boolean sell()
     *          {
                     *  if(price<10)
 *                      {
                     *  price++;
                     *  return true;
                     *  }
 *                      else if(price>=10)
 *                      {
                     *  return false;
                     *  }
             *  }
             *  public static void main(String[] cash) {
             *  new Bond().sell();
             *  new Bond().sell();
             *  new Bond().sell();
             *  System.out.print(price);
             *  }
 * }
 *
 * A. 5
 * B. 6
 * C. 8
 * D. The code does not compile
 *
 * 3. D. The sell() method does not compile because it does not
 * return a value if both of the if-then statements’ conditional
 * expressions evaluate to false. While logically, it is true that
 * price is either less than 10 or greater than or equal to 10, the
 * compiler does not know that. It just knows that if both if-then
 * statements evaluate to false, then it does not have a return
 * value, therefore it does not compile
 */

public class Que3_Imp {
    public static void main(String[] args) {
        
    }
}
