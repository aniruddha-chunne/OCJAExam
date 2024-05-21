package com.OCJA.Practise.pack2;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Two
{

    public static void main(String[] args)
    {
        System.out.println("we are ok");

        int [] a = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;

        System.out.println(Arrays.toString(a));

        ArrayList b = new ArrayList();

        b.add("one");
        b.add(2);

//        b.remove(1);

        System.out.println(b);


        ArrayList c = new ArrayList();

        c.add("first");
        c.add("second");
        c.add(b);

        System.out.println(c + "--");

        System.out.println(c.contains("first"));

        System.out.println(c);

            Iterator e =  c.iterator();

            while (e.hasNext())
            {
                System.out.println(e.next());

            }

            c.remove(2);


    }

}


