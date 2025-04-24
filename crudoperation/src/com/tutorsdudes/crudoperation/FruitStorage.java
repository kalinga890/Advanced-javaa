package com.tutorsdudes.crudoperation;

public class FruitStorage {

    String[] Fruit = new String[10];


    public void addstring(String name) {
        if (name != null && name.length() >4) {  // check for the null and check name length

            for (int i = 0; i < Fruit.length; i++) {
                if (Fruit[i] == null) {
                    Fruit[i] = name;
                    System.out.println("saved fruit" + name);
                    return;
                } else {
                    System.out.println("index occupied so going to next index");
                }

            }
            System.out.println("so space is over");

        }

    }


        public String[] readAll () {
            return Fruit;
        }
    }

