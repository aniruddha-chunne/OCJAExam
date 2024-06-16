package com.OCJA.chapter7_Inheritance;

/**
 * 145 - Inheritance
 * 573 - Answer
 *
 * 3. What is the output of the following application?
 * package radio;
 * public class Song {
 *  public void playMusic() {
 *  System.out.print("Play!");
 *  }
 *  private static int playMusic() {
 *  System.out.print("Music!");
 *  }
 *  public static void main(String[] tracks) {
 *  new Song().playMusic();
 *  }
 * }
 * A. Play!
 * B. Music!
 * C. The code does not compile.
 * D. The code compiles but the answer cannot be determined
 * until runtime.
 *
 *
 * 3. C. A class cannot contain two methods with the same method
 * signature, even if one is static and the other is not. Therefore,
 * the code does not compile because the two declarations of
 * playMusic() conflict with one another, making Option C the
 * correct answer.
 *
 */

public class Que3 {
    public static void main(String[] args) {
        
    }
}
