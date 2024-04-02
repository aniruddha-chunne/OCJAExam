package com.DurgaNotes.Chapter5_OOPS_Concept.Overloading;

public class Case_2
{
//    Automatic promotion in overloading

    /**
     *
     *  While Resolving Overloaded Methods if Exact Method with the required Argument is
     * Not Available then the Compiler won’t Raise Immediately Compile Time Error.
     *  First Compiler will Promote Arguments to Next Level and Check is there any
     * Matched Method with Promoted Arguments.
     *  If the Matched Method is Found then it will Considered Otherwise Compiler
     * Promotes the Argument to the Next Level.
     *  This Process will be continued until all Possible Promotions.
     *  After all Possible Promotions still the Compiler Unable to find the Matched Method
     * then it raises Compile Time Error.
     *
     * */

    public void m1() {
        System.out.println ("no-args");
    }
    public void m1(int i) {
        System.out.println ("int-args");
    }
    public void m1(float f) {
        System.out.println ("float-args");
    }

    public static void main(String[] args)
    {

        Case_2 t = new Case_2();
        t.m1(); //no-args
        t.m1(10); //int-args
        t.m1(10.9f); //float-args
        t.m1('a'); //int-args
        t.m1(10l); //float-args
//        t.m1(10.5); CE: cannot resolve symbol
//        symbol : method m1 (double)
//            location: class case_2
    }

}
