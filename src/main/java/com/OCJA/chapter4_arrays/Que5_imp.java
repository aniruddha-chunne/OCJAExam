package com.OCJA.chapter4_arrays;

/*

// 90 - Arrays
// 547 - Answer

        5. Given the following two methods, which method call will not
        compile?
        public void printStormName(String... names) {
         System.out.println(Arrays.toString(names));
        }
        public void printStormNames(String[] names) {
         System.out.println(Arrays.toString(names));
        }
        A. printStormName("Arlene");
        B. printStormName(new String[] { "Bret" });
        C. printStormNames("Cindy");
        D. printStormNames(new String[] { "Don" });

*/

import java.util.Arrays;

public class Que5_imp
{

    public void printStormName(String... names) {
        System.out.println(Arrays.toString(names));
    }
    public void printStormNames(String[] names) {
        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args)
    {
        Que5_imp s = new Que5_imp();
        s.printStormName( new String[] {"Arlenea"} );
        //s.printStormNames("Arlenea" );
    }
}
