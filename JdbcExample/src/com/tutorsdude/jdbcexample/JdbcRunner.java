package com.tutorsdude.jdbcexample;

import java.sql.*;

public class JdbcRunner {


    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/youtube_project";
        String user = "root";
        String password = "kalinga@567";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection connection= DriverManager.getConnection(url,user,password);

            System.out.println( "Connection successfully:" +connection);


          Statement statement =  connection.createStatement();

//          String query = "insert into video_dto (id,title_name,music_name,num_comments,num_likes,num_views,video_quality) values (11,'melodic','mayavi',200,300,450,600);";
//           statement.execute(query);

            String readquery = "select * from video_dto";

            ResultSet resultSet = statement.executeQuery(readquery);
            System.out.println(resultSet);

            while (resultSet.next()){
              int id = resultSet.getInt("id");
              String titleName = resultSet.getString("title_name");
              String musicName = resultSet.getString("music_name");
              int numComments = resultSet.getInt("num_comments");
              int numLikes = resultSet.getInt("num_likes");
              int numViews = resultSet.getInt("num_views");
              int video_quality = resultSet.getInt("video_quality");

                System.out.println("id:" + id);
                System.out.println("titleName:" + titleName);
                System.out.println("musicName:" + musicName);
                System.out.println("numComments:" + numComments);
                System.out.println("numLikes:" + numLikes);
                System.out.println("numViews:" + numViews);
                System.out.println("video_quality:" + video_quality);
                System.out.println("---------------------------------------");

            }


        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
