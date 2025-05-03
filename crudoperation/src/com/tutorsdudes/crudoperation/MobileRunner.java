package com.tutorsdudes.crudoperation;

import com.tutorsdudes.crudoperation.DTO.MobileDto;
import com.tutorsdudes.crudoperation.DTO.MobileStorage;

import java.io.PrintStream;

public class MobileRunner {
    public static void main(String[] args) {


        MobileDto mobileDto = new MobileDto("Redmi", 20000, "red", "snapgrgon", 2.5f);
        System.out.println(mobileDto.getBrandName());

       MobileDto m1 = new MobileDto();
       m1.setBrandName("moto");
       m1.setProcessor("Qualcomm");
       m1.setProcessor("snap");

       MobileStorage mobileStorage = new MobileStorage();
       boolean result = mobileStorage.saveValue(m1);
       System.out.println(result);








    }


}

