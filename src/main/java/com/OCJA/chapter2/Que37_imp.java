package com.OCJA.chapter2;


/*

  // 62 - Java Data Types
 // 534 - Answer


        37. What does the following output?
        1: public class InitOrder { //1
        2: public String first = "instance";
        3: public InitOrder() { //2
        4: first = "constructor";
        5: }//2
        6: { first = "block"; }
        7: public void print() {
        8: System.out.println(first);
        9: }
        10: public static void main(String... args) {
        11: new InitOrder().print();
        12: }
        13: }

        A. block
        B. constructor
        C. instance
        D. The code does not compile.


*/

public class Que37_imp
{
    public String first = "instance";

    public Que37_imp()
    {

     first = "constructor";
    }
    public void print()
    {
     System.out.println(first);
     }

    public static void main(String[] args)
    {
        new Que37_imp().print();
    }
}


/*

  // 62 - Java Data Types
 // 534 - Answer

*/