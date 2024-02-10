package com.OCJA.chapter4_arrays;


/*

// 88 - Arrays
// 547 - Answer

        3. Which of the following are primitives?
        int[] lowercase = new int[0];
        Integer[] uppercase = new Integer[0];
        A. Only lowercase
        B. Only uppercase
        C. Bother lowercase and uppercase
        D. Neither lowercase nor uppercase

        3. D. Trick question! While int is a primitive, all arrays are objects.
        One way to tell is that an array has a public instance variable
        called length. Another way is that you can assign it a variable of
        type Object. Therefore, Option D is correct.

*/

public class Que3_imp
{
    static int b;
    public static void main(String[] args) {
        int [][] x = new int [1][3];

        System.out.println(b);
        for(int i=0; i<x.length; i++)
        {
            System.out.println(x[i].length);

            for(int j=0; j>x[i].length; j++ )
            {
                System.out.println("Hiee");
            }

        }


    }
}
