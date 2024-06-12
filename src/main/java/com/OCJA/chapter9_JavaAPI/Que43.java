package com.OCJA.chapter9_JavaAPI;

/**
 * 204 - JavaAPI
 * 601 - Answer
 *
 *
 * 43. The author of this method forgot to include the data type. Which
 * of the following reference types can best fill in the blank to
 * complete this method?
 * public static void secret(_____________ mystery) {
 *  char ch = mystery.charAt(3);
 *  mystery = mystery.insert(1, "more");
 *  int num = mystery.length();
 * }
 * A. ArrayList
 * B. String
 * C. StringBuilder
 * D. None of the above
 *
 * C
 *
 * 43. C. ArrayList has a size() method rather than a length()
 * method, making Option A incorrect. The charAt() and length()
 * methods are declared on both String and StringBuilder.
 * However, the insert() method is only declared on a
 * StringBuilder and not a String. Therefore, Option C is correct.
 *
 */

public class Que43 {
    public static void main(String[] args)
    {



    }
}
