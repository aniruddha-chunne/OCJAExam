package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 127 - MethodAndEncapsulation
 * 564 - Answer
 *
 * 12. Given the following class, what should be inserted into the two
 * blanks to ensure the class data is properly encapsulated?
 * package storage;
 * public class Box {
 *  public String stuff;
 *  ____________String____________ () {
 *  return stuff;
 *  }
 *  public void setStuff(String stuff) {
 *  this.stuff = stuff;
 *  }
 * }
 * A. public and getStuff
 * B. private and isStuff
 * C. public and setStuff
 * D. None of the above
 *
 * 12. D. The class data, stuff, is declared public, allowing any class to
 * modify the stuff variable and making the implementation
 * inherently unsafe for encapsulation. Therefore, there are no
 * values that can be placed in the two blanks to ensure the class
 * properly encapsulates its data, making Option D correct. Note
 * that if stuff was declared private, Options A, B, and C would all
 * be correct. Encapsulation does not require JavaBean syntax, just
 * that the internal attributes are protected from outside access,
 * which all of these sets of values do achieve.
 *
 */

public class Que12_Imp {
    public static void main(String[] args) {
        
    }
}
