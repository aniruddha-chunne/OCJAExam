package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 134 - MethodAndEncapsulation
 * 567 - Answer
 *
 * 27. Which of the following is a true statement about passing data to
 * a method?
 * A. A change made to a primitive value passed to a method is
 * reflected in the calling method.
 * B. A change made to the data within an object passed to a
 * method is reflected in the calling method.
 * C. Reassigning an object reference passed to a method is
 * reflected in the calling method.
 * D. A change made to a boolean value passed to a method is
 * reflected in the calling method.
 *
 *
 * B
 *
 */

public class Que27_Imp$Imp {
    public static void main(String[] args) {
        
    }
}

/*

A. A change made to a primitive value passed to a method is reflected in the calling method.
False: Primitive types (int, char, float, etc.) are passed by value in Java.
This means a copy of the value is passed to the method, and changes to the parameter do not affect
the original variable.


public class Main {
    public static void main(String[] args) {
        int number = 5;
        modifyPrimitive(number);
        System.out.println("After method call: " + number); // Outputs 5
    }

    public static void modifyPrimitive(int num) {
        num = 10; // Changes only the local copy
    }
}


B. A change made to the data within an object passed to a method is reflected in the calling method.
True: Objects are passed by reference, meaning the method operates on the original object.
Changes to the object's data are reflected outside the method.

public class Main {
    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.value = 5;
        modifyObject(obj);
        System.out.println("After method call: " + obj.value); // Outputs 10
    }

    public static void modifyObject(MyObject obj) {
        obj.value = 10; // Changes the original object
    }
}

class MyObject {
    int value;
}


C. Reassigning an object reference passed to a method is reflected in the calling method.
False: Reassigning the object reference inside the method does not change the reference outside the method.
The reference itself is passed by value, so the original reference remains unchanged.

public class Main {
    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.value = 5;
        reassignObject(obj);
        System.out.println("After method call: " + obj.value); // Outputs 5
    }

    public static void reassignObject(MyObject obj) {
        obj = new MyObject(); // Reassigns only the local reference
        obj.value = 10;
    }
}

class MyObject {
    int value;
}


D. A change made to a boolean value passed to a method is reflected in the calling method.
False: Boolean values, like other primitive types, are passed by value.
Changes to the boolean parameter do not affect the original variable.

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        modifyBoolean(flag);
        System.out.println("After method call: " + flag); // Outputs true
    }

    public static void modifyBoolean(boolean bool) {
        bool = false; // Changes only the local copy
    }
}


*/