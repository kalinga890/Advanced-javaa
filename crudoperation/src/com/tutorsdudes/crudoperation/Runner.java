package com.tutorsdudes.crudoperation;

public class Runner {

    static String[] companyname = new String[10];

    public static void main(String[] args) {
        addstring("Tcs");
        addstring("infoys");
        addstring("Techmahendra");
        addstring("Wipro");

        // Print the array to verify the values are added
        for (int i = 0; i < companyname.length; i++) {
            System.out.println(companyname[i]);
        }
    }

    public static void addstring(String value) {
        for (int i = 0; i < companyname.length; i++) {
            if (companyname[i] == null) { // Inside the loop,it checks if the current slot is null (empty).
                companyname[i] = value; // Fix: actually store the name
                return; // it stops after inserting the value once.
            }
        }
        System.out.println("No space to add more students.");
    }
}
