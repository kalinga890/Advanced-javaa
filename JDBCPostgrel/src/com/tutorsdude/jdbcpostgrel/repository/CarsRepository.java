package com.tutorsdude.jdbcpostgrel.repository;

import com.tutorsdude.jdbcpostgrel.contacts.DbContacts;
import com.tutorsdude.jdbcpostgrel.contacts.QueryContacts;
import com.tutorsdude.jdbcpostgrel.dto.CarsDto;

import java.sql.*;

import static com.tutorsdude.jdbcpostgrel.contacts.QueryContacts.INSERT_QUERY;

public class CarsRepository {

    // --------------------------INSET--------------------------------

    public boolean saveCars(CarsDto dto) {

        try {
            Class.forName(DbContacts.DRIVER.getValue());

            Connection connection = DriverManager.getConnection(DbContacts.URL.getValue(),
                    DbContacts.USER_NAME.getValue(), DbContacts.PASSWORD.getValue());

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);

            preparedStatement.setString(1, dto.getBrand());
            preparedStatement.setString(2, dto.getModel());
            preparedStatement.setInt(3, dto.getYear());

            preparedStatement.execute();
            return true;


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // ---------------------UPDATE-------------------------------


    public boolean updateCars( CarsDto dto, int oldYear) {

        try {

            Class.forName(DbContacts.DRIVER.getValue());

            Connection connection = DriverManager.getConnection(DbContacts.URL.getValue(),
                    DbContacts.USER_NAME.getValue(), DbContacts.PASSWORD.getValue());

            PreparedStatement preparedStatement = connection.prepareStatement(QueryContacts.UPDATE_QUERY);

            preparedStatement.setString(1,dto.getBrand());
            preparedStatement.setString(2, dto.getModel());
            preparedStatement.setInt(3,dto.getYear());
            preparedStatement.setInt(4,oldYear);


            preparedStatement.execute();
            return true;



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // -----------------------DELETE--------------------------------

    public boolean deleteCars(String brand) {

        try {

            Class.forName(DbContacts.DRIVER.getValue());

            Connection connection = DriverManager.getConnection(DbContacts.URL.getValue(),
                    DbContacts.USER_NAME.getValue(), DbContacts.PASSWORD.getValue());

            PreparedStatement preparedStatement = connection.prepareStatement(QueryContacts.DELETE_QUERY);

            preparedStatement.setString(1, brand);

            preparedStatement.execute();
            return true;


        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }

                 // -------------------READ ALL------------------------


    public boolean readCars(CarsDto dto){

        try {

            Class.forName(DbContacts.DRIVER.getValue());

            Connection connection = DriverManager.getConnection(DbContacts.URL.getValue(),
                    DbContacts.USER_NAME.getValue(), DbContacts.PASSWORD.getValue());

            PreparedStatement preparedStatement = connection.prepareStatement(QueryContacts.READ_ALL_QUERY);

                ResultSet resultSet = preparedStatement.executeQuery();


                while (resultSet.next()) {
                   String brand= resultSet.getString("brand");
                  String model =  resultSet.getString("model");
               int year =  resultSet.getInt("year");

                    System.out.println(brand);
                    System.out.println(model);
                    System.out.println(year);
                    System.out.println("----------------------------");
                }
                return true;


        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

                      // -------------FIND BY BRAND NAME--------------


    public boolean findBrandName(String brand ) {

        try {
            Class.forName(DbContacts.DRIVER.getValue());

            Connection connection = DriverManager.getConnection(DbContacts.URL.getValue(),
                    DbContacts.USER_NAME.getValue(), DbContacts.PASSWORD.getValue());

            PreparedStatement preparedStatement = connection.prepareStatement(QueryContacts.FIND_BY_BRAND_NAME_QUERY);

             preparedStatement.setString(1, brand);

           ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    return false;

    }



}
