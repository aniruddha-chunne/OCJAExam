package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 134 - MethodAndEncapsulation
 * 567 - Answer
 *
 * 28. What is a possible output of the following application?
 * package wrap;
 * public class Gift {
 *  private final Object contents;
 *  protected Object getContents() {
 *  return contents;
 *  }
 *  protected void setContents(Object contents) {
 *  this.contents = contents;
 *  }
 *  public void showPresent() {
 *  System.out.print("Your gift: "+contents);
 *  }
 *  public static void main(String[] treats) {
 *  Gift gift = new Gift();
 *  gift.setContents(gift);
 *  gift.showPresent();
 *  }
 * }
 * A. Your gift: wrap.Gift@29ca2745
 * B. Your gift: Your gift:
 * C. It does not compile.
 * D. It compiles but throws an exception at runtime.
 *
 * C
 *
 */

public class Que28 {
    public static void main(String[] args) {
        
    }
}
