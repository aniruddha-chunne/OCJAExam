package com.OCJA.chapter5_loopConstruct;

/**
 * - 114 loop_Construct
 * - 558 Answer
 *
 * 30. What is the result of the following?
 * int count = 10; //4
 * List<Character> chars = new ArrayList<>();
 * do {
 *  chars.add('a');   char  = "3a",
 *  for (Character x : chars) count -=1;
 * } while (count > 0);
 * System.out.println(chars.size());
 * A. 3
 * B. 4
 * C. The code does not compile.
 * D. None of the above
 *
 * 30. B. On the first iteration through the outer loop, chars becomes 1
 * element. The inner loop is run once and count becomes 9. On
 * the second iteration through the outer loop, chars becomes 2
 * elements. The inner loop runs twice so count becomes 7. On the
 * third iteration through the outer loop, chars becomes 3
 * elements. The inner loop runs three times so count becomes 4.
 * On the fourth iteration through the outer loop, chars becomes 4
 * elements. The inner loop runs four times so count becomes 0.
 * Then both loops end. Therefore, Option B is correct.
 */

public class Que30_Imp
{
    public static void main(String[] args) {
        
    }
}
