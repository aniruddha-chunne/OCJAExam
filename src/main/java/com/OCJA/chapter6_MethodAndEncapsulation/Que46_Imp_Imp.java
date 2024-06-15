package com.OCJA.chapter6_MethodAndEncapsulation;

import com.OCJA.chapter9_JavaAPI.Que46_Imp;

/**
 * 141 - MethodAndEncapsulation
 * 571 - Answer
 *
 *
 * 46. What is the output of the following application?
 * public class ChooseWisely {
 *  public ChooseWisely() { super(); }
 *  public int choose(int choice) { return 5; }
 *  public int choose(short choice) { return 2; }
 *  public int choose(long choice) { return 11; }
 *  public static void main(String[] path) {
 *  System.out.print(new
 * ChooseWisely().choose((byte)2+1));
 *  }
 * }
 * A. 5
 * B. 2
 * C. 11
 * D. The code does not compile
 *
 * B
 *
 */

public class Que46_Imp_Imp
{


  public int choose(int choice) { return 5; }
   public int choose(short choice) { return 2; }
   public int choose(long choice) { return 11; }
    public static void main(String[] args) {

        System.out.println(new Que46_Imp_Imp().choose(2));

    }
}
