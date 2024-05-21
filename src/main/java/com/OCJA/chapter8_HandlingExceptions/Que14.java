package com.OCJA.chapter8_HandlingExceptions;

/**
 * 173 - Exceptional_Handling
 * 586- Answer
 *
 * 14. Given that FileNotFoundException is a subclass of IOException,
 * what is the output of the following application?
 * package office;
 * import java.io.*;
 * public class Printer {
 *  public void print() {
 *  try {
 *  throw new FileNotFoundException();
 *  } catch (IOException exception) {
 *  System.out.print("Z");
 *  } catch (FileNotFoundException enfe) {
 *  System.out.print("X");
 *  } finally {
 *  System.out.print("Y");
 *  }
 *  }
 *  public static void main(String... ink) {
 *  new Printer().print();
 *  }
 * }
 * A. XY
 * B. ZY
 * C. The code does not compile.
 * D. The code compiles but a stack trace is printed at runtime.
 *
 * c
 *
 * 14. C. The code does not compile because the catch blocks are used
 * in the wrong order. Since IOException is a superclass of
 * FileNotFoundException, the FileNotFoundException is considered
 * unreachable code. For this reason, the code does not compile,
 * and Option C is correct.
 *
 */

public class Que14 {
    public static void main(String[] args) {
        
    }
}
