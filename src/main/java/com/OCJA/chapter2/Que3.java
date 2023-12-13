package com.OCJA.chapter2;

/*

    // 52 - Java Data Types
    // 530 - Answer

    3. Which is correct about an instance variable of type String?
        A. It defaults to an empty string.
        B. It defaults to null.
        C. It does not have a default value.
        D. It will not compile without initializing on the declaration line.

    3. B. Instance variables have a default value based on the type. For
        any non-primitive, including String, that type is a reference to
        null. Therefore Option B is correct. If the variable was a local
        variable, Option C would be correct

 */

public class Que3
{
    private String c;
    private int d;
    public static void main(String[] args)
    {
            String a  = new String();
            Integer b = new Integer("30");
        System.out.println(new Que3().c);
        System.out.println(new Que3().d);
    }
}

/*

 // 52 - Java Data Types
 // 530 - Answer



*/