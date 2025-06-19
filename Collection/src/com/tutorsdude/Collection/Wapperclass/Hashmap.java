package com.tutorsdude.Collection.Wapperclass;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        hashMap.put(201,"kalinga");
        hashMap.put(202,"manju");
        hashMap.put(203,"siddu");
        hashMap.put(204,"abhi");
        hashMap.put(205,"ad");
        hashMap.put(206,"gopal");
        hashMap.put(207,"karthik");
        hashMap.put(208,"pachhi");
        hashMap.put(209,"soma");
        hashMap.put(210,"sai");
        hashMap.put(211,"vanita");
        hashMap.put(212,"jakiya");
        hashMap.put(213,"anushri");
        hashMap.put(214,"keerthi");
        hashMap.put(215,"bheem");
        hashMap.put(216,"pranathi");
        hashMap.put(217,"priyanka");
        hashMap.put(218,"usha");
        hashMap.put(219,"shivu");
        hashMap.put(220,"naveen");
        hashMap.put(null,null);


        System.out.println(hashMap); // implicit call

        System.out.println(hashMap.get(201));
        System.out.println(hashMap.get(205));
        System.out.println(hashMap.get(208));
        System.out.println(hashMap.get(210));
        System.out.println(hashMap.get(215));

      for(String string : hashMap.values()){
          System.out.println(string);
      }

      for(Integer i : hashMap.keySet()){
          System.out.println(i);
      }

      // New Method

        System.out.println(hashMap.containsKey(101)); // this value dose not contain hashmap set
        System.out.println(hashMap.containsKey(210));

        System.out.println(hashMap.entrySet()); // its shows map set like-- []

        System.out.println(hashMap.toString()); // Explicit call

        System.out.println(hashMap.putIfAbsent(301,"malvika"));




    }
}
