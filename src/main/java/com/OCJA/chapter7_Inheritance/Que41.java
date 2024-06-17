package com.OCJA.chapter7_Inheritance;

/**
 * 161- Inheritance
 * 581- Answer
 *
 * 41. Given the following method and the fact that
 * FileNotFoundException is a subclass of IOException, which of the
 * following method signatures is a valid override by a subclass?
 * protected void dance() throws FileNotFoundException {}
 * A. void dance() throws IOException
 * B. public void dance() throws IOException
 * C. private void dance() throws FileNotFoundException
 * D. public final void dance()
 *
 * 41. D. Options A and C are incorrect because an overridden method
 * cannot reduce the visibility of the inherited method. Option B is
 * incorrect because an overridden method cannot declare a
 * broader checked exception than the inherited method. Finally,
 * Option D is the correct answer. The removal of the checked
 * exception, the application of a broader access modifier, and the
 * addition of the final attribute are allowed for overridden
 * methods.
 */

public class Que41 {
    public static void main(String[] args) {
        
    }
}
