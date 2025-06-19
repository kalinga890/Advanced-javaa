package com.tutorsdude.Collection;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Example {

    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();

        linkedList.add(null);
        linkedList.add("banana");
        linkedList.add(5.5f);
        linkedList.add('A');
        linkedList.add("Mango");
        linkedList.add(200);
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add(300);
        linkedList.add(500);
        linkedList.add("cherry");
        linkedList.add("Lemon");
        linkedList.add("papaya");
        linkedList.add(2,"coconut");
        linkedList.add("guava");
        linkedList.add("watermelon");
        linkedList.add("pineapple");
        linkedList.add("kiwi");
        linkedList.add("plum");
        linkedList.add("grapefruite");
        linkedList.add("salak");

        linkedList.remove(0);
        linkedList.remove(1);
        linkedList.remove(3);
        linkedList.remove(5);
        linkedList.remove(1);

      Object r1 = linkedList.get(3);
        System.out.println(r1);

        System.out.println(linkedList.get(4));

        System.out.println(linkedList);
        
        for(Object obj : linkedList)
            System.out.println(obj);

       //  New method
     Object r2 = linkedList.reversed();
        System.out.println(r2);

     Object r3 = linkedList.peekLast();
        System.out.println(r3);

        System.out.println(linkedList.size());

        System.out.println(linkedList.peek());








    }

}
