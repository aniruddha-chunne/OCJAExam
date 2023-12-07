package com.OCJA.chapter1;

/*

        //49 - Java Basics
        //528 - Answer

        48. What is the result of compiling and executing the following
        application?

        package forecast;
        public class Weather
        {
        private static boolean heatWave = true;
                public static void main()
                {
                        boolean heatWave = false;
                        System.out.print(heatWave);
                 }
        }

                A. true
                B. false
                C. It does not compile.
                D. It compiles but throws an error at runtime.


                48. D. The application compiles without issue, so Option C is
                incorrect. The application does not execute though, as the main()
                method does not have the correct method signature. It is
                missing the required input argument, an array of String. Trying
                to execute the application without a proper entry point produces
                an error, making Option D the correct answer.


*/

public class Que48_Imp
{

    private static boolean heatWave = true;

    public static void main(String[] args)
    {

        boolean heatWave = false;
        System.out.print(heatWave);

    }
}
