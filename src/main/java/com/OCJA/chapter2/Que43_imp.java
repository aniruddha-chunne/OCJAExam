package com.OCJA.chapter2;

/*

  // 63 - Java Data Types
 // 535 - Answer

    43. Which of the following is the output of this code, assuming it runs
    to completion?
    package store;
    public class Toy
    {
         public void play()
         {
         System.out.print("play-");
         }

         public void finalizer()
         {
         System.out.print("clean-");
         }

         public static void main(String[] fun)
         {
             Toy car = new Toy();
             car.play();
             System.gc();
             Toy doll = new Toy();
             doll.play();
         }
    }
    A. play
    B. play-play-
    C. play-clean-play
    D. play-play-clean-clean

    43. B. If there was a finalize() method, this would be a different
    story. However, the method here is finalizer. Tricky! That’s just
    a normal method that doesn’t get called automatically.
    Therefore clean is never output.

*/
public class Que43_imp
{

}

/*

  // 63 - Java Data Types
 // 535 - Answer

*/