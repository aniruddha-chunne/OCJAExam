package com.OCJA.chapter3_operators;

/*

// 79 - operators
// 542 - Answer

31. What is the output of the following application?
package bob;
public class AreYouBob {
 public static void main(String[] unused) {
 String bob = new String("bob");
 String notBob = bob;
 System.out.print((bob==notBob)+" "+
(bob.equals(notBob)));
 }
}
A. true true
B. true false
C. false true
D. false false

31. A. The first assignment actually uses two String objects, the
literal "bob" and the String created with the new keyword.
Regardless, only the second object is assigned to the variable
bob. The second variable, notBob, is assigned a reference to the
value of the bob variable. This means that not only does the
equals() test pass, but they are actually the same object, so the
== test is true as well. Therefore, the correct answer is Option A.

*/

public class Que31
{

}
