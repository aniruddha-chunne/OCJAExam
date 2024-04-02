package com.DurgaNotes.Chapter5_OOPS_Concept.overriding;

/** private and final method can't be override
 *
 *
 */

class P4
{
    public final void m1()
    {

    }
    private void m2()
    {
        System.out.println("parent class method ");
    }
}
public class Case_4 extends P4
{
//    public void m1()
//    {
//
//    }

    private void m2()
    {
        System.out.println("overident method ");
    }

    public static void main(String[] args) {
        Case_4 t = new Case_4();
        t.m2();

        P4 t2 = new Case_4();
    }
}
