package com.tutorsdude.youtubeprojet.utils;

import com.tutorsdude.youtubeprojet.Constants.DbConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

    public static Connection getConnection(){

        try {
            Class.forName(DbConstants.DRIVER.getValue());

            Connection connection = DriverManager.getConnection(DbConstants.URL.getValue(),
                    DbConstants.USER_NAME.getValue(), DbConstants.PASSWORD.getValue());

            return connection;


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }


}
