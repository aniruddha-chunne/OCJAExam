package com.OCJA.chapter7_Inheritance;

/**
 * 164 - Inheritance
 * 583 - Answer
 *
 * 50. Given that EOFException is a subclass of IOException, what is the
 * output of the following application?
 * package ai;
 * import java.io.*;
 * class Machine {
 *  public boolean turnOn() throws EOFException {return
 * true;}
 * }
 * public class Robot extends Machine {
 *  public boolean turnOn() throws IOException {return
 * false;}
 *  public static void main(String[] doesNotCompute) throws
 * Exception {
 *  Machine m = new Robot();
 *  System.out.print(m.turnOn());
 *  }
 * }
 * A. true
 * B. false
 * C. The code does not compile.
 * D. The code compiles but produces an exception at runtime.
 *
 * 50. C. The rule for overriding a method with exceptions is that the
 * subclass cannot throw any new or broader checked exceptions.
 * Since IOException is a superclass of EOFException, from the
 * question description, we see that this is a broader exception and
 * therefore not compatible. For this reason, the code does not
 * compile, and Option C is the correct answer.
 */

public class Que50 {
    public static void main(String[] args)
    {
        
    }
}
