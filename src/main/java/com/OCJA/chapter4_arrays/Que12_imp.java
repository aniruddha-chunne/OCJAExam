package com.OCJA.chapter4_arrays;

/*

 // 92 - Arrays
// 547 - Answer


        12. How many of the following are legal declarations?
        String lion [] = new String[] {"lion"};
        String tiger [] = new String[1] {"tiger"};
        String bear [] = new String[] {};
        String ohMy [] = new String[0] {};
        A. None
        B. One
        C. Two
        D. Three

        12. C. When using an array initializer, you are not allowed to specify
        the size separately. The size is inferred from the number of
        elements listed. Therefore, tiger and ohMy are incorrect. When
        you’re not using an array initializer, the size is required. An
        empty array initializer is allowed. Option C is correct because
        lion and bear are legal.

*/

public class Que12_imp
{
    public static void main(String[] args)
    {
        String lion [] = new String[] {"lion"};
//      String tiger [] = new String[1] {"tiger"}; = not allowed
        String ohMy [] = new String[0] ; //- allowed
        // String ohMy1 [] = new String[0] {} ; //-not allowed
        String bear [] = new String[] {}; // allowed


    }
}
