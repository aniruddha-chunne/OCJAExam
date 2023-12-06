package com.OCJA.chapter1;

import java.util.LinkedHashMap;
import java.util.Map;

public class One {


    public static void main(String[] args) {

        String a = "aabbaacccccdeg";

        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();

        int b =0;
        String [] two  = new String[2];

        for(int i=0; i<a.length(); i++)
        {
            if( !lhm.containsKey(a.charAt(i)))
            {
                lhm.put(a.charAt(i), 1);

            }
            else
            {
                int c = lhm.get(a.charAt(i));
                lhm.put(a.charAt(i), c+1);
            }
        }

        for (Map.Entry<Character, Integer> set :
                lhm.entrySet()) {

            if(set.getValue()==1) {
                two[0] = (two[0] == null) ? String.valueOf(set.getKey()) : two[0] + set.getKey();
            }
              else
            {
                two[1] = (two[1] == null)? set.getKey() + ":" +set.getValue() + "," : two[1] + set.getKey() +":"+ set.getValue()+",";
            }

        }

        for(String e : two)
        {
            System.out.println(e);
        }

//        System.out.println(lhm.toString());

    }
}
