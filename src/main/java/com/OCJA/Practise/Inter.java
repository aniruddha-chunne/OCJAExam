package com.OCJA.Practise;

public interface Inter
{
    public void interOne();
    default void one()
    {
        System.out.println("default implementaton");
    }

    public static void staticOne()
    {
        System.out.println("static one method ");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
