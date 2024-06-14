package com.OCJA.Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


 abstract class Animal {}
 interface Hunter {}
 class Cat extends Animal implements Hunter {}
 class Tiger extends Cat {}

public class StringVsStringBuffer
{

    public static void main(String[] args) {

//        List<Animal> an = new ArrayList<>();
//        List<Hunter> hu = new ArrayList<>();
//        List<Tiger> tg = new ArrayList<>();
//
//        an.add(new Cat());
//        an.add(new Tiger());
//
//        String a = "learn";
//        StringBuffer b = new StringBuffer("StringBuffer");
//
////        System.out.println(a.replace("ear", "rae"));
////        System.out.println(b.replace(1,3, "rae"));
//
//        a.length();
//        b.length();
//
////        System.out.println(a.equals("learn"));// match content
////        System.out.println(b.equals("StringBuffer"));// this is equal method of object
//
//        List<Integer> n = new ArrayList<>();
//
//        n.add(1);
//        n.add(2);
//        n.add(null);
//        n.remove(2);
////        System.out.println(n);
//
////        new String (StringBuffer);
//
//        String str=" ";
//        str = str.trim();
//
//        System.out.println(str.length());
//
//        System.out.println(str.equals("")+" "+str.isEmpty());
//
////        System.out.println(c);
//
//        int c = 'a';
//        char v= (char)c;
//        int a1 = v;
//
//        System.out.println(v);
//        System.out.println(a1);

          int n[][] = new int[1][3];
        System.out.println(n.length);

        for(int i =0; i< n.length; i++)
             {
                 System.out.println(n[i].length);
             for (int j=0;j>n[i].length ;j++ )
                 {
                     System.out.println(i +"  " + j);
                 n[i][j]=10;
                }
             }

        System.out.println(n[0][0]);
        System.out.println(n[0][1]);
        System.out.println(n[0][2]);




    }



}