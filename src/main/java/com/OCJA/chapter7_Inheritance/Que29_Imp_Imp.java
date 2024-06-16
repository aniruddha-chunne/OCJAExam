package com.OCJA.chapter7_Inheritance;

/**
 * 155 - Inheritance
 * 578 - Answer
 *
 *29. What is the output of the following application?
 * package sports;
 * abstract class Ball {
 *  protected final int size;
 *  public Ball(int size) {
 *  this.size = size;
 *  }
 * }
 * interface Equipment {}
 * public class SoccerBall extends Ball implements Equipment {
 *  public SoccerBall() {
 *  super(5);
 *  }
 *  public Ball get() { return this; }
 *  public static void main(String[] passes) {
 *  Equipment equipment = (Equipment)(Ball)new
 * SoccerBall().get();
 *  System.out.print(((SoccerBall)equipment).size);
 *  }
 * }
 * A. 5
 * B. The code does not compile due an invalid cast.
 * C. The code does not compile for a different reason.
 * D. The code compiles but throws a ClassCastException at
 * runtime.
 *
 */

interface equipments{}
class Ball{}
class Soccer extends Ball implements equipments
{

}
public class Que29_Imp_Imp {


    public static void main(String[] args) {

//       Ball e = (equipments)(Ball)new Soccer();

    }
}
