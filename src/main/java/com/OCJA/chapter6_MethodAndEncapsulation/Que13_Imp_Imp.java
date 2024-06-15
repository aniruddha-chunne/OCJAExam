package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 127 - MethodAndEncapsulation
 * 564 - Answer
 *
 * 13. Which statement about a no-argument constructor is true?
 * A. The Java compiler will always insert a default no-argument
 * constructor if you do not define a no-argument constructor
 * in your class.
 * B. In order for a class to call super() in one of its constructors,
 * its parent class must explicitly implement a no-argument
 * constructor.
 * C. If a class extends another class that has only one
 * constructor that takes a value, then the child class must
 * explicitly declare at least one constructor.
 * D. A class may contain more than one no-argument
 * constructor
 *
 * A
 *
 */

class ONe
{
    String stuff;
    public ONe(String stuff)
    {
        this.stuff = stuff;
    }
}

public class Que13_Imp_Imp extends ONe
{


    public Que13_Imp_Imp()
    {
        super("String stuff");

    }
    public static void main(String[] args) {

    }
}
