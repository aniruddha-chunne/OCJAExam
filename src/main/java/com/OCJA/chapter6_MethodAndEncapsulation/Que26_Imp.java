package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 132 - MethodAndEncapsulation
 * 567 - Answer
 *
 * 26. Which of the following lines of code can be inserted in the line
 * below that would allow the class to compile?
 * package farm;
 * public class Coop {
 *  public final int static getNumberOfChickens() {
 *  // INSERT CODE HERE
 *  }
 * }
 * A. return 3.0;
 * B. return 5L;
 * C. return 10;
 * D. None of the above
 *
 * 26. D. The code does not compile, regardless of what is inserted into
 * the line because the method signature is invalid. The return
 * type, int, should go before the method name and after any
 * access, final, or static modifiers. Therefore, Option D is the
 * correct answer. If the method was fixed, by swapping the order
 * of int and static in the method declaration, then Option C
 * would be the correct answer. Options A and B are still incorrect,
 * though, since each uses a return type that cannot be implicitly
 *
 */

public class Que26_Imp {
    public static void main(String[] args) {
        
    }
}
