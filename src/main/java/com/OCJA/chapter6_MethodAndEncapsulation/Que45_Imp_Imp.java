package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 141 - MethodAndEncapsulation
 * 571 - Answer
 *
 * 45. What is the output of the following application?
 * package jungle;
 * public class RainForest extends Forest {
 *  public RainForest(long treeCount) {
 *  this.treeCount = treeCount+1;
 *  }
 *  public static void main(String[] birds) {
 *  System.out.print(new RainForest(5).treeCount);
 *  }
 * }
 * class Forest {
 *  public long treeCount;
 *  public Forest(long treeCount) {
 *  this.treeCount = treeCount+2;
 *  }
 * }
 * A. 5
 * B. 6
 * C. 8
 * D. The code does not compile.
 *
 * D
 *
 * 45. D. Since a constructor call is not the first line of the RainForest()
 * constructor, the compiler inserts the no-argument super() call.
 * Since the parent class, Forest, does not define a no-argument
 * super() constructor, the RainForest() constructor does not
 * compile, and Option D is correct
 */

class Forest {
    public long treeCount;
    public Forest(long treeCount) {
        this.treeCount = treeCount+2;
    }
}

public class Que45_Imp_Imp extends Forest
{

    public Que45_Imp_Imp(long treeCount) {
        super(treeCount);
        this.treeCount = treeCount+1;
    }

    public static void main(String[] args) {

        System.out.println(new Que45_Imp_Imp(5).treeCount);
    }
}
