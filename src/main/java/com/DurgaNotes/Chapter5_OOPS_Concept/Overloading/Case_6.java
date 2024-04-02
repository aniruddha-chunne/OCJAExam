package com.DurgaNotes.Chapter5_OOPS_Concept.Overloading;

public class Case_6
{
    // Automatic promotion occured during overloading

    public void m1(int i, float f)
    {
        System.out.println("int - float Version");
    }
    public void m1(float f, int i)
    {
        System.out.println("float - int Version");
    }

    public static void main(String[] args)
    {
            Case_6 t = new Case_6();

            t.m1(6, 10.0f);
            t.m1(10.0f, 6);
//            t.m1('a', 20);  // here compiler have doubt which method should be used

//        first argument can be promote to float as well as int
//        second argument can be promote to int as well as float.

    }


}
