package com.OCJA.chapter1;

/*


//48 - Java Basics
//528 - Answer


            46. What is the result of compiling and executing the following
            class?
            package sports;
            public class Bicycle
            {
                     String color = "red";
                     private void printColor(String color)
                     {

                     color = "purple";
                     System.out.print(color);

                      }

                     public static void main(String[] rider)
                     {

                     new Bicycle().printColor("blue");

                     }
            }
            A. red
            B. purple
            C. blue
            D. It does not compile.

            46. B. First off, the color variable defined in the instance and set to
            red is ignored in the method printColor() as local scope
            overrides instance scope, so Option A is incorrect. The value of
            color passed to the printColor() method is blue, but that is lost
            by the assignment to purple, making Option B the correct
            answer and Option C incorrect. Option D is incorrect as the code
            compiles and runs without issue.


*/

public class Que46 {
    String color = "red";
    private void printColor(String color)
    {

        this.color = "purple";
        System.out.print(color);

    }

    public static void main(String[] rider)
    {

         new Que46().printColor("blue");

    }
}
