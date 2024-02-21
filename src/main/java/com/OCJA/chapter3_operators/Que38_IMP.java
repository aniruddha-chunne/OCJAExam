package com.OCJA.chapter3_operators;

/*

// 83 - operators
// 544 - Answer

38. What variable type of red allows the following application to
compile?
package tornado;
public class Kansas
{
     public static void main(String[] args)
        {
                     int colorOfRainbow = 10;
                     ________ red = 5;

                     switch(colorOfRainbow)
                     {
                         default:
                         System.out.print("Home");
                         break;
                         case red:
                         System.out.print("Away");
                     }
         }
}
A. long
B. double
C. int
D. None of the above





*/

public class Que38_IMP
{
    public static void main(String[] args) {
        int colorOfRainbow = 10;
        final int red = 5;

        switch(colorOfRainbow)
        {
            default:
                System.out.print("Home");
                break;
            case red:
                System.out.print("Away");
        }
    }
}
