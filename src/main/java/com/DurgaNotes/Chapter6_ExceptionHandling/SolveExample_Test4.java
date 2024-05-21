package com.DurgaNotes.Chapter6_ExceptionHandling;

public class SolveExample_Test4
{
    public static void main(String[] args)
    {
        String[] s= new String[2];
        int i = 0;
        for(String s1: s)
        {
            s[i] = s[i].concat("element" + i); // Corrected concatenation and assignment
            i++;
        }

        for(i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }

    }
}

/*
* What is the result?
A. element 0
 element 1
B. null element 0
 null element 1
C. null
 null
D. A NullPointerException is thrown at runtime
* */