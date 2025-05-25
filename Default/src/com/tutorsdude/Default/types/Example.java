package com.tutorsdude.Default.types;

 class Example {

    String name;
    int age;
    float weight;
    double height;
    boolean happy;

    public static void Moving()
    {
        System.out.println("The object is moving around the earth");
    }

    public Example(){
        System.out.println("The constructor is a default constructor");
    }

    Example(String name, int age, float weight, double height, boolean happy){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.happy = happy;

    }

      class greek {

         void display(){
             System.out.println("This is a greek");
         }
     }


    public static void main(String[] args) {

        Example example = new Example();
        example.age = 30;
        example.happy = true;
        example.height = 2.5;
        example.weight = 50;
        example.name = "shiva reddy";

        System.out.println(example.name);
        System.out.println(example.age);
        System.out.println(example.happy);
        System.out.println(example.height);
        System.out.println(example.weight);

        Example.Moving();


        Example example2 = new Example();
        example2.name = "James";
        example2.age = 30;
        example2.happy = true;
        example2.height = 2.5;
        example2.weight = 50;

        System.out.println(example2.name);
        System.out.println(example2.age);
        System.out.println(example2.happy);
        System.out.println(example2.height);
        System.out.println(example2.weight);



    }
}
