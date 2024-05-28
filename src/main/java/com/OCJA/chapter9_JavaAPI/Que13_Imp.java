package com.OCJA.chapter9_JavaAPI;

import java.util.function.Predicate;

/**
 * 194 - JavaAPI
 * 596 - Answer
 *
 * 13. Which portion of code can be removed so that this line of code
 * continues to compile?
 * Predicate<StringBuilder> p = (StringBuilder b) ‐> {return
 * true;};
 * A. Remove StringBuilder b
 * B. Remove ->
 * C. Remove { and ;}
 * D. Remove { return and ;}
 *
 * 13. D. Option A is tricky, but incorrect. While a lambda can have
 * zero parameters, a Predicate cannot. A Predicate is defined as a
 * type mapping to a boolean. Option B is clearly incorrect as ->
 * separates the parts of a lambda. Options C and D are similar.
 * Option C is incorrect because return is only allowed when the
 * brackets are present. Option D is correct.
 *
 */

interface one<T>
{
    public boolean test(T t);
}

public class Que13_Imp {
    public static void main(String[] args) {





    }
}
