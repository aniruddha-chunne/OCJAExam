package com.OCJA.chapter1;
/*

        //48 - Java Basics
        //528 - Answer

        45. What is the result of compiling and executing the following
            class?
             public class RollerSkates {
            static int wheels = 1;
            int tracks = 5;
            public static void main(String[] arguments) {
                RollerSkates s = new RollerSkates();
                int feet=4, tracks = 15;
                System.out.print(feet + tracks + s.wheels);
                }
            }

        A. The code does not compile.
        B. 5
        C. 10
        D. 20

        45. D. The code compiles and runs without issue, so Option A is
        incorrect. The question involves understanding the value and
        scope of each variable at the print() statement. The variables
        feet and tracks are locally scoped and set to 4 and 15,
        respectively, ignoring the value of tracks of 5 in the instance of
        the class. Finally, the static variable s.wheels has a value of 1.
        The result is the combined value is 20, making Option D the
        correct answer.


*/

public class Que45
{

}
