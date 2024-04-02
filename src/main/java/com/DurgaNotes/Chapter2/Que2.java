package com.DurgaNotes.Chapter2;

public class Que2
{

    public static void main(String[] args)
    {
//        byte b;

//        Example 1:
//        int x='a'; - valid


//        Example 2:
//        double d=10; - valid


//        Example :
//        int x = 130;
//        byte b = (byte)x;
//        System.out.println(b); - valid

//        Example 2:
//        int x=130;
//        byte b=x;
//        System.out.println(b); - invalid

//        Example 3 :
//        int x=150;
//        short s=(short)x;
//        byte b=(byte)x;
//        System.out.println(s); - valid
//        System.out.println(b); - valid

//        Example 4:
//        double d=130.456 ;
//        int x=(int)d ;
//        System.out.println(x); - valid
//        byte b=(byte)d ; - valid
//        System.out.println(b);

        //
        //Q1. Which of the following conversions will be performed automatically in Java?
        //A) int to byte - no
        //B) byte to int - yes
        //C) float to double - yes
        //D) double to float - no
        //E) None of the above


        //Q2. In which of the following cases explicit Type casting is required ?
        //A) int to byte - yes
        //B) byte to int - no
        //C) float to double - no
        //D) double to float - yes
        //E) None of the above


        //Q3. Consider the code
        //int i =100;
        //float f = 100.100f;
        //double d = 123;
        //Which of the following assignments won't compile?
        //A) i=f; - no
        //B) f=i; - yes
        //C) d=f; - yes
        //D) f=d; - no
        //E) d=i; - yes
        //F) i=d; - no


        //Q4. In which of the following cases we will get Compile time error?
        //A) float f =100F; - valid
        //B) float f =(float)1_11.00; - valid
        //C) float f =100; - invalid
        //D) double d = 203.22; - valid
        //float f = d; -  invalid
        //E) int i =100; - valid
        //float f=(float)i; - valid


        //Q5. Consider the code
        //1) public class Test
        //2) {
        //        3) public static void main(String[] args)
        //4) {
        //        5) int a=10;
        //6) float b=10.25f;
        //7) double c=100;
        //8) a = b; - invalid
        //9) b = a; - valid
        //10) c = b; - valid
        //11) c = a; - invalid
        //12) }
        //        13) }
        //Which change will enable the code fragment to compile successfully?
        //A) Replace a = b; with a=(int)b; - valid
        //B) Replace b = a; with b=(float)a;
        //C) Replace c = b; with c=(double)b;
        //D) Replace c = a; with c=(double)a;




    }

}



        //Example 1:
        //int x='a';
        //System.out.println(x);//97

        //Example 2:
        //double d=10;
        //System.out.println(d);//10.0
        //Note: Compiler converts int to double type automatically by implicit type casting.

        //Example:
        //int x=130;
        //byte b=(byte)x;
        //System.out.println(b); //-126


        //Example 2:
        //int x=130;
        //byte b=(byte)x;
        //System.out.println(b); //-126


        //Example 3 :
        //int x=150;
        //short s=(short)x;
        //byte b=(byte)x;
        //System.out.println(s); //150
        //System.out.println(b); //-106

        //Example 4:
        //double d=130.456 ;
        //int x=(int)d ;
        //System.out.println(x);
        //byte b=(byte)d ;
        //System.out.println(b);




            //
            //Q1. Which of the following conversions will be performed automatically in Java?
            //A) int to byte
            //B) byte to int
            //C) float to double
            //D) double to float
            //E) None of the above
            //Answer: B, C

            //Q2. In which of the following cases explicit Type casting is required ?
            //A) int to byte
            //B) byte to int
            //C) float to double
            //D) double to float
            //E) None of the above
            //Answer: A, D

            //Q3. Consider the code
            //int i =100;
            //float f = 100.100f;
            //double d = 123;
            //Which of the following assignments won't compile?
            //A) i=f;
            //B) f=i;
            //C) d=f;
            //D) f=d;
            //E) d=i;
            //F) i=d;
            //Answer: A,D,F

            //Q4. In which of the following cases we will get Compile time error?
            //A) float f =100F;
            //B) float f =(float)1_11.00;
            //C) float f =100;
            //D) double d = 203.22;
            //float f = d;
            //E) int i =100;
            //float f=(float)i;


            //Q5. Consider the code
            //1) public class Test
            //2) {
            //        3) public static void main(String[] args)
            //4) {
            //        5) int a=10;
            //6) float b=10.25f;
            //7) double c=100;
            //8) a = b;
            //9) b = a;
            //10) c = b;
            //11) c = a;
            //12) }
            //        13) }
            //Which change will enable the code fragment to compile successfully?
            //A) Replace a = b; with a=(int)b;
            //B) Replace b = a; with b=(float)a;
            //C) Replace c = b; with c=(double)b;
            //D) Replace c = a; with c=(double)a;
            //Answer: A
