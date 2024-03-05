package com.OCJA.Practise.pack2;


class P
{
    public void p1()
    {
        System.out.println("parent");
    }
}



class Ch extends P
{
    public void c2()
    {
        System.out.println("child");
    }
}


interface  ama
{
    default  void m1()
    {
        System.out.println("default ama m1");
    }
}

interface  amazon
{
    default  void m1()
    {
        System.out.println("default amazon m1");
    }
}
public class Test implements ama, amazon
{
    public static void main(String[] args)
    {
        Ch c = new Ch();

        c.c2();
        c.p1();

        P p = new P();
        p.p1();

        P cp = new Ch();
        cp.p1();

        new Test ().m1();

    }

    @Override
    public void m1() {
        ama.super.m1();
    }
}
