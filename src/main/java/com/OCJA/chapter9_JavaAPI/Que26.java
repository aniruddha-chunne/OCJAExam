package com.OCJA.chapter9_JavaAPI;

/**
 * 199  - JavaAPI
 * 599  - Answer
 *
 * 26. Which of the following can fill in the blank to make the code
 * compile?

 * import java.util.function.*;
 * public class Card
 * {
           public static void main(String[] s)
           {
                  Predicate<String> pred = ____________ ‐> true;
           }
 * }

 * A. (Integer i)
 * B. (Object o)
 * C. (String s)
 * D. None of the above
 *
 * 26. D. The type in the lambda must match the generic declared on
 * the Predicate. In this case, that is String. Therefore, Options A
 * and B are incorrect. While Option C is of the correct type, it uses
 * the variable s, which is already in use from the main() method
 * parameter. Therefore, none of these are correct, and Option D is
 * the answer.
 *
 */

public class Que26 {
    public static void main(String[] args) {
        
    }
}
