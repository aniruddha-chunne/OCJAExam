package com.OCJA.chapter2;

/*

          // 59 - Java Data Types
         // 533 - Answer

        28. What is the output of the following?
        Integer integer = new Integer(4);
        System.out.print(integer.byteValue());
        System.out.print("-");
        int i = new Integer(4);
        System.out.print(i.byteValue());
        A. 4-0
        B. 4-4
        C. The code does not compile.
        D. The code compiles but throws an exception at runtime.

        28. C. Java does not allow calling a method on a primitive. While
        autoboxing does allow the assignment of an Integer to an int, it
        does not allow calling an instance method on a primitive.
        Therefore, the last line does not compile.

*/


public class Que28
{
    public static void main(String[] args) {

        Integer integer = new Integer(4);
        System.out.print(integer.byteValue());

    }

}
