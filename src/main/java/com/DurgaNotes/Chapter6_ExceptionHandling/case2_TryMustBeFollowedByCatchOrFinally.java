package com.DurgaNotes.Chapter6_ExceptionHandling;


// try must be followed by catch or finally ortherwise error will be generateed
public class case2_TryMustBeFollowedByCatchOrFinally
{
    public static void main(String[] args) {

        try {
            System.out.println("Try");
        }
        catch (Exception e)
        {
            System.out.println("Catch");
        }
        finally
        {
            System.out.println("finally");
        }


    }
}
