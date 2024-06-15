package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 137 - MethodAndEncapsulation
 * 569 - Answer
 *
 * 34. Given the following method declaration, which line can be
 * inserted to make the code compile?
 * public short calculateDistance(double lat1, double lon1,
 *  double lat2, double lon2) {
 *  // INSERT CODE HERE
 * }
 * A. return new Integer(3);
 * B. return new Byte((byte)6);
 * C. return 5L;
 * D. return new Short(4).longValue();
 *
 *34. B. The method calculateDistance() requires a return type that
 * can be easily converted to a short value. Options A, C, and D are
 * incorrect because they each use a larger data type that requires
 * an explicit cast. Option D also does not compile because the
 * Short constructor requires an explicit cast to convert the value of
 * 4, which is assumed to be an int, to a short, as shown in new
 * Short((short)4). Option B is the correct answer since a byte
 * value can be easily promoted to short and returned by the
 * method.
 *
 */

public class Que34 {
    public static void main(String[] args) {


    }
}
