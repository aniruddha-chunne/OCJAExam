package com.OCJA.chapter9_JavaAPI;

/**
 * 195 - JavaAPI
 * 597 - Answer
 *
 * 17. What does the following do?
 * public class Shoot {
 *  interface Target {
 *  boolean needToAim(double angle);
 *  }
 *  static void prepare(double angle, Target t) {
 *  boolean ready = t.needToAim(angle); // k1
 *  System.out.println(ready);
 *  }
 *  public static void main(String[] args) {
 *  prepare(45, d -> d > 5 || d < -5); // k2
 *  }
 * }
 * A. It prints true.
 * B. It prints false.
 * C. It doesn’t compile due to line k1.
 * D. It doesn’t compile due to line k2.
 *
 * 17. A. This is a correct example of code that uses a lambda. The
 * interface has a single abstract method. The lambda correctly
 * takes one double parameter and returns a boolean. This matches
 * the interface. The lambda syntax is correct. Since 45 is greater
 * than 5, Option A is correct
 *
 */

public class Que17 {

    interface Target {
        boolean needToAim(double angle);
    }

        public static void main(String[] args) {

        Target d = s ->
        {
            if(s>0) return false;
            else return true;
        };
            System.out.println(d.needToAim(3));
        
    }
}
