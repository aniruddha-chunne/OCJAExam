package com.DurgaNotes.Chapter5_OOPS_Concept.overriding;

/*

 In Overriding Method Resolution Always Take Care by JVM based on Runtime
Object.
 Hence Overriding is Considered as Runtime Polymorphism OR Dynamic
Polymorphism OR Late Binding.
 The Process of Overriding Method Resolution is Also Known as Dynamic Method
Dispatch.

*/

class P
{

    public void property()
    {
        System.out.println("Land + Gold + cash");
    }

    public void mary()
    {
        System.out.println ("Subbu Lakshmi");
    }

}

public class Case_1 extends P
{

    public void mary()
    {
        System.out.println ("3sha/ 9tara/ 4me");
    }


    public static void main(String[] args)
    {
        Case_1 t = new Case_1();
        t.mary();
        t.property();

        System.out.println("-----------------------------------------");

        P t2 = new P();
        t2.mary();
        t2.property();

        System.out.println("-----------------------------------------");

        P t3 = new Case_1();
        t3.mary();
        t3.property();

    }

}