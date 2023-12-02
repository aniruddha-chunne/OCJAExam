package com.OCJA.chapter1;

public class Que21_Imp {

            /*

            //40 - Java Basics
            //524 - Answer

            21. What is the result of compiling and executing the following
            class?
            1: public class Tolls {
            2: private static int yesterday = 1;
            3: int tomorrow = 10;
            4: public static void main(String[] args) {
            5: Tolls tolls = new Tolls();
            6: int today=20, tomorrow = 40;
            7: System.out.print(today + tolls.tomorrow +
                    tolls.yesterday);
            8: }
            9: }

            A. The code does not compile due to line 6.
            B. The code does not compile due to line 7.
            C. 31
            D. 6

            21. C. The code compiles and runs without issue, so Options A and
            B are incorrect. The question relies on your ability to understand
            variable scope. The variable today has local scope to the method
            in which it is executed. The variable tomorrow is re-declared in
            the method, but the reference used on line 7 is to the instance
            variable with a value of 10. Finally, the variable tomorrow is
            static. While using an instance reference to access a static
            variable is not recommended, it does not prevent the variable
            from being read. The result is line 7 evaluates and prints (20 +
            10 + 1) = 31, making C the correct answer.

            */

    private static int yesterday = 1;
    int tomorrow = 10;

    public static void main(String[] args)
    {

         Que21_Imp tolls = new Que21_Imp();
         int today=20, tomorrow = 40;
         System.out.print(today + tolls.tomorrow + yesterday);
        
    }
}
