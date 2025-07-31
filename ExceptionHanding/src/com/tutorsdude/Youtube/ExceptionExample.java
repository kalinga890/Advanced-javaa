package com.tutorsdude.ExceptionHanding;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

    public static void main(String[] args) {


       try {

           FileReader reader = new FileReader("ExceptionHanding.iml");
           System.out.println("File is available");
       } catch (FileNotFoundException e){
           System.out.println("File not found");
       }

       try {
           Class.forName("com.tutorsdude.ExceptionHanding.SleepExamplee");
           System.out.println("in our system file is available");
       } catch (ClassNotFoundException e){
           System.out.println("file not available");
       }





       }


    }

