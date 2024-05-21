package com.DurgaNotes.Chapter6_ExceptionHandling;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;


class throwNewException extends IOException
{}

class throwNewException2 extends throwNewException
{}


public class practice_ExceptionHandling
{


    public static void throwException2() throws IOException
    {
            throwException();
    }
    public static void throwException() throws IOException
    {
//        throw new throwNewException();
//        throw new IOException();

        throw new throwNewException2();

    }

    public static void main(String[] args) throws IOException
    {

//       throwException2();

        try {
                System.out.println("Hello");
            }
        catch (ArithmeticException e)
            {
                e.printStackTrace();
            }

    }

}
