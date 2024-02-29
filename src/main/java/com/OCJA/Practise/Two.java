package com.OCJA.Practise;

public class Two implements Inter
{
    @Override
    public void interOne()
    {
        System.out.println("Implemented class");

    }

    @Override
    public void one() {
        System.out.println("overrided  default implementation ");
    }



    public static void main(String[] args)
    {
        Two t = new Two();

        t.one();
        Inter.staticOne();
        t.interOne();
        

    }
}
