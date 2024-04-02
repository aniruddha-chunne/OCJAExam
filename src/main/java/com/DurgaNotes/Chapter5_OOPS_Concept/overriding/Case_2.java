package com.DurgaNotes.Chapter5_OOPS_Concept.overriding;

//Rules for Method Overriding:

//         In Overriding, Method Names and Argument Types Must be Same. i.e Method
//Signatures Must be Same.

//         In Overriding the Return Types Must be Matched. But this Rule is Applicable Only
//until 1.4 Version. From 1.5 Version onwards Co- Variant Return Types are allowed.

//Note: Co-Varient Return Type Concept Applicable Only for Object Types but Not for
//Primitives.

class P2
{
    public Number m1()
    {
        return null;
    }
}
public class Case_2 extends P2
{

//     not relevant as return type is not child or same
//    @Override
//    public Object m1() {
//        return null;
//    }


        @Override
    public Integer m1() {
        return null;
    }

}
