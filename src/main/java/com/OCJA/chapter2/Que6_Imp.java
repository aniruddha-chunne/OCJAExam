package com.OCJA.chapter2;


/*

 // 52 - Java Data Types
 // 530 - Answer

            6. How many of the following methods compile?
            public String convert(int value)
                {
             return value.toString();
                }
            public String convert(Integer value) {
             return value.toString();
            }
            public String convert(Object value) {
             return value.toString();
            }
            A. None
            B. One
            C. Two
            D. Three

            6. C. Objects have instance methods while primitives do not. Since
            int is a primitive, you cannot call instance methods on it.
            Integer and String are both objects and have instance methods.
            Therefore, Option C is correct.


*/


public class Que6_Imp
{

    public String convert(int value) {
//        return value.toString();
        return null;
    }
    public String convert(Integer value) {
        return value.toString();
    }
    public String convert(Object value) {
        return value.toString();
    }

    public static void main(String[] args) {
        
    }
}

/*

 // 52 - Java Data Types
 // 530 - Answer

*/