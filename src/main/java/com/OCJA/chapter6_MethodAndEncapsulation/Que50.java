package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 143 - MethodAndEncapsulation
 * 756 - Answer
 *
 * 50. Given the following two classes, each in a different package,
 * which line inserted below allows the second class to compile?
 * package commerce;
 * public class Bank {
 *  public void withdrawal(int amountInCents) {}
 *  public void deposit(int amountInCents) {}
 * }
 * package employee;
 * // INSERT CODE HERE
 * public class Teller {
 *  public void processAccount(int depositSlip, int
 * withdrawalSlip) {
 *  withdrawal(withdrawalSlip);
 *  deposit(depositSlip);
 *  }
 * }
 * A. import static commerce.Bank.*;
 * B. static import commerce.Bank.*;
 * C. import static commerce.Bank;
 * D. None of the above
 *
 * D
 *
 * 50. D. A static import is used to import static members of another
 * class. In this case, the withdrawal() and deposit() methods in
 * the Bank class are not marked static. They require an instance
 * of Bank to be used and cannot be imported as static methods.
 * Therefore, Option D is correct. If the two methods in the Bank
 * class were marked static, then Option A would be the correct
 * answer since wildcards can be used with static imports to
 * import more than one method. Option B reverses the keywords
 * static and import, while Option C incorrectly imports a class,
 * which cannot be imported via a static import.
 */

public class Que50
{
    public static void main(String[] args)
    {

    }
}
