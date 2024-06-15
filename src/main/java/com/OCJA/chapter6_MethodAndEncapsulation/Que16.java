package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 128 - MethodAndEncapsulation
 * 565 - Answer
 *
 * 16. Given the class below, which method signature could be
 * successfully added to the class as an overloaded version of the
 * findAverage() method?
 * public class Calculations {
 *  public Integer findAverage(int sum) { return sum; }
 * }
 * A. public Long findAverage(int sum)
 * B. public Long findAverage(int sum, int divisor)
 * C. public Integer average(int sum)
 * D. private void findAverage(int sum)
 *
 * 16. B. Options A and D would not allow the class to compile because
 * two methods in the class cannot have the same name and
 * arguments, but a different return value. Option C would allow
 * the class to compile, but it is not a valid overloaded form of our
 * findAverage() method since it uses a different method name.
 * Option B is a valid overloaded version of the findAverage()
 * method, since the name is the same but the argument list
 * differs
 *
 */

public class Que16 {
    public static void main(String[] args) {
        
    }
}
