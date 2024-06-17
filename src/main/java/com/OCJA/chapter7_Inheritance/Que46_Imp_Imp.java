package com.OCJA.chapter7_Inheritance;

/**
 * 162 - Inheritance
 * 581 - Answer
 *
 * 46. Which of the following statements about no-argument
 * constructors is correct?
 * A. If a parent class does not include a no-argument
 * constructor, a child class cannot declare one.
 * B. If a parent class does not include a no-argument
 * constructor (nor a default one inserted by the compiler), a
 * child class must contain at least one constructor definition.
 * C. If a parent class contains a no-argument constructor, a child
 * class must contain a no-argument constructor.
 * D. If a parent class contains a no-argument constructor, a child
 * class must contain at least one constructor.
 *
 *
 * 46. B. If a parent class does not include a no-argument constructor,
 * a child class can still explicitly declare one; it just has to call an
 * appropriate parent constructor with super(), making Option A
 * incorrect. If a parent class does not include a no-argument
 * constructor, the child class must explicitly declare a constructor,
 * since the compiler will not be able to insert the default noargument constructor, making Option B correct. Option C is
 * incorrect because a parent class can have a no-argument
 * constructor, while its subclasses do not. If Option C was true,
 * then all classes would be required to have no-argument
 * constructors since they all extend java.lang.Object, which has a
 * no-argument constructor. Option D is also incorrect. The default
 * no-argument constructor can be inserted into any class that
 * directly extends a class that has a no-argument constructor.
 * Therefore, no constructors in the subclass are required
 */

class one
{
    one()
    {

    }
}

public class Que46_Imp_Imp extends one
{

//    Que46_Imp_Imp()
//    {
//        super( "one");
//
//
//
//    }
    public static void main(String[] args) {
        
    }
}
