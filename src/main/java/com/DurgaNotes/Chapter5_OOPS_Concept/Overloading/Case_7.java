package com.DurgaNotes.Chapter5_OOPS_Concept.Overloading;


class Animal
{
    public void m1()
    {
        System.out.println("Animal");
    }

}

class Dog extends Animal
{
//    public void m1()
//    {
//        System.out.println("Dog");
//    }

}
public class Case_7
{


//    Overloading Method Resolution will always take Care by Compiler based on the
//    Reference Type but not based on Runtime Object.


    public void m1(Animal a)
    {
        System.out.println("Animal");
    }

    public void m1(Dog a)
    {
        System.out.println("Dog");
    }
    public static void main(String[] args)

    {

            Dog t = new Dog();

            Animal t1 = new Animal();

            Animal t2 = new Dog();

            Case_7  s = new Case_7();
            s.m1(t);
            s.m1(t1);
            s.m1(t2);

    }
}
