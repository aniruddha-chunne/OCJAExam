package com.OCJA.chapter2;

/*

    // 52 - Java Data Types
    // 530 - Answer

    2. What is the output of the following?
        public static void main(String... args)
        {
         String chair, table = "metal";
         chair = chair + table;
         System.out.println(chair);
        }
        A. metal
        B. metalmetal
        C. nullmetal
        D. The code does not compile.

        2. D. The table variable is initialized to "metal". However, chair is
        not initialized. In Java, initialization is per variable and not for
        all the variables in a single declaration. Therefore, the second
        line tries to reference an uninitialized local variable and does not
        compile, which makes Option D correct.


 */

public class Que2_Imp
{
    public static void main(String[] args)
    {
        String a, b = "c";
//        System.out.println(a);
    }

}
