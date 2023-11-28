package com.OCJA.chapter1;

public class Que4_Imp
{
/*

    4. Given that a Date class exists in both the java.util and java.sql
    packages, what is the result of compiling the following class?
        1: import java.util.*;
        2: import java.sql.*;
        3: public class BirthdayManager {
        4: private Date rob = new Date();
        5: private java.util.Date sharon = new java.util.Date();
        6: }

    A. The code does not compile because of lines 1 and 2.
    B. The code does not compile because of line 4.
    C. The code does not compile because of line 5.
    D. The code compiles without issue.


Ans:-
    4. B. The fact that the Date class exists in both packages does not
impact the ability to import both packages, so lines 1 and 2
compile without issue, and Option A is incorrect. Line 4 will not
compile because the Date class used is ambiguous, making
Option B correct and Option D incorrect. Finally, Option C is
incorrect because line 5 does compile, as the fully qualified name
of the class is used.

*/

    public static void main(String[] args)
    {

    }
}
