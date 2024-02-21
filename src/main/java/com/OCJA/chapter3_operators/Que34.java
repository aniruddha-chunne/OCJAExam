package com.OCJA.chapter3_operators;
/*

// 81 - operators
// 543 - Answer

34. Which of the following is not a possible result of executing the
following application?
public class ConditionallyLogical {
 public static void main(String... data) {
 if(data.length>=1 && (data[0].equals("sound") || data[0].equals ("logic"))
 && data.length<2) {
 System.out.print(data[0]);
 }
 }
}
A. Nothing is printed.
B. sound is printed.
C. The application throws an exception at runtime.
D. logic is printed.

34. C. The key to understanding this question is to remember that
the conditional conjunction && operator only executes the righthand side of the expression if the left-hand side of the
expression is true. If data is an empty array, then the expression
ends early and nothing is output. The second part of the
expression will return true if data’s first element is sound or
logic. Since we know from the first part of the statement that
data is of length at least one, no exception will be thrown. The
final part of the expression with data.length<2 doesn’t change
the output when data is an array of size one. Therefore, sound
and logic are both possible outputs. For these reasons, Option C
is the only result that is unexpected at runtime.

*/
public class Que34
{

}
