package com.OCJA.Practise;

import java.util.function.Predicate;

@FunctionalInterface
interface lambee
{
    public int learn(String a);

}
public class LambdaAndPredicates
{
    public static void main(String[] args)
    {

        Predicate<String> a = e -> e.length()>5;
        Predicate<String> b = (String e) -> {boolean x = e.length()<20;
        return x;};
        System.out.println(a.and(b).test("Aniruddha"));

        lambee s = d -> d.length();

        System.out.println(s.learn("Aniruddha"));

    }

}
