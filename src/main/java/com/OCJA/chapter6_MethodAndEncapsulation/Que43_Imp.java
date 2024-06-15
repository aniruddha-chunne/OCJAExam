package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 140 - Method And Encapsulation
 * 570 - Answer
 *43. Which of the following is not a true statement?
 * A. The first line of every constructor is a call to the parent
 * constructor via the super() command.
 * B. A class does not have to have a constructor explicitly
 * defined.
 * C. A constructor may pass arguments to the parent
 * constructor.
 * D. A final instance variable whose value is not set when they
 * are declared or in an initialization block should be set by the
 * constructor.
 *
 *43. A. Option A is the correct answer because the first line of a
 * constructor could be this() or super(), making it an untrue
 * statement. Option B is a true statement because the compiler
 * will insert the default no-argument constructor if one is not
 * defined. Option C is also a true statement, since zero or more
 * arguments may be passed to the parent constructor, if the
 * parent class defines such constructors. Option D is also true. The
 * value of a final instance variable should be set when it is
 * declared, in an initialization block, or in a constructor.
 */

public class Que43_Imp {
    public static void main(String[] args) {
        
    }
}

// Parent class
class Parent {
    int x;

    // Parent class constructor
    Parent(int x) {
        this.x = x;
        System.out.println("Parent constructor called with x = " + x);
    }
}

/*

// Child class
class Child extends Parent {
    final int y;

    // Child class constructor
    Child(int x, int y) {
        super(x); // Passing argument to the parent constructor
        this.y = y; // Setting the final instance variable
        System.out.println("Child constructor called with y = " + y);
    }
}

// Main class to test the example
public class Main {
    public static void main(String[] args) {
        Child child = new Child(10, 20); // Creating an instance of the Child class
    }
}

*/