package com.OCJA.chapter8_HandlingExceptions;

/**
 * 179 - Exceptional_Handling
 * 589- Answer
 *
 * 30. What is the output of the following application?
 * package pond;
         * abstract class Duck
         * {
         *  protected int count;
         *  public abstract int getDuckies();
         * }
 * public class Ducklings extends Duck

 {
            private int age;

            public Ducklings(int age)
            { this.age = age; }

            public int getDuckies()
            { return this.age/count; }

           public static void main(String[] pondInfo)
            {
               Duck itQuacks = new Ducklings(5);
               System.out.print(itQuacks.getDuckies());
            }

 }
 * A. 0
 * B. 5
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * D
 *
 * 30. D. The code compiles without issue, so Option C is incorrect.
 * The key here is noticing that count, an instance variable, is
 * initialized with a value of 0. The getDuckies() method ends up
 * computing 5/0, which leads to an unchecked
 * ArithmeticException at runtime, making Option D the correct
 * answer
 *
 */

public class Que30 {
    public static void main(String[] args) {
        
    }
}
