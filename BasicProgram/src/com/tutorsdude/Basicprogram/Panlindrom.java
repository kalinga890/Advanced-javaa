package com.tutorsdude.Basicprogram;

public class Panlindrom {
    public static void main(String[] args) {

        String str = "gadag";

        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed+= str.charAt(i);

        }
        if (str.equals(reversed))
            System.out.println("it is palindrom");
        else
            System.out.println("it is not palindrom");

    }


}
