package com.OCJA.chapter4_arrays;


/*

// 99 - Arrays
// 551 - Answer

35. How many lines does the following code output?
String[] days = new String[] { "Sunday", "Monday", "Tuesday",
 "Wednesday", "Thursday", "Friday", "Saturday" };
for (int i = 1; i <= days.length; i++)
 System.out.println(days[i]);
A. Six
B. Seven
C. The code does not compile.
D. The code compiles but throws an exception at runtime

35. D. In Java, arrays are indexed starting with 0. While it is
unusual for the loop to start with 1, this does not cause an error.
What does cause an error is the loop ending at data.length,
because the <= operator is used instead of the < operator. The
last loop index is 6, not 7. On the last iteration of the loop, the
code throws an ArrayIndexOutOfBoundsException. Therefore,
Option D is correct

*/

public class Que35 {
}
