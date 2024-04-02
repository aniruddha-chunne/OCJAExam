package com.DurgaNotes.Chapter6_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// If try with Multiple catch Blocks Present then the Order of catch Blocks are Very
//Important. It should be from Child to Parent
public class case3_TryWithMultipleCatchBlock
{

    public static void main(String[] args)
    {

        // order of catch must be child to parent
        try
        {
//            System.out.println(10/0);
            File a = new File("");
            FileReader fileReader = new FileReader(a);
        }
//        catch(ArithmeticException e)
//        {
//            e.printStackTrace();
//        }

        catch (NullPointerException e)
        {
            e.printStackTrace();
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

}
