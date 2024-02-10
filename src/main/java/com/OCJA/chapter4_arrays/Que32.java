package com.OCJA.chapter4_arrays;

/*

// 98 - Arrays
// 551 - Answer

        32. What is the output of the following when run as java unix.EchoFirst
        seed flower?
        package unix;
        import java.util.*;
        public class EchoFirst {
         public static void main(String[] args) {
         String one = args[0];
         Arrays.sort(args);
         int result = Arrays.binarySearch(args, one);
         System.out.println(result);
         }
        }
        A. 0
        B. 1
        C. The code does not compile.
        D. The code compiles but throws an exception at runtime.

        32. B. This class is called with two arguments. The first one (seed) is
        stored in the variable one. Then the array is sorted, meeting the
        precondition for binary search. Binary search returns 1 because
        seed is the second element in the sorted array, and Java uses
        zero-based indexes. Option B is correct.

*/
public class Que32
{

}
