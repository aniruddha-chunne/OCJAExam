package com.OCJA.chapter1;

public class Que1
{
    //33 - Java Basics
    //521 - Answer
    /*

    1. Which of the following method signatures is a valid declaration
    of an entry point in a Java application?
    A. public void main(String[] args)
    B. public static void main()
    C. private static void start(String[] mydata)
    D. public static final void main(String[] mydata)

    Ans:-
    1. D. An entry point in a Java application consists of a main()
    method with a single String[] argument, return type of void,
    and modifiers public and static. The name of the variable in the
    input argument does not matter. Option A is missing the static
    modifier, Option B is missing the String[] argument, and
    Option C has the wrong access modifier and method name. Only
    Option D fulfills these requirements. Note that the modifier
    final is optional and may be added to an entry point method.

    */

    public static void main(String[] args)
    {
        System.out.println(" Que1 ");
    }
}
