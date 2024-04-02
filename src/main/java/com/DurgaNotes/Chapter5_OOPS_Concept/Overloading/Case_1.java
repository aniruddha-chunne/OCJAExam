package com.DurgaNotes.Chapter5_OOPS_Concept.Overloading;

public class Case_1
{

// Case 1:
//The Overloading Method Resolution is the Responsibility of Compiler based on
//Reference Type and Method Arguments. Hence Overloading is Considered as Compile-Time Polymorphism OR Early Binding
    public void m1()
    {
        System.out.println("no-args");
    }

    public void m1(int i)
    {
        System.out.println("int-args");
    }
    public void m1(double d)
    {
        System.out.println("double-args");
    }


    public static void main(String[] args)
    {
        Case_1 t= new Case_1();
        t.m1();
        t.m1(10);
        t.m1(10.5);

    }

}
