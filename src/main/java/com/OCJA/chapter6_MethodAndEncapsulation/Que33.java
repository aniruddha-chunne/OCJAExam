package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 136 - MethodAndEncapsulation
 * 568 - Answer
 *
 * 33. Which of the following statements is true?
 * A. An instance method is allowed to reference a static
 * variable.
 * B. A static method is allowed to reference an instance
 * variable.
 * C. A static initialization block is allowed to reference an
 * instance variable.
 * D. A final static variable may be set in a constructor.
 *
 * 33. A. An instance method or constructor has access to all static
 * variables, making Option A correct. On the other hand, static
 * methods and static initializers cannot reference instance
 * variables since they are defined across all instances, making
 * Options B and C incorrect. Note that they can access instance
 * variables if they are passed a reference to a specific instance, but
 * not in the general case. Finally, Option D is incorrect because
 * static final variables must be set when they are declared or in
 * a static initialization block.
 */

public class Que33 {
    public static void main(String[] args) {
        
    }
}
