package com.DurgaNotes.Chapter6_ExceptionHandling;

     public class SolveExample2_Test
     {
             void readCard(int cno) throws Exception
             {
                System.out.println("Rearding Card");
             }
             void checkCard(int cno) throws RuntimeException//Line-1
             {
                System.out.println("Checking Card");
             }
             public static void main(String[] args) throws Exception
             {
                     SolveExample2_Test t = new SolveExample2_Test();
                     int cardNo=1234;
                     t.checkCard(cardNo);//Line-2
                     t.readCard(cardNo);//Line-3


             }
     }

/*
     What is the result?
     A. Checking Card
     Reading Card
     B. Compilation Fails at Line-1
     C. Compilation Fails at Line-2
     D. Compilation Fails at Line-3
     E. Compilation Fails at Line-2 and Line-3

 */