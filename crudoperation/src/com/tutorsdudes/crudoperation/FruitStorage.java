package com.tutorsdudes.crudoperation;

public class FruitStorage {

    String[] Fruit = new String[10];


    public void addstring(String name) {
        if (name != null && name.length() > 4) {  // check for the null and check name length

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


    public String[] readAll() {
        return Fruit;
    }

    public boolean find(String name) {
        if (name != null) {
            for (int i = 0; i < Fruit.length; i++) {
                if (name.equals(Fruit[i])) {
                    System.out.println("fruit is found");
                    return true;
                }
            }
            System.out.println("fruit not found");
            return false;
        } else {
            System.out.println("input invalid");
            return false;
        }

    }

    public boolean update(String oldvalue, String newvalue) {
        if (oldvalue != null && newvalue != null) {
            for (int i = 0; i < Fruit.length; i++) {
                if (Fruit[i].equals(oldvalue)) {
                    Fruit[i] = newvalue;
                    System.out.println("value is updated");
                    return true;

                }
            }
            System.out.println("old value is not found");
            return false;
        } else {
            System.out.println("input not invalid");
            return false;
        }
    }

    public boolean delete(String oldvalue) {
        if (oldvalue != null) {
            for (int i = 0; i < Fruit.length; i++) {
                if (Fruit[i].equals(oldvalue)) {
                    Fruit[i] = null;
                    System.out.println("old value is deleted");
                    return false;
                }

            }
            System.out.println("old value is not found");
            return false;

        } else {
            System.out.println("input invalid");
            return false;
        }
    }

    public boolean accendingorder(){
        int count = 0;
        for(int i= 0; i<Fruit.length; i++){
            for (int  j= 1; j < Fruit.length;j ++) {
               if(Fruit[i]!=null){
                   Fruit[i].length();
                   return true;

               }

            }
        }
        return  false;
    }



        }















