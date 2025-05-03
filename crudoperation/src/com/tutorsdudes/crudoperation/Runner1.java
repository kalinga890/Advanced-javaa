package com.tutorsdudes.crudoperation;

public class Runner1 {

    public static void main(String[] args) {

        FruitStorage fruitStorage = new FruitStorage();
        fruitStorage.addstring("apple");
        fruitStorage.addstring("banana");
        fruitStorage.addstring("papaya");
        fruitStorage.addstring("watermelon");
        fruitStorage.addstring("mango");


        String[] fruit = fruitStorage.readAll();
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);


            boolean value = fruitStorage.update("banana", "kiwi");
            System.out.println(value);

            String[] fruit1 = fruitStorage.readAll();
            for (int k= 0; i < fruit.length; i++) {
                System.out.println(fruit[i]);




                    boolean value1 = fruitStorage.delete("apple");
                    System.out.println(value1);

                    String[] fruit3 = fruitStorage.readAll();
                    for (int l= 0; i < fruit.length; i++) {
                        System.out.println(fruit[i]);

                     boolean ree = fruitStorage.accendingorder();
                        System.out.println(ree);



                    }
                }
            }


        }
    }



