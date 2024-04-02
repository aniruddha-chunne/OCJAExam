package com.DurgaNotes.Chapter5_OOPS_Concept.Overloading;

public class Case_5
{
//        : In General var-arg Method will get Least Priority i.e., if No Other Method
//    Matched then Only var-arg Method will get the Chance. It is Exactly Same as default
//    Case Inside switch


            public void m1(int a)
            {
                System.out.println("int - arg");
            }

            public void m1 (int...args)
            {
                System.out.println("int - var-args");
            }


    public static void main(String[] args) {

                Case_5 t = new Case_5();
                t.m1('a'); // int-args
                t.m1(10); // int -args
                t.m1(10,10); // var- args
    }
}
