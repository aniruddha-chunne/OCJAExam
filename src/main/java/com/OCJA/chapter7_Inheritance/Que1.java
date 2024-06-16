package com.OCJA.chapter7_Inheritance;

/**
 * 145 - Inheritance
 * 573 - Answer
 *
 * 1. How many lines of the following program contain compilation
 * errors?
 * package theater;
 * class Cinema {
 *  private String name;
 *  public Cinema(String name) {this.name = name;}
 * }
 * public class Movie extends Cinema {
 *  public Movie(String movie) {}
 *  public static void main(String[] showing) {
 *  System.out.print(new Movie("Another Trilogy").name);
 *  }
 * }
 * A. None
 * B. One
 * C. Two
 * D. Three
 *
 *1. C. The code does not compile, so Option A is incorrect. This code
 * does not compile for two reasons. First, the name variable is
 * marked private in the Cinema class, which means it cannot be
 * accessed directly in the Movie class. Next, the Movie class defines
 * a constructor that is missing an explicit super() statement. Since
 * Cinema does not include a no-argument constructor, the noargument super() cannot be inserted automatically by the
 * compiler without a compilation error. For these two reasons, the
 * code does not compile, and Option C is the correct answer.
 */

public class Que1
{
    public static void main(String[] args)
    {

    }
}
