package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 126 - MethodAndEncapsulation
 * 563 - Answer
 *
 * 7. Which of the following statements about calling this() in a
 * constructor is not true?
 * A. If this() is used, it must be the first line of the constructor.
 * B. If super() and this() are both used in the same constructor,
 * super() must appear on the line immediately after this().
 * C. If arguments are provided to this(), then there must be a
 * constructor in the class able to take those arguments.
 * D. If the no-argument this() is called, then the class must
 * explicitly implement the no-argument constructor.
 *
 * 7. B. Options A, C, and D are true statements about calling this()
 * inside a constructor. Option B is incorrect because a constructor
 * can only call this() or super() on the first line of the
 * constructor, but never both in the same constructor. If both
 * constructors were allowed to be called, there would be two
 * separate calls to super(), leading to duplicate initialization of
 * parent constructors, since the other constructor referenced by
 * this() would also call super() (or be chained to one that
 * eventually calls super()).
 *
 */

public class Que7 {
    public static void main(String[] args) {
        
    }
}
