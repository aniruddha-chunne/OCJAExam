package com.OCJA.chapter9_JavaAPI;

/**
 * 191 - JavaAPI
 * 595 - Answer
 *
 * 3. Which of the following creates a StringBuilder with a different
 * value than the other options?
 * A. new StringBuilder().append("clown")
 * B. new StringBuilder("clown")
 * C. new StringBuilder("cl").insert(2, "own")
 * D. All of them create the same value.
 *
 * D
 *
 * 3. D. This question is testing whether you understand how method
 * chaining works. Option A creates an empty StringBuilder and
 * then adds the five characters in clown to it. Option B simply
 * creates the clown when calling the constructor. Finally, Option C
 * creates the same value, just in two parts. Therefore, Option D is
 * correct.
 *
 */

public class Que3_Imp {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("cl");
//        System.out.println(sb.append("clown"));
//        System.out.println(sb);
        System.out.println(sb.insert(2,"own"));
        
    }
}
