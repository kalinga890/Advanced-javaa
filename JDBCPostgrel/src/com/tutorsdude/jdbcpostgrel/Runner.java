package com.tutorsdude.jdbcpostgrel;

import java.sql.*;

public class Runner {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/postgres";
        String username = "postgres";
        String password = "kalinga@567";



        try {
           Class.forName("org.postgresql.Driver");

           Connection connection = DriverManager.getConnection(url,username,password);

            System.out.println("successfully connected :" + connection);

          Statement statement = connection.createStatement();// create statements

//          String query = "insert into cars (brand,model,year) values ('swift','z1',2000);";
//
//            statement.execute(query);

            String readquery = "select * from cars";

          ResultSet resultSet = statement.executeQuery(readquery);
            System.out.println(resultSet);

            while (resultSet.next()){
               String brand = resultSet.getString("brand");
               String model  = resultSet.getString("model");
               int year      =  resultSet.getInt("year");


                System.out.println("brand :" + brand);
                System.out.println("model :" + model);
                System.out.println("year : " + year);
                System.out.println("-------------------------------------");
            }


       } catch (ClassNotFoundException e){
           e.printStackTrace();

       } catch (SQLException e){
            e.printStackTrace();
        }


    }
}
