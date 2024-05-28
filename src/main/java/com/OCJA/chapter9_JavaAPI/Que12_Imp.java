package com.OCJA.chapter9_JavaAPI;

/**
 * 194 - JavaAPI
 * 596 - Answer
 *
 * 12. The author of this method forgot to include the data type. Which
 * of the following reference types can fill in the blank to complete
 * this method?
 * public static void secret( ____________mystery) {
 *  mystery.add("metal");
 *  String str = mystery.get(0);
 *  int num = mystery.length();
 * }
 * A. ArrayList
 * B. ArrayList<String>
 * C. StringBuilder
 * D. None of the above
 *
 * 12. D. The add() and get() methods are available on ArrayList.
 * However, ArrayList uses size rather than length to get the
 * number of elements. Therefore, Option D is correct. If length
 * was changed to size, Option B would compile if put in the blank.
 * Option A still wouldn’t compile in the blank because a cast
 * would be needed to store the value in str.
 */

public class Que12_Imp {
    public static void main(String[] args)
    {
        
    }
}
