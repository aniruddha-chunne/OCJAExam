package com.OCJA.chapter4_arrays;

/*

        // 97 - Arrays
        // 550 - Answer

        29. What does the following output?
        String[] os = new String[] { "Mac", "Linux", "Windows" };
        Arrays.sort(os);
        System.out.println(Arrays.binarySearch(os, "RedHat"));
        A. -1
        B. -2
        C. -3
        D. The output is not defined.

        29. C. The code sorts before calling binarySearch, so it meets the
        precondition for that method. The target string of "RedHat" is
        not found in the sorted array. If it was found, it would be
        between the second and third element. The rule is to take the
        negative index of where it would be inserted and subtract 1. It
        would need to be inserted as the third element. Since indexes
        are zero based, this is index 2. We take the negative, which is -2,
        and subtract 1, giving -3. Therefore, Option C is correct.


*/


public class Que29_imp
{



}
