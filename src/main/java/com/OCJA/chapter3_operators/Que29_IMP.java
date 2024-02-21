package com.OCJA.chapter3_operators;

/*

// 78 - operators
// 542 - Answer

29. Which statement about the logical operators & and && is true?
A. The & and && operators are interchangeable, always
producing the same results at runtime.
B. The & operator always evaluates both operands, while the &&
operator may only evaluate the left operand.
C. Both expressions evaluate to true if either operand is true.
D. The & operator always evaluates both operands, while the &&
operator may only evaluate the right operand.


-IMP 0
The & operator evaluates both operands, regardless of their value.
It then performs a bitwise AND operation on the operands and returns the result.
The && operator, on the other hand, evaluates its operands only if necessary.
If the first operand is false , it returns false without evaluating the second operand.


*/

public class Que29_IMP
{

    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(false && true);

    }

}
