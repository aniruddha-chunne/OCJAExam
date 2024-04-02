package com.DurgaNotes.Chapter5_OOPS_Concept.overriding;

/**
 * We can Override Parent Class Concrete Method as Abstract in Child Class.
 *
 * Next Level Child is the Responsible to Provide Implementation.
 *
 * The Main Advantage of this Approach is we can Stop Availability of Parent Class
 * Method Implementation to the Next Level Child Classes.
 *
 * */


class P5
{
    public void m1()
    {
        System.out.println("concrete method");
    }
}
public abstract class Case_5 extends P5
{
    public abstract void m1();

    public void m2()
    {
        System.out.println("One");
    }

}


class Case_51 extends Case_5
{

    @Override
    public void m1() {

        System.out.println("Case_51  -  override method");
    }

    public static void main(String[] args)
    {
        P5 a = new Case_51();
        a.m1();
//        a.m2();

        Case_5 b = new Case_51();
        b.m2();
    }
}
