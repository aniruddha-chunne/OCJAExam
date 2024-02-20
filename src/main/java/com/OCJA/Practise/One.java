package com.OCJA.Practise;

import java.util.Arrays;

public class One
{

    {
        System.out.println("Hiee i am instance block");
    }

    public static void main(String[] args)

    {

            int [][] x = new int [3][4];
            x[0] = new int [] {1,2,3,4,5};
            int i=1;
            for(int[] y: x)
            {

                for (int s: y)
                {
                    System.out.println(i++);
                }
            }

            }

    }

