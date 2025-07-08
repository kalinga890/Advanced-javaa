package com.tutorsdude.Basicprogram;

public class AramStrongNumber {

    public static void main(String[] args) {

        int num = 153, temp = num, result = 0;

        while (temp != 0){

            int digit = temp % 10;

            result+= digit*digit*digit;

            temp/= 10;
        }

      if (result==num)
          System.out.println(num + " is an armstrong number");
      else
          System.out.println(num + " is not an armstrong  number");
    }

}
