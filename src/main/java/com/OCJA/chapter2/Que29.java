package com.OCJA.chapter2;

/*

  // 60 - Java Data Types
 // 533 - Answer

        29. Given the following code, fill in the blank to have the code print
        bounce.
        public class TennisBall
        {

                public TennisBall()
                {
                    System.out.println("bounce");
                }
                public static void main(String[] slam)
                {
                    _____________________
                }
        }

        A. TennisBall;
        B. TennisBall();
        C. new TennisBall;
        D. new TennisBall();

*/


public class Que29
{

    public void var(int...x)
    {
        System.out.println(x.length);
        int sum=0;
        for(int a :x)
        {
            sum = sum + a;
        }
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        new Que29().var(20,30,40,50,60,70);

    }
}

/*

  // 60 - Java Data Types
 // 533 - Answer


*/