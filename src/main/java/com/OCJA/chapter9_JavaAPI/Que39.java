package com.OCJA.chapter9_JavaAPI;

/**
 * 203 - JavaAPI
 * 601 - Answer
 *
 * 39. Which of the following can fill in the blank so the following code
 * prints true?
 * String happy = " :) - (: ";
 * String really = happy.trim();
 * String question = ______________________;
 * System.out.println(really.equals(question));
 * A. happy.substring(0, happy.length() - 1)
 * B. happy.substring(0, happy.length())
 * C. happy.substring(1, happy.length() - 1)
 * D. happy.substring(1, happy.length())
 *
 * 39. C. The trim() method returns a String with all leading and
 * trailing white space removed. In this question, that’s the sevencharacter String: ":) - (:". Options A and B are incorrect
 * because they do not remove the first blank space in happy.
 * Option D is incorrect because it does not remove the last
 * character in happy. Therefore, Option C is correct.
 */

public class Que39 {
    public static void main(String[] args) {
        
    }
}
