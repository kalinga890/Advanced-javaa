package com.tutorsdude.Collection.Wapperclass;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {

    public static void main(String[] args) {

        HashSet<Character> h1 = new HashSet<>();

        h1.add('A');
        h1.add('p');
        h1.add('b');
        h1.add('1');
        h1.add('2');
        h1.add('c');
        h1.add('m');
        h1.add('v');
        h1.add('3');
        h1.add('l');
        h1.add('h');
        h1.add('x');
        h1.add('s');
        h1.add('o');
        h1.add('t');

        h1.remove('A');
        h1.remove(1);
        h1.remove('l');
        h1.remove('t');
        h1.remove('o');

        ArrayList<Character> arrayList = new ArrayList<>(h1);

        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.get(5));
        System.out.println(arrayList.get(6));


        System.out.println(h1);

        for(Character character : h1) {
            System.out.println(character);
        }

        // New Method


        h1.stream()
                .filter(c -> Character.isLowerCase(c))         // Keep only lowercase characters
                .map(c -> Character.toUpperCase(c))            // Convert each to uppercase
                .forEach(System.out::println);                 // Print each result




    }
}
