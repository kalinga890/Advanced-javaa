package com.tutorsdude.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

    public static void main(String[] args) {

     ArrayList collection = new ArrayList();

     collection.add("kalinga");
     collection.add("abhi");
     collection.add(10);
     collection.add(2.5f);
     collection.add(4.5d);
     collection.add('a');
     collection.add(200);
     collection.add("happay");
     collection.add(true);
     collection.add(false);
     collection.add("apple");

     collection.remove(3);
     collection.remove(0); // remove method
     collection.remove(4);



        System.out.println(collection);

        boolean result = collection.contains(5);
        boolean result1 = collection.contains(3);

        System.out.println(result);
        System.out.println(result1);

        collection.removeFirst();
        System.out.println(collection); // new method

        collection.addLast(200);  // new method
        System.out.println(collection);

       collection.removeLast();
        System.out.println(collection);

        collection.set(4,"happay");
        System.out.println(collection);



        System.out.println(collection.get(1));  // specific index access
        System.out.println(collection.get(3));
        System.out.println(collection.get(6));
        

    }


}
