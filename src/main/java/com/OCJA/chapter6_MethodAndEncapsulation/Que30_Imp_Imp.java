package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 135 - MethodAndEncapsulation
 * 567 - Answer
 *
 * 30. Given the following two classes, each in a different package,
 * which line inserted below allows the second class to compile?
 * package clothes;
 * public class Store {
 *  public static String getClothes() { return "dress"; }
 * }
 * package wardrobe;
 * // INSERT CODE HERE
 * public class Closet {
 *  public void borrow() {
 *  System.out.print("Borrowing clothes: "+getClothes());
 *  }
 * }
 * A. static import clothes.Store.getClothes;
 * B. import clothes.Store.*;
 * C. import static clothes.Store.getClothes;
 * D. import static clothes.Store;
 *
 * 30. C. Option A is incorrect because the keywords static and import
 * are reversed. The Closet class uses the method getClothes()
 * without a reference to the class name Store, therefore a static
 * import is required. For this reason, Option B is incorrect since it
 * is missing the static keyword. Option D is also incorrect since
 * static imports are used with members of the class, not a class
 * name. Finally, Option C is the correct answer since it properly
 * imports the method into the class using a static import.
 *
 */

public class Que30_Imp_Imp {
    public static void main(String[] args)
    {

    }
}
