package com.OCJA.chapter9_JavaAPI;

/**
 * 198 - JavaAPI
 * 598 - Answer
 *
 * 24. The author of this method forgot to include the data type. Which
 * of the following reference types can fill in the blank to complete
 * this method?
 * public static void secret(_____________ mystery) {
 *  mystery = mystery.replace("1", "8");
 *  mystery.startsWith("paper");
 *  String s = mystery.toString();
 * }
 * A. ArrayList
 * B. String
 * C. StringBuilder
 * D. None of the above
 *
 * 24. B. The toString() method call doesn’t help in narrowing things
 * down as all Java objects have that method available. The other
 * two methods are more helpful. String is the only type of these
 * three to have a startsWith() method, making Option B correct.
 * String also has the replace() method declared here. If you
 * memorized the whole API, you might know that StringBuilder
 * also has a replace() method, but it requires three parameters
 * instead of two. Please don’t memorize the API in that level of
 * detail. We included what you need to know in our study guide. If
 * you do have this outside knowledge, be careful not to read into
 * the questions!
 *
 */

public class Que24
{
    public static void main(String[] args)
    {



    }
}
