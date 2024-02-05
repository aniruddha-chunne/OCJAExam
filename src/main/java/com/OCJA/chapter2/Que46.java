package com.OCJA.chapter2;


/*

  // 65 - Java Data Types
 // 535 - Answer

// Have issue with the answer

        46. How many objects are eligible for garbage collection right before
        the end of the main method?
        1: public class Person {
        2: public Person youngestChild;
        3:
        4: public static void main(String... args) {
        5: Person elena = new Person();
        6: Person diana = new Person();
        7: elena.youngestChild = diana;
        8: diana = null;
        9: Person zoe = new Person();
        10: elena.youngestChild = zoe;
        11: zoe = null;
        12: }
        13: }

        A. None
        B. One
        C. Two
        D. Three

        46. B. On line 9, all three objects have references. The elena and zoe
        objects have a direct reference. The diana object is referenced
        through the elena object. On line 10, the reference to the diana
        object is replaced by a reference to the zoe object. Therefore, the
        diana object is eligible to be garbage collected, and Option B is
        correct.

*/

public class Que46
{

}

/*

  // 66 - Java Data Types
 // 535 - Answer

*/