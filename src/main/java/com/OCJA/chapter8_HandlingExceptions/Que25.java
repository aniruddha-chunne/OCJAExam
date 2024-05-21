package com.OCJA.chapter8_HandlingExceptions;

/**
 * 178 - Exceptional_Handling
 * 589 - Answer
 *
 * 25. In the following application, the value of list has been omitted.
 * Assuming the code compiles without issue, which one of the
 * following is not a possible output of executing this class?
 * package checkboard;
 * public class Attendance {
 *  private Boolean[] list = // value omitted
 *  public int printTodaysCount() {
 *  int count=0;
 *  for(int i=0; i<10; i++) {
 *  if(list[i]) ++count;
 *  }
 *  return count;
 *  }
 *  public static void main(String[] roster) {
 *  new Attendance().printTodaysCount();
 *  }
 * }
 * A. A stack trace for NullPointerException is printed.
 * B. A stack trace for ArrayIndexOutOfBoundsException is printed.
 * C. A stack trace for ClassCastException is printed.
 * D. None of the above
 *
 * C
 *
 * 25. D. A NullPointerException can be thrown if the value of list is
 * null. Likewise, an ArrayIndexOutOfBoundsException can be
 * thrown if the value of list is an array with fewer than 10
 * elements. Finally, a ClassCastException can be thrown if list is
 * assigned an object that is not of type Boolean[]. For example, the
 * assignment list = (Boolean[]) new Object() will compile
 * without issue but throws a ClassCastException at runtime.
 * Therefore, the first three options are possible, making Option D
 * the correct answer.
 */

public class Que25
{
    public static void main(String[] args)
    {

    }

}
