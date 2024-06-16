package com.OCJA.chapter7_Inheritance;

/**
 * 159 - Inheritance
 * 579 - Answer
 *
 * // note read the description about fly(int speed)
 *
 * 35. How many compiler errors does the following code contain?
 * package animal;
 * interface CanFly {
 *  public void fly() {}
 * }
 * final class Bird {
 *  public int fly(int speed) {}
 * }
 * public class Eagle extends Bird implements CanFly {
 *  public void fly() {}
 * }
 * A. None
 * B. One
 * C. Two
 * D. Three
 *
 * 35. D. First of all, interfaces can only contain abstract, final, and
 * default methods. The method fly() defined in CanFly is not
 * marked static or default and defines an implementation, an
 * empty {}, meaning it cannot be assumed to be abstract;
 * therefore, the code does not compile. Next, the implementation
 * of fly(int speed) in the Bird class also does not compile, but
 * not because of the signature. The method body fails to return an
 * int value. Since it is an overloaded method, if it returned a value
 * it would compile without issue. Finally, the Eagle class does not
 * compile because it extends the Bird class, which is marked final
 * and therefore, cannot be extended. For these three reasons,
 * Option D is the correct answer.
 */

public class Que35_Imp {
    public static void main(String[] args)
    {

    }
}
