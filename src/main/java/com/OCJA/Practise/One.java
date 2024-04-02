package com.OCJA.Practise;

import java.util.Arrays;

class P
{

    int x = 777;
    public  void m1()
    {

        System.out.println("parent" + x);
    }
}

class c extends P
{
    int x = 888;
    public void m1()
    {



        System.out.println("child" + x);
    }
}

public class One {

    {
        System.out.println("Hiee i am instance block");
    }

    public static void main(String[] args)
    {

            P p = new c();
        System.out.println(p.x);
        

    }
}
