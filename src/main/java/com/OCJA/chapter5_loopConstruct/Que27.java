package com.OCJA.chapter5_loopConstruct;

/**
 * - 114 loop_Construct
 * - Answer
 *
 * 27. What is the output of the following?
 * boolean balloonInflated = false;
 * do {
 *  if (!balloonInflated) {
 *  balloonInflated = true;
 *  System.out.print("inflate-");
 *  }
 * } while (! balloonInflated);
 * System.out.println("done");
 * A. done
 * B. inflate-done
 * C. The code does not compile.
 * D. This is an infinite loop.
 *
 *
 * 27. B. This is a correct do-while loop. On the first iteration of the
 * loop, the if statement executes and prints inflate-. Then the
 * loop condition is checked. The variable balloonInflated is true,
 * so the loop condition is false and the loop completes
 */

public class Que27
{

    public static void main(String[] args)
    {

    }
}
