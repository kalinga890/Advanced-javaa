package com.tutorsdude.Collection.Wapperclass;

import java.util.ArrayList;
import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {

        TreeSet<Float> treeSet = new TreeSet<>();

        treeSet.add(1.1f);
        treeSet.add(3.2f);
        treeSet.add(4.2f);
        treeSet.add(9.2f);
        treeSet.add(5.2f);
        treeSet.add(6.22f);
        treeSet.add(1.7f);
        treeSet.add(5.3f);
        treeSet.add(6.2f);
        treeSet.add(7.2f);
        treeSet.add(3.3f);
        treeSet.add(1.2f);
        treeSet.add(4.5f);
        treeSet.add(5.5f);
        treeSet.add(1.4f);
        treeSet.add(1.8f);
        treeSet.add(1.3f);

        treeSet.remove(1.2f);
        treeSet.remove(1.4f);  // remove method
        treeSet.remove(5.2f);
        treeSet.remove(4.5f);
        treeSet.remove(1.7f);


        System.out.println(treeSet);

        // convert treeSet to arraylist

        ArrayList<Float> arrayList = new ArrayList<>(treeSet);

        System.out.println(arrayList.get(4));
        System.out.println(arrayList.get(3));  // get method
        System.out.println(arrayList.get(5));
        System.out.println(arrayList.get(6));

        System.out.println(treeSet.contains(1.1f));
        System.out.println(treeSet.contains(4.2f));  // contains method
        System.out.println(treeSet.contains(9.2f));


        // New method

        System.out.println(treeSet.ceiling(1.1f));

    }


}
