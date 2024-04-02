package com.DurgaNotes.Chapter5_OOPS_Concept.Overloading;

public class Case_4
{
//    In Java, Method Overloading is Not Possible by Changing the Return Type of the
//    Method because there May Occur Ambiguity Problem.

    public void m1(String s) {
        System.out.println ("String Version");
    }
    public void m1(StringBuffer sb) {
        System.out.println ("StringBuffer Version");
    }

// just chaing the return type of the overloading method doesn't work
//    it also create ambiguity for the compiler

//    public int m2(int a)
//    {
//        System.out.println("int - argument");
//        return null
//    }
//
//    public void m2(int a)
//    {
//        System.out.println("double - argument");
//    }

    public static void main(String[] args)
    {

        Case_4 t = new Case_4();
        t.m1("Durga"); //String Version
        t.m1(new StringBuffer("Durga")); //StringBuffer Version
//      t.m1(null); //CE: reference to m1 is ambiguous, both method m1(String) in Test and
//      method m1(StringBuffer) in Test match




    }


}
