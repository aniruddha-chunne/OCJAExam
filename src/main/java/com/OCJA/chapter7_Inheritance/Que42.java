package com.OCJA.chapter7_Inheritance;

/**
 * 161- Inheritance
 * 581- Answer
 *
 * 42. Given the class definitions below, which value, when inserted
 * into the blank line, does not allow the class to compile?
 * public class Canine {}
 * public class Dog extends Canine {}
 * public class Wolf extends Canine {}
 * public final class Husky extends Dog {}
 * public class Zoologist {
 *  Canine animal;
 *  public final void setAnimal(Dog animal) { this.animal =
 * animal; }
 *  public static void main(String[] furryFriends) {
 *  new Zoologist().setAnimal(_____________);
 *  }
 * }
 * A. new Husky()
 * B. new Dog()
 * C. new Wolf()
 * D. null
 *
 * 42. C. The setAnimal() method requires an object that is Dog or a
 * subclass of Dog. Since Husky extends Dog, Options A and B both
 * allow the code to compile. Option D is also valid because a null
 * value does not have a type and can be assigned to any reference
 * variable. Option C is the only value that prevents the code from
 * compiling because Wolf is not a subclass of Dog. Even though
 * Wolf can be assigned to the instance Canine variable, the setter
 * requires a compatible parameter.
 */

public class Que42 {
    public static void main(String[] args) {
        
    }
}
