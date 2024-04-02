package com.DurgaNotes.Chapter6_ExceptionHandling;

public class Case4_Finally
{
    // irrespective of whether i handle the exception or not, finally will execute
    public static void main(String[] args)
    {
        try
        {
            System.out.println("try");
            System.out.println(10/0);

        }

        finally {
            System.out.println("Finallly");
        }
    }
}
