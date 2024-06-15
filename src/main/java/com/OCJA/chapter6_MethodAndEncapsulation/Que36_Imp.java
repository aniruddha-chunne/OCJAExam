package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 137 - MethodAndEncapsulation
 * 569 - Answer
 *
 * 36. How many lines of code would need to be removed for the
 * following class to compile?
 * package work;
 * public class Week {
 *  private static final String monday;
 *  String tuesday;
 *  final static wednesday = 3;
 *  final protected int thursday = 4;
 * }
 * A. One
 * B. Two
 * C. Three
 * D. The code will not compile regardless of the number of lines
 * removed.
 *
 * 36. C. The declaration of monday does not compile, because the value
 * of a static final variable must be set when it is declared or in a
 * static initialization block. The declaration of tuesday is fine and
 * compiles without issue. The declaration of wednesday does not
 * compile because there is no data type for the variable. Finally,
 * the declaration of thursday does not compile because the final
 * modifier cannot appear before the access modifier. For these
 * reasons, Option C is the correct answer.
 *
 */

public class Que36_Imp
{
    public static void main(String[] args)
    {

    }
}
