package com.tutorsdude.Collection.Wapperclass;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {


        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        linkedList.add(80);
        linkedList.add(90);
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(700);
        linkedList.add(800);
        linkedList.add(900);
        linkedList.add(1000);

        linkedList.remove(3);
        linkedList.remove(4);
        linkedList.remove(6);
        linkedList.remove(5);

        System.out.println(linkedList.get(4));
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.get(6));

        System.out.println(linkedList);

      for(Integer integer : linkedList)
        System.out.println(integer);

               // New Method

        System.out.println(linkedList.element());

    }
}
