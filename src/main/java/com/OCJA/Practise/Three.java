package com.OCJA.Practise;



class Three extends RuntimeException
{

    int a;
    int b;

    Three(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public boolean equals(Object obj)
    {


        try
        {
            Three x = (Three) obj;
            if((this.a==x.a) && (this.b==x.b))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (NullPointerException e)
        {
            return false;
        }
        catch (ClassCastException e)
        {
            return false;
        }


    }

    @Override
    public String toString() {
        return ( hashCode() + "" );
    }

    public static void main(String[] moat)
    {
<<<<<<< Updated upstream
<<<<<<< Updated upstream

=======
    
>>>>>>> Stashed changes
=======
    
>>>>>>> Stashed changes
//            Three a = new Three(3);
//        System.out.println(a.toString());

        String c = "Aniruddha";
        String d = "Aniruddha";
        String e = new String("Aniruddha");

//        System.out.println(c==d);
//        System.out.println(e==c);
//        System.out.println(e.equals(c));

//        Three q = new Three(1,2);
//        Three w = new Three(1,2);
//
////        System.out.println(q==w);
////        System.out.println(q.equals(w));
//
//        String s = new String("Durga");
//        s.concat("Software");
//
//        StringBuffer b = new StringBuffer("Durga");
//        b.append("software");
//
//        System.out.println(b);
//
//        StringBuffer one = new StringBuffer("Durga");
//        StringBuffer two = new StringBuffer("Durga");
//
//        System.out.println(one==two); // false
//        System.out.println(one.equals(two)); // false String buffer didn't override equals method of object
////        and object equal's method is not meant for content comparison'
//
////        System.out.println(s);]
//

        String one = new String("Durga");
        String two = new String("Durga");

        System.out.println(one==two); // false
        System.out.println(one.equals(two)); // true



        String s = new String("Durga");
        String s1 = s.concat("software");
        String s2 = s.concat("Software");
        String s3 = s.toLowerCase();
        String s4 = s.toUpperCase();

//        System.out.println(s1==s2);
//        System.out.println(s3==s4);

//        for all new object will be created in the heap area



    }
}



