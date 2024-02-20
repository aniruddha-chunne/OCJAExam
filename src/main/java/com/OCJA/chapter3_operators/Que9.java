package com.OCJA.chapter3_operators;

/*

// 71 - operators
// 538 - Answer

9. What is the output of the following application?
package voting;
1: public class Election {
2: public void calculateResult(Integer candidateA,
Integer candidateB) {
3: boolean process = candidateA == null ||
candidateA.intValue() < 10;
4: boolean value = candidateA && candidateB;
5: System.out.print(process || value);
6: }
7: public static void main(String[] unused) {
8: new Election().calculateResult(null,203);
9: }
10: }
A. true
B. false
C. The code does not compile.
D. The code compiles but throws a NullPointerException on
line 3 at runtime.

9. C. On line 4, candidateA and candidateB are numbers, but the &&
operation can only be applied to boolean expressions. Therefore,
the code does not compile because of line 4, making C the
correct answer. All of the other lines are correct. Note that if line
4 is fixed, line 3 does not produce a NullPointerException at
runtime. The conditional || and the preceding null check allows
the code to only call intValue() if candidateA is not null.

*/
public class Que9
{
    public static void main(String[] args) {
        Integer a = new Integer(30);
        int b = a.intValue();
        System.out.println(b);

        boolean process = a == null ||
                a.intValue() < 10;

        System.out.println(process);
    }
}
