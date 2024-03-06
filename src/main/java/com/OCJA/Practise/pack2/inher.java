package com.OCJA.Practise.pack2;

public class inher
{
    public static void m1(int i)
    {
        System.out.println("int");
    }

    public static void m1(float i)
    {
        System.out.println("float");
    }

//    public static void m1(double i)
//    {
//        System.out.println("double");
//    }
    public static void main(String[] args)
    {

            inher a = new inher();
        a.m1('a');

    }
}
