package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 132 - MethodAndEncapsulation
 * 567 - Answer
 *
 * 24. Which statement(s) about the following class would help to
 * properly encapsulate the data in the class?
 * package shield;
 * public class Protect {
 *  private String material;
 *  protected int strength;
 *  public int getStrength() {
 *  return strength;
 *  }
 *  public void setStrength(int strength) {
 *  this.strength = strength;
 *  }
 * }
 * I. Change the access modifier of strength to private.
 * II. Add a getter method for material.
 * III. Add a setter method for material.
 * A. I
 * B. II and III
 * C. I, II, and III
 * D. None, the data in the class is already encapsulated.
 *
 * 24. A. The access modifier of strength is protected, meaning
 * subclasses and classes within the same package can modify it.
 * Changing the value to private would improve encapsulation by
 * making the Protect class the only one capable of directly
 * modifying it. For these reasons, the first statement is correct.
 * Alternatively, the second and third statements do not improve
 * the encapsulation of the class. While having getters and setters
 * for private variables is helpful, they are not required.
 * Encapsulation is about protecting the data elements. With this
 * in mind, it is clear the material variable is already protected.
 * Therefore, Option A is the correct answer.
 */

public class Que24_Imp {
    public static void main(String[] args) {
        
    }
}
