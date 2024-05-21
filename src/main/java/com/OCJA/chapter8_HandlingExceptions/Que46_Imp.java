package com.OCJA.chapter8_HandlingExceptions;

/**
 * 186 - Exceptional_Handling
 * 593 - Answer
 *
 * 46. What is the output of the following application?
 * package broken;
 * class Problem implements RuntimeException {}
 * public class BiggerProblem extends Problem {
 *  public static void main(String uhOh[]) {
 *  try {
 *  throw new BiggerProblem();
 *  } catch (BiggerProblem re) {
 *  System.out.print("Problem?");
 *  } catch (Problem e) {
 *  System.out.print("Handled");
 *  } finally {
 *  System.out.print("Fixed!");
 *  }
 *  }
 * }
 * A. Problem?Fixed!
 * B. Handled.Fixed!
 * C. Problem?Handled.Fixed!
 * D. The code does not compile.
 *
 * 46. D. The class RuntimeException is not an interface and it cannot
 * be implemented. For this reason, the Problem class does not
 * compile, and Option D is the correct answer. Note that this is the
 * only compilation problem in the application. If implements was
 * changed to extends, the code would compile and Problem?Fixed!
 * would be printed, making Option A the correct answer.
 *
 * 
 */

public class Que46_Imp {


    public static void main(String[] args) {
        
    }
}
