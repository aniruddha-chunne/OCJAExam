package com.OCJA.chapter2;

/*

  // 59 - Java Data Types
  // 533 - Answer

        27. Which of the following is true about primitives?
        A. You can call methods on a primitive.
        B. You can convert a primitive to a wrapper class object simply by
        assigning it.
        C. You can convert a wrapper class object to a primitive by calling
        valueOf().
        D. You can store a primitive directly into an ArrayList.

example :
int a = new Integer(25);
        Integer b = 25;

        System.out.println(a);
        System.out.println(b);

        27. B. Option B is an example of autoboxing. Java will automatically
        convert from primitive to wrapper class types and vice versa.
        Option A is incorrect because you can only call methods on an
        object. Option C is incorrect because this method is used for
        converting to a wrapper class from a String. Option D is
        incorrect because autoboxing will convert the primitive to an
        object before adding it to the ArrayList.

*/

public class Que27
{

    public static void main(String[] args) {
        int a = new Integer(25);
        Integer b = 25;

        System.out.println(a);
        System.out.println(b);
    }


}
