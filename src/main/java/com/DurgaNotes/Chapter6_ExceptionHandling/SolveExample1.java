package com.DurgaNotes.Chapter6_ExceptionHandling;

import java.io.IOException;

class X
 {
     public void printFileContent() throws IOException
            {
                    //Line-1
                    throw new IOException();//Line-2
            }

 }
public class SolveExample1
{
    public static void main(String[] args)  // Line 3
    {
        X x= new X();
        try {
            x.printFileContent();//Line-4
        }
        catch (IOException e)
        {}

         //Line-5
    }
}

//Which two modifications required to compile code successfully?