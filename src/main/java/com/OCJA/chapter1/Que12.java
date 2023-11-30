package com.OCJA.chapter1;

/*

        /37 - Java Basics
        //522 - Answer

        12. What is the result of compiling and executing the following
        class?
        1: public class ParkRanger {
        2: int birds = 10;
        3: public static void main(String[] data) {
        4: int trees = 5;
        5: System.out.print(trees+birds);
        6:    }
        7: }

        A. It does not compile.
        B. It compiles but throws an exception at runtime.
        C. It compiles and outputs 5.
        D. It compiles and outputs 15.


        12. A. The code does not compile because of line 5, making Option A
        the correct answer. For this question, it helps to understand
        variable scope. The main() method is static and does not have
        access to any class instance variables. The birds variable is not
        static and requires a class instance variable to access.
        Therefore, the code does not compile when the static method
        attempts to access a non-static variable without an instance of
        the class.


*/

public class Que12
{
    public static void main(String[] args) {

    }
}
