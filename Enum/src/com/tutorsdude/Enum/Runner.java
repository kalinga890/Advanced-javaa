package com.tutorsdude.Enum;

import java.util.concurrent.SubmissionPublisher;

public class Runner {

    public static void main(String[] args) {

        Foodtype veg=  Foodtype.Veg;
        Foodtype nonveg=  Foodtype.nonveg;

        Tabletype bedsidetable = Tabletype.Bedsidetable;
        Tabletype worktable = Tabletype.Worktable;

         Gender male  = Gender.MALE;
         Gender female  = Gender.FEMALE;

        Weeknames friday = Weeknames.friday;
        Weeknames monday  = Weeknames.Monday;

       Shape circle =  Shape.CIRCLE;
        Shape square =  Shape.SQUARE;

       Colour red = Colour.red;
        Colour green =Colour.green;

        Direction up=   Direction.UP;
        Direction left=   Direction.left;
        Direction right=   Direction.right;

       Operation divide = Operation.DIVIDE;
        Operation add = Operation.ADD;
        Operation multiply = Operation.MULTIPLY;


        System.out.println(Tabletype.Bedsidetable);
        System.out.println(Tabletype.Dressingtable);


        System.out.println(Foodtype.nonveg);
        System.out.println(Foodtype.Veg);



        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);
        System.out.println(Gender.CUSTOM);

        System.out.println(Weeknames.Monday);
        System.out.println(Weeknames.Monday);

        System.out.println(Shape.CIRCLE);
        System.out.println(Shape.SQUARE);

        System.out.println(Colour.red);
        System.out.println(Colour.green);

        System.out.println(Direction.right);
        System.out.println(Direction.UP);



    }
}
