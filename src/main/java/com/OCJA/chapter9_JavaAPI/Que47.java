package com.OCJA.chapter9_JavaAPI;

/**
 * 206 - JavaAPI
 * 601 - Answer
 *
 * 47. How many lines does this code output?
 * import java.util.*;
 * import java.util.function.*;
 * public class PrintNegative {
 *  public static void main(String[] args) {
 *  List<String> list = new ArrayList<>();
 *  list.add("-5");
 *  list.add("0");
 *  list.add("5");
 *  print(list, e -> e < 0);
 *  }
 *  public static void print(List<String> list,
 * Predicate<Integer> p) {
 *  for (String num : list)
 *  if (p.test(num))
 *  System.out.println(num);
 *  }
 * }
 * A. One
 * B. Two
 * C. None. The code does not compile.
 * D. None. The code throws an exception at runtime.
 *
 *
 * 47. C. Pay attention to the data types. The print() method is looping
 * through a list of String objects. However, the Predicate expects
 * an Integer. Since these don’t match, the if statement does not
 * compile.
 *
 *
 *
 */

public class Que47 {
    public static void main(String[] args) {
        
    }
}
