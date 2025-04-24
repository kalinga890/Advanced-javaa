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


        }
    }
}
