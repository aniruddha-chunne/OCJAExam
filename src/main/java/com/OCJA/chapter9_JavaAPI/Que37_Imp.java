package com.OCJA.chapter9_JavaAPI;

/**
 * 202 - JavaAPI
 * 600 - Answer
 *
 * 37. Which of these periods represents a larger amount of time?
 * Period period1 = Period.ofWeeks(1).ofDays(3);
 * Period period2 = Period.ofDays(10);
 * A. period1
 * B. period2
 * C. They represent the same length of time.
 * D. None of the above. This code does not compile.
 *
 * 37. B. Be careful here. The Period class uses a static helper method
 * to return the period. It does not chain method calls, so period1
 * only represents three days. Since three days is less than 10 days,
 * period2 is larger, and Option B is correct
 */

public class Que37_Imp {
    public static void main(String[] args)
    {



    }
}
