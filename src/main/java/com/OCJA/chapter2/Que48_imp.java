package com.OCJA.chapter2;

/*

  // 66 - Java Data Types
 // 535 - Answer

 48. Which of the following is not a possible output of this code,
assuming it runs to completion?
package store;

public class Toy
{
     public void play()
     {
        System.out.print("play-");
     }
     public void finalize()
     {
        System.out.print("clean-");
     }

     public static void main(String[] args)
     {
         Toy car = new Toy();
         car.play();
         System.gc();
         Toy doll = new Toy();
         doll.play();
     }
}

A. play
B. play-play
C. play-play-clean-
D. play-play-clean-clean

    48. A. Remember that garbage collection is not guaranteed to run on
    demand. If it doesn’t run at all, Option B would be output. If it
    runs at the requested point, Option C would be output. If it runs
    right at the end of the main() method, Option D would be
    output. Option A is the correct answer because play is definitely
    called twice. Note that you are unlikely to see all these scenarios
    if you run this code because we have not used enough memory
    for garbage collection to be worth running. However, you still
    need to be able to answer what could happen regardless of it
    being unlikely.

*/
public class Que48_imp
{
    public static void main(String[] args)
    {

    }
}

/*

  // 66 - Java Data Types
 // 535 - Answer

*/