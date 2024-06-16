package com.OCJA.chapter7_Inheritance;

/**
 * 161 - Inheritance
 * 580 - Answer
 *
 * 37. What is the output of the following application?
 * package musical;
 * interface SpeakDialogue { default int talk() { return 7; }
 * }
 * interface SingMonologue { default int talk() { return 5; }
 * }
 * public class Performance implements SpeakDialogue,
 * SingMonologue {
 *  public int talk(String... x) {
 *  return x.length;
 *  }
 *  public static void main(String[] notes) {
 *  System.out.print(new Performance().talk(notes));
 *  }
 * }
 * A. 7
 * B. 5
 * C. The code does not compile.
 * D. The code compiles without issue, but the output cannot be
 * determined until runtime.
 *
 * 37. C. Java does not allow multiple inheritance, so having one class
 * extend two interfaces that both define the same default method
 * signature leads to a compiler error, unless the class overrides the
 * method. In this case, though, the talk(String...) method
 * defined in the Performance class is not an overridden version of
 * method defined in the interfaces because the signatures do not
 * match. Therefore, the Performance class does not compile since
 * the class inherits two default methods with the same signature
 * and no overridden version, making Option C the correct answer.
 *
 */

public class Que37_Imp_IMp {
    public static void main(String[] args) {
        
    }
}
