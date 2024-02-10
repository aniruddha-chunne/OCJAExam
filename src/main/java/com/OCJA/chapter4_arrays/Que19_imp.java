package com.OCJA.chapter4_arrays;

/*

// 93 - Arrays
// 547 - Answer

19. How many objects are created when running the following code?
Integer[] lotto = new Integer[4];
lotto[0] = new Integer(1_000_000);
lotto[1] = new Integer(999_999);
A. Two
B. Three
C. Four
D. Five

19. B. The first line creates one object; the array itself. While there
are four references to null in that array, none of those are
objects. The second line creates one object and points one of the
array references to it. So far there are two objects: the array itself
and one object it is referencing. The third line does the same,
bringing up the object count to three. Therefore, Option B is
correct.


*/
public class Que19_imp
{

}
