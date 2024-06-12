package com.OCJA.chapter9_JavaAPI;

/**
 * 205 - JavaAPI
 * 601 - Answer
 *
 * 45. What is the result of the following?
 * import java.time.*;
 * import java.time.format.*;
 * public class HowLong {
 *  public static void main(String[] args) {
 *  LocalDate newYears = LocalDate.of(2017, 1, 1);
 *  Period period = Period.ofDays(1);
 *  DateTimeFormatter format =
 * DateTimeFormatter.ofPattern("mm-dd-yyyy");
 *
 * System.out.print(format.format(newYears.minus(period)));
 *  }
 * }
 * A. 01-01-2017
 * B. 12-31-2016
 * C. The code does not compile.
 * D. The code compiles but throws an exception at runtime.
 *
 * 45. D. When creating a formatter object, remember that MM
 * represents month while mm represents minute. Since there are
 * not minutes defined on a LocalDate object, the code throws an
 * UnsupportedTemporalTypeException. You don’t need to know the
 * name of the exception, but you do need to know that an
 * exception is thrown.
 */

public class Que45_Imp {
    public static void main(String[] args) {

    }
}
