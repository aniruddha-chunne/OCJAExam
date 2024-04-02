package com.DurgaNotes.Chapter5_OOPS_Concept.overriding;

// co-variant concept is not applicable to the primitive data type

class P3
{
    public int m1()
    {
        return 0;
    }

//    public int m2()
//    {
//        return 0;
//    }
}
public class Case_3 extends P3
{
    @Override
    public int m1()
    {
        return 1;
    }

//    public double m2()
//    {
//        return 0.0;
//    }


    public static void main(String[] args)
    {
            Case_3 t = new Case_3();
        System.out.println(t.m1());
    }

}
