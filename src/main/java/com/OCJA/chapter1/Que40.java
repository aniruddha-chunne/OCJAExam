package com.OCJA.chapter1;

/*

//45 - Java Basics
//527 - Answer

        40. Given that a Math class exists in both the java.lang and
        pocket.complex packages, what is the result of compiling the
        following class?
        1: package pocket;
        2: import pocket.complex.*;
        3: import java.util.*;
        4: public class Calculator {
        5: public static void main(String[] args) {
        6: System.out.print(Math.floor(5));
        7: }
        8: }
        A. The code does not compile because of line 2.
        B. The code does not compile because of line 3.
        C. The code does not compile because of line 6.
        D. The code compiles without issue.


        40. C. Remember that java.lang is automatically imported in all
        Java classes, therefore both java.lang.Math and
        pocket.complex.Math are both imported into this class.
        Importing both sets of packages does not cause any compilation
        issues, making Option A incorrect. Line 3 is unnecessary import
        but including it does not prevent the class from compiling,
        making Option B incorrect. While both versions of Math may be
        imported into the class, the usage of the Math class requires a
        package name. Because of this, line 6 does not compile as the
        class reference is ambiguous, making Option C the correct
        answer and Option D incorrect


*/

public class Que40 {
}
