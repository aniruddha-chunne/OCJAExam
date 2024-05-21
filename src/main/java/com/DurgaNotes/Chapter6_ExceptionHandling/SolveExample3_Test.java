package com.DurgaNotes.Chapter6_ExceptionHandling;

class MyException1 extends RuntimeException
{
}
public class SolveExample3_Test
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            m1();
        }
        catch (MyException1 e )
        {
            System.out.print("A");
        }

    }
    public static void m1() throws Exception
    {
        try
        {
            throw Math.random() > 0.5 ? new Exception():new MyException1();
        }
        catch (RuntimeException e)
        {
            System.out.println("B");
        }
    }
}
