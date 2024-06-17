package com.OCJA.chapter7_Inheritance;

/**
 * 162 - Inheritance
 * 581 - Answer
 *
 * 44. Which statement about the following application is true?
 * package party;
 * abstract class House {
 *  protected abstract Object getSpace();
 * }
 * abstract class Room extends House {
 *  abstract Object getSpace(Object list);
 * }
 * abstract public class Ballroom extends House {
 *  protected abstract Object getSpace();
 *  public static void main(String[] squareFootage) {
 *  System.out.print("Let's start the party!");
 *  }
 * }
 * A. It compiles and at runtime prints Let's start the party!
 * B. It does not compile for one reason.
 * C. It does not compile for two reasons.
 * D. It does not compile for three reasons.
 *
 * 44. A. It looks like getSpace() in the Room class is an invalid override
 * of the version in the House class since package-private is a more
 * restrictive access modifier than protected, but the parameter list
 * changes; therefore, this is an overloaded method, not an
 * overridden one. Furthermore, the Ballroom class is abstract so
 * no object is instantiated, but there is no requirement that an
 * abstract class cannot contain a runnable main() method. For
 * these reasons, the code compiles and runs without issue, making
 * Option A correct.
 *
 */


abstract class House {
    protected abstract int getSpace();
}
 class Room extends House {
     protected int getSpace()
     {
            return 0;
     }

 }
public class Que44_Imp_Imp {
    public static void main(String[] args)
    {
        
    }
}
