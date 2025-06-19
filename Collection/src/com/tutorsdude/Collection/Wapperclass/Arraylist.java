package com.tutorsdude.Collection.Wapperclass;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("kalinga");
        arrayList.add("manju");
        arrayList.add("abhi");
        arrayList.add("shivu");
        arrayList.add("siddu");
        arrayList.add("datta");
        arrayList.add("ad");
        arrayList.add("gopal");
        arrayList.add("karthik");
        arrayList.add("manoj");
        arrayList.add("indresh");
        arrayList.add("praveen");
        arrayList.add("naveen");
        arrayList.add("gavi");
        arrayList.add("venky");
        arrayList.add("ambresh");
        arrayList.add("ganesh");
        arrayList.add("muttu");

        arrayList.remove("venky");
        arrayList.remove("muttu");
        arrayList.remove("gavi");
        arrayList.remove("naveen");
        arrayList.remove("praveen");
        arrayList.remove("kalinga");

        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(6));

        System.out.println(arrayList);

        System.out.println(arrayList.contains("siddu"));
        System.out.println(arrayList.contains("manoj"));
        System.out.println(arrayList.contains("praveen"));

        // New method

        System.out.println(arrayList.stream().findAny());
        System.out.println(arrayList.stream().findAny());
    }
}
