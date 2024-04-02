package com.DurgaNotes.Chapter6_ExceptionHandling;

//finally Vs return:
//If return Statement Present Inside try OR catch Blocks 1st finally will be executed and
//after that Only return Statement will be Considered i.e. finally Block Dominates return
//Statement.
public class case5_finaalyVsreturn
{

    public static int m1()
    {
        try {
            return 888;
        }
        catch (Exception e)
        {
            return 777;
        }
        finally {
            return 999;
        }
    }
    public static void main(String[] args) {
        System.out.println(m1() ); // always 999
    }


}
