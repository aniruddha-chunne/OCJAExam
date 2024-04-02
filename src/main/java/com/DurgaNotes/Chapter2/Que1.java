package com.DurgaNotes.Chapter2;

public class Que1 {

    public static void main(String[] args)
    {

//        re-examin

//        double d=0123.456;
//        double d=0xFace;
//        double d=0xBeef;


//        char ch='\ubeef';  - valid
//        char ch1='\u0061'; - valid
//        System.out.println(ch1);
//        char ch2=\u0062; - valid
//        char ch3='\iface'; - invalid

//	  char ch=\uface;
//--------------------------------------------------------------------------------------------------------------------



//        which of the following is valid declaration ?


//1.
//        int x=0777;
//        int x=0786;
//        int x=0xFACE;
//        int x=0xbeef;
//        int x=0xBeer;
//        int x=0xabb2cd;


//2.
//        int x=10;
//        long l=10L;
//        long l=10;
//        int x=10l;


//3.

//        byte b=127;
//        byte b=130;
//        short s=32767;
//        short s=32768;



//4.
//        float f=123.456;
//        float f=123.456f;
//        double d=123.456;


//5.
//        double d=123.456;
//        double d=0123.456;
//        double d=0x123.456;
//        float f=123.456;
//        float f=123.456D;
//        double d=0x123.456;
//        double d=0xFace;
//        double d=0xBeef;


//6.
//        double d=0xBeef;
//        float f = 100f:



//7.
//        Example:
//        int x=10.0;


//8.
//        double d=10e2;
//        float f=10e2;
//        float f=10e2F;

//9.
//        boolean b=true;
//        boolean b=0;
//        boolean b=True;
//        boolean b="true";

//10.
//        char ch='a';
//        char ch=a;
//        char ch="a";
//        char ch='ab';

//11.
//        char ch=97;
//        char ch=0xFace;
//        System.out.println(ch);
//        char ch=65536;

//12.
//        char ch='\ubeef';
//        char ch1='\u0061';
//        System.out.println(ch1);
//        char ch2=\u0062;
//        char ch3='\iface';

//13.
//        1) char ch='\n'; //(valid)
//        2) char ch='\l'; //C.E:illegal escape character(invalid)


//14.
//        Which of the following char declarations are valid?
//        char ch=a;
//        char ch='ab';
//        char ch=65536;
//        char ch=\uface;
//        char ch='/n';
//        none of the above.

//15.
//        double d = 123456.789;
//        double d = 1_23_456.7_8_9;
//        double d = 123_456.7_8_9;


//16.
//        double d = 1_23_ _456.789;
//        double d=_1_23_456.7_8_9;
//        double d=1_23_456.7_8_9_;
//        double d=1_23_456_.7_8_9;

    }
}












//1.
//int x=0777; //(valid)
//int x=0786; //C.E:integer number too large: 0786(invalid)
//int x=0xFACE; (valid)
//int x=0xbeef; (valid)
//int x=0xBeer; //C.E:';' expected(invalid) //:int x=0xBeer; ^// ^
//int x=0xabb2cd;(valid)



//2.
//int x=10;(valid)
//long l=10L;(valid)
//long l=10;(valid)
//int x=10l;//C.E:possible loss of precision(invalid)
//found : long
//required : int


//3.
//byte b=127;(valid)
//byte b=130;//C.E:possible loss of precision(invalid)
//short s=32767;(valid)
//short s=32768;//C.E:possible loss of precision(invalid)


//4.
//
//float f=123.456;//C.E:possible loss of precision(invalid)
//float f=123.456f;(valid)
//double d=123.456;(valid)
//We can specify explicitly floating point literal as double type by suffixing with d or D.


//5.
//double d=123.456;(valid)
//double d=0123.456;(valid) //it is treated as decimal value but not octal
//double d=0x123.456;//C.E:malformed floating point literal(invalid)
//Which of the following floating point declarations are valid?
//float f=123.456; //C.E:possible loss of precision(invalid)
//float f=123.456D; //C.E:possible loss of precision(invalid)
//double d=0x123.456; //C.E:malformed floating point literal(invalid)
//double d=0xFace; (valid)
//double d=0xBeef; (valid)
//We can assign integral literal directly to the floating point data types and that integral literal can
//be specified in decimal , octal and Hexa decimal form also.

//6.
//        double d=0xBeef;
//        System.out.println(d);//48879.0
//
//        float f = 100f:
//        System.out.println(f); //100.0


//7.
//        Example:
//        int x=10.0;//C.E:possible loss of precision
//        We can specify floating point literal even in exponential form also (significant notation).



//8.
//double d=10e2;//==>10*102
// (valid)
//System.out.println(d);//1000.0
//float f=10e2;//C.E:possible loss of precision(invalid)
//float f=10e2F;(valid)

//9.
//        boolean b=true;(valid)
//        boolean b=0;//C.E:incompatible types(invalid)
//        boolean b=True;//C.E:cannot find symbol(invalid)
//        boolean b="true";//C.E:incompatible types(invalid)


//10.
//
//char ch='a';(valid)
//char ch=a;//C.E:cannot find symbol(invalid)
//char ch="a";//C.E:incompatible types(invalid)
//char ch='ab';//C.E:unclosed character literal(invalid)


//11.
//char ch=97; (valid)
//char ch=0xFace; (valid)
//        System.out.println(ch); //?
//char ch=65536; //C.E: possible loss of precision(invalid)
//3) We can represent a char literal by Unicode representation which is nothing but ‘xxxx' (4 digit
//hexa-decimal number) .


//12.
//char ch='\ubeef';
//char ch1='\u0061';
//System.out.println(ch1); //a
//char ch2=\u0062; //C.E:cannot find symbol
//char ch3='\iface'; //C.E:illegal escape character
//Every escape character in java acts as a char literal.


//13.
//        1) char ch='\n'; //(valid)
//        2) char ch='\l'; //C.E:illegal escape character(invalid)

//Escape Character Description
//\n New line
//\t Horizontal tab
//\r Carriage return
//        \f Form feed
//\b Back space character
//\' Single quote
//        \" Double quote
//        \\ Back slash


//14.
//Which of the following char declarations are valid?
//char ch=a; //C.E:cannot find symbol(invalid)
//char ch='ab'; //C.E:unclosed character literal(invalid)
//char ch=65536; //C.E:possible loss of precision(invalid)
//char ch=\uface; //C.E:illegal character: \64206(invalid) //'' single inverted ' is not there
//char ch='/n'; //C.E:unclosed character literal(invalid)
//none of the above. (valid)

//15.
//        double d = 123456.789; //valid
//        double d = 1_23_456.7_8_9; //valid
//        double d = 123_456.7_8_9; //valid


//16.
//        double d = 1_23_ _456.789;
//        We should use underscore symbol only between the digits
//        double d=_1_23_456.7_8_9; //invalid
//        double d=1_23_456.7_8_9_; //invalid
//        double d=1_23_456_.7_8_9; //invalid



