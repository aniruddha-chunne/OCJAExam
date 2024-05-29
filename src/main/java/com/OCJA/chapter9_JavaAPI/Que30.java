package com.OCJA.chapter9_JavaAPI;

/**
 * 200 - JavaAPI
 * 599 - Answer
 *
 * 30. What is the output of the following class?
 * 1: package rocket;
 * 2: public class Countdown {
 * 3: public static void main(String[] args) {
 * 4: String builder = "54321";
 * 5: builder = builder.substring(4);
 * 6: System.out.println(builder.charAt(2));
 * 7: }
 * 8: }
 * A. 2
 * B. 3
 * C. 4
 * D. None of the above
 *
 * 30. D. Line 4 creates a String of length 5. Since String is immutable,
 * line 5 creates a new String with the value 1 and assigns it to
 * builder. Remember that indexes in Java begin with 0, so the
 * substring() method is taking the values from the fifth element
 * through the end. Since the first element is the last element,
 * there’s only one character in there. Then line 6 tries to retrieve
 * the second indexed element. Since there is only one element,
 * this gives a StringIndexOutOfBoundsException, and Option D is
 * correct
 *
 */

public class Que30 {
    public static void main(String[] args) {
        
    }
}
