package com.OCJA.chapter7_Inheritance;

/**
 * 147 - Inheritance
 * 574 - Answer
 *
 * 7. What is the output of the following application?
 * package vehicles;
 * class Automobile {
 *  private final String drive() { return "Driving vehicle";
 * }
 * }
 * class Car extends Automobile {
 *  protected String drive() { return "Driving car"; }
 * }
 * public class ElectricCar extends Car {
 *  public final String drive() { return "Driving electric
 * car"; }
 *  public static void main(String[] wheels) {
 *  final Car car = new ElectricCar();
 *  System.out.print(car.drive());
 *  }
 * }
 * A. Driving vehicle
 * B. Driving electric car
 * C. Driving car
 * D. The code does not compile.
 *
 * B
 *
 * 7. B. The drive() method in the Car class does not override the
 * version in the Automobile class since the method is not visible to
 * the Car class. Therefore, the final attribute in the Automobile
 * class does not prevent the Car class from implementing a
 * method with the same signature. The drive() method in the
 * ElectricCar class is a valid override of the method in the Car
 * class, with the access modifier expanding in the subclass. For
 * these reasons, the code compiles, and Option D is incorrect. In
 * the main() method, the object created is an ElectricCar, even if
 * it is assigned to a Car reference. Due to polymorphism, the
 * method from the ElectricCar will be invoked, making Option B
 * the correct answer.
 */

public class Que7 {
    public static void main(String[] args) {
        
    }
}
