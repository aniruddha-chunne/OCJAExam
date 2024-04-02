package com.DurgaNotes.Chapter5_OOPS_Concept.Overloading;

public class Case_3
{
//     In Overloading exact Match will get High Priority.
//     In Overloading Child Class Argument will get More Priority than Parent Class
//    Argument.

    void m1( String a)
    {
        System.out.println("String - args");
    }

    void m1( Object a)
    {
        System.out.println("Object - args");
    }
    public static void main(String[] args)
    {
            Case_3 t = new Case_3();
            t.m1(new String()); // string version
            t.m1(new Object()); // object version
            t.m1(null); // String version
    }
}
