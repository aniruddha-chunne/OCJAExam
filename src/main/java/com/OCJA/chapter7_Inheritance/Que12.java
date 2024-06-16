package com.OCJA.chapter7_Inheritance;

/**
 * 148 - Inheritance
 * 575 - Answer
 *
 * 12. Given that FileNotFoundException is a subclass of IOException,
 * what is the output of the following application?
 * package edu;
 * import java.io.*;
 * class School {
 *  public int getNumberOfStudentsPerClassroom(String...
 * students) throws IOException {
 *  return 3;
 *  }
 *  public int getNumberOfStudentsPerClassroom() throws
 * IOException {
 *  return 9;
 *  }
 * }
 * public class HighSchool extends School {
 *  public int getNumberOfStudentsPerClassroom() throws
 * FileNotFoundException {
 *  return 2;
 *  }
 *  public static void main(String[] students) throws
 * IOException {
 *  School school = new HighSchool();
 *
 * System.out.print(school.getNumberOfStudentsPerClassroom());
 *  }
 * }
 * A. 2
 * B. 3
 * C. 9
 * D. The code does not compile.
 *
 * A
 *
 * 12. A. The code compiles without issue, so Option D is incorrect.
 * The rule for overriding a method with exceptions is that the
 * subclass cannot throw any new or broader checked exceptions.
 * Since FileNotFoundException is a subclass of IOException, it is
 * considered a narrower exception, and therefore the overridden
 * method is allowed. Due to polymorphism, the overridden
 * version of the method in HighSchool is used, regardless of the
 * reference type, and 2 is printed, making Option A the correct
 * answer. Note that the version of the method that takes the
 * varargs is not used in this application.
 */

public class Que12 {
    public static void main(String[] args) {
        
    }
}
