package com.OCJA.chapter5_loopConstruct;

/**
 * - 111 loop_Construct
 * - 557 Answer
 *
 * 23. How many of these statements can be inserted after the println
 * to have the code flow follow the arrow in this diagram?
 * break;
 * break letters;
 * break numbers;
 * A. None
 * B. One
 * C. Two
 * D. Three
 *
 * 23. C. In this figure, we want to end the inner loop and resume
 * execution at the letters label. This means we only want to break
 * out of the inner loop. A break statement does just that. It ends
 * the current loop and resumes execution immediately after the
 * loop, making break; a correct answer. The break numbers;
 * statement explicitly says which loop to end, which does the same
 * thing, making it correct as well. By contrast, break letters;
 * ends the outer loop, causing the code only to run the println()
 * once. Therefore, two statements correctly match the diagram,
 * and Option C is correct.
 */

public class Que23_Imp
{
    public static void main(String[] args)
    {
        
    }
}
