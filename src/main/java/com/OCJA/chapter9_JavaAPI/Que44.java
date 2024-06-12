package com.OCJA.chapter9_JavaAPI;

/**
 * 205 - JavaAPI
 * 601 - Answer
 *
 * 44. What is the smallest unit you can add to a LocalTime object?
 * A. Second
 * B. Millisecond
 * C. Nanosecond
 * D. Picosecond
 *
 * 44. C. The minusNanos and plusNanos are the smallest units available,
 * making Option C correct. Option D is incorrect because
 * LocalTime is not that granular. Note that while you can add
 * milliseconds by adding many nanoseconds, there isn’t a method
 * for it. A millisecond is also larger than a nanosecond. Finally,
 * don’t be tricked by the fact that LocalTime is immutable. You can
 * still add time; it just gets returned as a different object.
 */

public class Que44 {
    public static void main(String[] args) {
        
    }
}
