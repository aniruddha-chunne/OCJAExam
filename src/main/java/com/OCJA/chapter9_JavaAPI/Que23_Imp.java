package com.OCJA.chapter9_JavaAPI;

/**
 * 198 - JavaAPI
 * 598 - Answer
 *
 * 23. What is the output of the following?
 * 20: List<Character> chars = new ArrayList<>();
 * 21: chars.add('a');
 * 22: chars.add('b');
 * 23: chars.set(1, 'c');
 * 24: chars.remove(0);
 * 25: System.out.print(chars.length());
 * A. 0
 * B. 1
 * C. 2
 * D. None of the above
 *
 * 23. D. Line 25 does not compile. On an ArrayList, the method to get
 * the number of elements is size. The length() method is used for
 * a String or StringBuilder.
 *
 */

public class Que23_Imp {
    public static void main(String[] args) {
        
    }
}
