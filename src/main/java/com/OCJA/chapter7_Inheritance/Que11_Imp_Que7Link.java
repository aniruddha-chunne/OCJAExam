package com.OCJA.chapter7_Inheritance;

/**
 * 148 - Inheritance
 * 575 - Answer
 *
 * 11. What is the output of the following application?
 * package machines;
 * class Computer {
 *  protected final int process() { return 5; }
 * }
 * public class Laptop extends Computer {
 *  public final int process() { return 3; }
 *  public static void main(String[] chips) {
 *  System.out.print(new Laptop().process());
 *  }
 * }
 * A. 5
 * B. 3
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * B
 */


  class Computer {
//   protected final  int process() { return 5; }
  }
   class Laptop extends Computer {
      public final int process() {
          return 3;
      }
  }


  /*
  * link with the que 7 is
  * child class method is final we can't override as per que 11
  * but if child class method is final but also private then we can override it as per que 7
  * */
public class Que11_Imp_Que7Link {
    public static void main(String[] args) {
        
    }
}
