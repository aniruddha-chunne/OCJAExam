package com.OCJA.chapter9_JavaAPI;

import java.util.ArrayList;

/**
 * 195 - JavaAPI
 * 597 - Answer
 *
 * 14. What is the output of the following?
 * 20: List<Character> chars = new ArrayList<>();
 * 21: chars.add('a');
 * 22: chars.add('b');
 * 23: chars.set(1, 'c');
 * 24: chars.remove(0);
 * 25: System.out.print(chars.size() + " " +
 * chars.contains('b'));
 * A. 1 false
 * B. 1 true
 * C. 2 false
 * D. 2 true
 *
 *
 * 14. A. Lines 20–22 create an ArrayList with two elements. Line 23
 * replaces the second one with a new value. Now chars is [a, c].
 * Then line 24 removes the first element, making it just [c].
 * Option A is correct because there is only one element, but it is
 * not the value b.
 */

public class Que14 {
    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add("one");
        a.add(2);

        System.out.println(a.size());
        a.remove(0);
        System.out.println(a.get(0));
        System.out.println(a.size());




    }
}
