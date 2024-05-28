package com.OCJA.chapter9_JavaAPI;

import java.util.function.Predicate;

/**
 * 195 - JavaAPI
 * 597 - Answer
 *
 * 16. How many of these lines fail to compile?
 * Predicate<String> pred1 = s ‐> false;
 * Predicate<String> pred2 = (s) ‐> false;
 * Predicate<String> pred3 = String s ‐> false;
 * Predicate<String> pred4 = (String s) ‐> false;
 * A. One
 * B. Two
 * C. Three
 * D. Four
 *
 * 16. A. When creating a lambda with only one parameter, there are a
 * few variants. The pred1 approach shows the shortest way, where
 * the type is omitted and the parentheses are omitted. The pred2
 * approach is similar except it includes the parentheses. Both are
 * legal. The pred4 approach is the long way with both the
 * parentheses and type specified. The only one that doesn’t
 * compile is pred3. The parentheses are required if including the
 * type.
 *
 */

public class Que16 {
    public static void main(String[] args)
    {
//        Predicate<String> pred1 = (String sef) ‐> false;
//
//        System.out.println(pred1.test("le"));
    }
}
