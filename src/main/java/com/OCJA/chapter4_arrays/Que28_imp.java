package com.OCJA.chapter4_arrays;

/*

 // 96 - Arrays
// 550 - Answer

        28. What is the result of running the following program?
        1: package fun;
        2: public class Sudoku {
        3: static int[][] game = new int[6][6];
        4:
        5: public static void main(String[] args) {
        6: game[3][3] = 6;
        7: Object[] obj = game;
        8: obj[3] = "X";
        9: System.out.println(game[3][3]);
        10: }
        11: }
        A. X
        B. The code does not compile.
        C. The code compiles but throws a NullPointerException at
        runtime.
        D. The code compiles but throws a different exception at runtime.

        28. D. Line 6 assigns an int to a cell in a 2D array. This is fine. Line
        7 casts to a general Object[]. This is dangerous, but legal. Why is
        it dangerous, you ask? That brings us to line 8. The compiler
        can’t protect us from assigning a String to the int[] because the
        reference is more generic. Therefore, line 8 throws an
        ArrayStoreException because the type is incorrect, and Option D
        is correct. You couldn’t have assigned an int on line 8 either
        because obj[3] is really an int[] behind the scenes and not an
        int.


*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class Que28_imp
{

    static int[][] game = new int[6][6];
    public static void main(String[] args)
    {

    /*
            //        game[3][3] = 6;
            //        Object[] obj = game;
            //
            //        System.out.println(Arrays.toString(obj));
            //
            //        for(Object x : obj)
            //        {
            //            System.out.println(Arrays.toString((int[]) x));
            //        }

            //        System.out.println(obj);

            //        System.out.println(game[3][3]);

    */

        int [] x = new int [1];
        x[0] = Integer.parseInt("X");

    }
}
