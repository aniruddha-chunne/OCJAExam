package com.OCJA.chapter4_arrays;

/*

// 95 - Arrays
// 549 - Answer

22. What happens when calling the following method with a non-null and
non-empty array?
public static void addStationName(String[] names) {
 names[names.length] = "Times Square";
}
A. It adds an element to the array the value of which is Times
Square.
B. It replaces the last element in the array with the value Times
Square.
C. It does not compile.
D. It throws an exception.

    22. D. names.length is the number of elements in the array. The last
    valid index in the array is one less than names.length. In Java,
    arrays do not resize automatically. Therefore, the code throws
    an ArrayIndexOutOfBoundsException.

*/
public class Que22
{
}
