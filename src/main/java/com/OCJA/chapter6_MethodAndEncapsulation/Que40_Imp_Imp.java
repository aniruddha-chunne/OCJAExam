package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 139 - MethodAndEncapsulation
 * 756 - Answer
 *
 * 40. Given the following class, which line of code when inserted
 * below would prevent the class from compiling?
 * public class Drink
 * {
         *  public static void water() {}
         *  public void get()
         *  {
                    // INSERT CODE HERE
         *  }
 * }
 * A. water();
 * B. this.Drink.water();
 * C. this.water();
 * D. Drink.water();
 *
 *40. B. Options A and D are equivalent and would allow the code to
 * compile. They both are proper ways to access a static method
 * from within an instance method. Option B is the correct answer.
 * The class would not compile because this.Drink has no meaning
 * to the compiler. Finally, Option C would still allow the code to
 * compile, even though it is considered a poor coding practice.
 * While static members should be accessed in a static way, it is
 * not required.
 *
 *
 */

public class Que40_Imp_Imp {

    public static void water() {}
           public void get()
           {



           }
    public static void main(String[] args) {


        
    }
}
