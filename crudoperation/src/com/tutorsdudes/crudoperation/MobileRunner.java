package com.tutorsdudes.crudoperation;

import com.tutorsdudes.crudoperation.DTO.MobileDto;
import com.tutorsdudes.crudoperation.DTO.MobileStorage;



public class MobileRunner {
    public static void main(String[] args) {


        MobileDto mobileDto = new MobileDto("Redmi", 20000, "red", "snapdragon", 2.5f);
        MobileDto mobileDto1 = new MobileDto("Vivo", 30000, "blue", "exgon", 3.4f);

        MobileStorage mobileStorage = new MobileStorage();
        mobileStorage.saveValue(mobileDto);
        mobileStorage.saveValue(mobileDto1);


      //  MobileDto[] result = mobileStorage.readAll();
     //   for (int i = 0; i < result.length; i++) {
       //     System.out.println(result[i].getColour());


        MobileDto result1 = mobileStorage.findBrand("oppo");
        System.out.println(result1.getBrandName());
        System.out.println(result1.getColour());
        System.out.println(result1.getZoomLevel());
        System.out.println(result1.getPrice());
        System.out.println(result1.getProcessor());




        }


    }


