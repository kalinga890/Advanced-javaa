package com.tutorsdude.jdbcpostgrel;

import com.tutorsdude.jdbcpostgrel.contacts.DbContacts;
import com.tutorsdude.jdbcpostgrel.dto.CarsDto;
import com.tutorsdude.jdbcpostgrel.repository.CarsRepository;

import java.sql.*;

public class Runner {

    public static void main(String[] args) {


         CarsRepository carsRepository =new CarsRepository();

              // INSERT

//        CarsDto dto = new CarsDto("Nissan","GTR",2021);
//
//        Boolean insetResult = carsRepository.saveCars(dto);
//
//        System.out.println(insetResult);

             // READ ALL
//
//         carsRepository.readCars(dto);

                 // UPDATE

//        CarsDto updateCar = new CarsDto("Maruti","Baleno",2020);
//
//        Boolean resultUpdate = carsRepository.updateCars(updateCar,2001);-
//
//        System.out.println(resultUpdate);

                   // DELETE

//        Boolean deleteCars = carsRepository.deleteCars("Ford");
//
//        System.out.println(deleteCars);



            // FIND BY BRAND NAME

//        Boolean result =carsRepository.findBrandName("Nissan");
//
//        System.out.println(result);














    }
}
