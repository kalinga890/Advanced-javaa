package com.tutorsdude.jdbcpostgrel.contacts;

public class QueryContacts {

    public static String INSERT_QUERY = "insert into cars (brand,model,year) values (?,?,?)";

    public static String READ_ALL_QUERY = "select * from cars";

    public static String UPDATE_QUERY = "UPDATE cars SET brand = ?, model = ?, year = ?  WHERE year = ?";

    public static String DELETE_QUERY = "delete from cars where brand =  ?";

    public static String FIND_BY_BRAND_NAME_QUERY = "select * from  cars where brand = ? ";
}
