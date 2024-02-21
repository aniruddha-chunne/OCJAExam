package com.OCJA.chapter3_operators;

/*

// 84 - operators
// 545 - Answer

42. What is the output of the following application?
package yoyo;
public class TestGame {
 public String runTest(boolean spinner, boolean roller) {
 if(spinner = roller) return "up";
 else return roller ? "down" : "middle";
 }
 public static final void main(String pieces[]) {
 final TestGame tester = new TestGame();
 System.out.println(tester.runTest(false,true));
 }
}
A. up
B. middle
C. down
D. The code does not compile.



*/

public class Que42_IMP_imp
{

    public String runTest(boolean spinner, boolean roller) {
        if(spinner = roller) {
            return "up";
        }
        else return roller ? "down" : "middle";
    }
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        System.out.println( (boolean) (a=b));
        if(a=b)
        {
            System.out.println("Run the test");
        }
        else
        {
            System.out.println("else part");
        }
        Que42_IMP_imp tester = new Que42_IMP_imp();

        System.out.println(tester.runTest(false,true));
    }
}
