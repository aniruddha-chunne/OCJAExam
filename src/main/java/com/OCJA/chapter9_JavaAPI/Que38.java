package com.OCJA.chapter9_JavaAPI;

/**
 * 203 - JavaAPI
 * 600 - Answer
 *
 * 38. What is the result of the following?
 * import java.time.*;
 * import java.time.format.*;
 * public class HowLong {
 *  public static void main(String[] args) {
 *  LocalDate newYears = LocalDate.of(2017, 1, 1);
 *  Period period = Period.ofDays(1);
 *  DateTimeFormatter format =
 * DateTimeFormatter.ofPattern("MM-dd-yyyy");
 *
 * System.out.print(format.format(newYears.minus(period)));
 *  }
 * }
 *
 * A. 01-01-2017
 * B. 12-31-2016
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * 38. B. The code starts by correctly creating a date representing
 * January 1, 2017, and a period representing one day. It then
 * explicitly defines the format as month followed by day followed
 * by year. Finally, the code subtracts a day, giving us the
 * formatted version of December 31, 2016
 *
 */

public class Que38 {
    public static void main(String[] args) {
        
    }
}
