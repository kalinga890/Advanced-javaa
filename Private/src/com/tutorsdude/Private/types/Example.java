package com.tutorsdude.Private.types;

public class Example {

    private int id;
    private String name;
    private int age;
    private float weight;
    private boolean young;

    private static void running(){
        System.out.println("we are running in car");
    }

    private Example(){
        System.out.println("This is a example of constructor");



    }

    private Example(int id, String name, int age, float weight, boolean young){
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.young = young;

    }

    private class greek {

        void display(){
            System.out.println("This is a greek");
        }
    }
     private void display(){

        greek obj = new greek();
        obj.display();

     }








    public static void main(String[] args) {
        Example example = new Example();
        example.age = 24;
        example.weight = 0.5f;
        example.young = true;
        example.name = "John Smith";
        example.id = 5;

        System.out.println(example.id);
        System.out.println(example.name);
        System.out.println(example.age);
        System.out.println(example.weight);
        System.out.println(example.young);


        Example.running();

        Example example2 = new Example();

        example2.name = "John Smith";
        example2.age = 24;
        example2.weight = 0.5f;
        example2.young = true;
        System.out.println(example2.id);
        System.out.println(example2.name);
        System.out.println(example2.age);
        System.out.println(example2.weight);
        System.out.println(example2.young);






    }


}
