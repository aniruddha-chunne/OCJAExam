package com.OCJA.chapter8_HandlingExceptions;

/**
 * 188 - Exceptional_Handling
 * 593 - Answer
 *
 * 49. Given that FileNotFoundException is a subclass of IOException,
 * what is the output of the following application?
 * package storage;
 * import java.io.*;
 * public class Backup {
 *  public void performBackup() {
 *  try {
 *  throw new IOException("Disk not found");
 *  } catch (Exception e) {
 *  try {
 *  throw new FileNotFoundException("File not
 * found");
 *  } catch (FileNotFoundException e) { // z1
 *  System.out.print("Failed");
 *  }
 *  }
 *  }
 *  public static void main(String... files) {
 *  new Backup().performBackup(); // z2
 *  }
 * }
 * A. Failed
 * B. The application compiles but a stack trace is printed at
 * runtime.
 * C. The code does not compile because of line z1.
 * D. The code does not compile because of line z2
 *
 * 49. C. While a catch block is permitted to include an embedded trycatch block, the issue here is that the variable name e is already
 * used by the first catch block. In the second catch block, it is
 * equivalent to declaring a variable e twice. For this reason, line z1
 * does not compile, and Option C is the correct answer. If a
 * different variable name was used for either catch block, then the
 * code would compile without issue, and Option A would be the
 * correct answer
 *
 */

public class Que49_Imp
{
    public static void main(String[] args) {
        
    }
}
