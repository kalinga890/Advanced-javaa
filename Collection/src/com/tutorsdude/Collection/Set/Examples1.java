package com.tutorsdude.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Examples1 {

    public static void main(String[] args) {

        HashSet h1 = new HashSet();

        h1.add("Ballary");
        h1.add("gadag");
        h1.add("koppal");
        h1.add("haveri");
        h1.add("belagavi");
        h1.add("ramnagar");
        h1.add("raichur");
        h1.add("yadgir");
        h1.add("vijayanagar");
        h1.add("hassan");
        h1.add("tumakuru");
        h1.add("shivamogga");
        h1.add("mandya");
        h1.add("vijapura");
        h1.add("dharwad");
        h1.add("kalaburagi");
        h1.add("mysuru");
        h1.add(null);
        h1.add(null);
        h1.add("kolar");
        h1.add("bidar");

        h1.remove("mysuru");
        h1.remove("bidar");
        h1.remove("kolar");
        h1.remove("mandya");
        h1.remove("gadag");

        System.out.println(h1);
        System.out.println(h1.size());


        for(Object obj : h1)
            System.out.println(obj);

        // New Method

        System.out.println(h1.hashCode());
        System.out.println("HashCode of 'bidar': " + "bidar".hashCode());

        System.out.println(h1.clone());


        System.out.println("-------End hashset method------");




        LinkedHashSet h2 = new LinkedHashSet();

        h2.add("Ballary");
        h2.add("gadag");
        h2.add("koppal");
        h2.add("haveri");
        h2.add("belagavi");
        h2.add("ramnagar");
        h2.add("raichur");
        h2.add("yadgir");
        h2.add("vijayanagar");
        h2.add("hassan");
        h2.add("tumakuru");
        h2.add("shivamogga");
        h2.add("mandya");
        h2.add("vijapura");
        h2.add("dharwad");
        h2.add("kalaburagi");
        h2.add("mysuru");
        h2.add(null);
        h2.add(null);
        h2.add("kolar");
        h2.add("bidar");

        h2.remove("haveri");
        h2.remove("koppal");
        h2.remove("mandya");
        h2.remove("hassan");
        h2.remove("yadgir");

        System.out.println(h2);

        for(Object obj1 :h2)
            System.out.println(obj1);

        // New Method

        System.out.println(h2.stream().toList());

        System.out.println(h2.stream().count());

        System.out.println("-----------End LinkedHashset Method----------------");


        TreeSet t2 = new TreeSet();

        t2.add("Ballary");
        t2.add("gadag");
        t2.add("koppal");
        t2.add("haveri");
        t2.add("belagavi");
        t2.add("ramnagar");
        t2.add("raichur");
        t2.add("yadgir");
        t2.add("vijayanagar");
        t2.add("hassan");
        t2.add("tumakuru");
        t2.add("shivamogga");
        t2.add("mandya");
        t2.add("vijapura");
        t2.add("dharwad");
        t2.add("kalaburagi");
        t2.add("mysuru");
        t2.add("kolar");
        t2.add("bidar");

        t2.remove("haveri");
        t2.remove("koppal");
        t2.remove("mandya");
        t2.remove("hassan");
        t2.remove("yadgir");

        System.out.println(t2);

        for(Object obj1 :t2)
            System.out.println(obj1);

        // New Method

        System.out.println(t2.pollFirst()); // Removed
        System.out.println(t2.pollLast()); // Removed

        System.out.println(t2.comparator());







    }
}
