package com.OCJA.chapter4_arrays;

/*

// 102 - Arrays
// 552 - Answer

43. What is the output of the following?
String[][] listing = new String[][] { { "Book" }, { "Game",
"29.99" } };
System.out.println(listing.length + " " + listing[0].length);
A. 2 1
B. 2 2
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

43. A. This array has two elements, making listing.length output 2.
While each array element does not have the same size, this does
not matter because we are only looking at the first element. The
first element has one. This makes the answer Option A.

*/

class Demo
{

}
public class Que43
{

 public static int m1 (int x)
 {
     x = x*2;
     return x;
 }
    public static void main(String[] args)
    {


        int x = 10;
        System.out.println(m1(x));
        System.out.println("Main Method " + x);


    }
}
