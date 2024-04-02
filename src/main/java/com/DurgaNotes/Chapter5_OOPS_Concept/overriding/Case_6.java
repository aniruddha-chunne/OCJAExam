package com.DurgaNotes.Chapter5_OOPS_Concept.overriding;
/**
 * While Overriding we can’t Reduce Scope of Access Modifier. But we can Increase
 *
 * private < default < protected < public
 *
 * */


class P6
{
    void m1()
    {
        System.out.println("one");
    }
     protected void m2()
    {
        System.out.println("two");
    }

}
public class Case_6 extends P6
{

    protected void m1()
    {
        System.out.println("one");
    }

     public void m2()
    {
        System.out.println("two");
    }



}
