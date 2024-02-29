package com.OCJA.Practise.pack2;

import com.OCJA.Practise.pack1.A;

public class B extends A
{

//    protected - it is not necessary to provide implementation  vs abstract - it is compulsory to provide implementation

//    if the method is protected is  recommended to override it and not to use it as it is ..
    public static void main(String[] args)
    {
        B a = new B();
        a.m1();

        C c = new C ();
        c.m1();

    }
}
