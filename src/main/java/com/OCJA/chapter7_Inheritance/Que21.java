package com.OCJA.chapter7_Inheritance;

/**
 * 153 - Inheritance
 * 577 - Answer
 *
 *  * 21. What is the output of the following application?
 * package paper;
 * abstract class Book {
 *  protected static String material = "papyrus";
 *  public Book() {}
 *  public Book(String material) {this.material = material;}
 * }
 * public class Encyclopedia extends Book {
 *  public static String material = "cellulose";
 *  public Encyclopedia() {super();}
 *  public String getMaterial() {return super.material;}
 *  public static void main(String[] pages) {
 *  System.out.print(new Encyclopedia().getMaterial());
 *  }
 * }
 * A. papyrus
 * B. cellulose
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * 21. A. The code compiles and runs without issue, making Options C
 * and D incorrect. Although super.material and this.material are
 * poor choices in accessing static variables, they are permitted.
 * Since super is used to access the variable in getMaterial(), the
 * value papyrus is returned, making Option A the correct answer.
 * Also, note that the constructor Book(String) is not used in the
 * Encyclopedia class.
 */

public class Que21 {
    public static void main(String[] args) {
        
    }
}
