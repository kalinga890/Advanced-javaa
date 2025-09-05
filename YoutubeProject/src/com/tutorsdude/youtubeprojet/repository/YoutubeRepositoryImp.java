package com.tutorsdude.youtubeprojet.repository;

import com.tutorsdude.youtubeprojet.Constants.QueryConstants;
import com.tutorsdude.youtubeprojet.dto.VideoDto;
import com.tutorsdude.youtubeprojet.utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class YoutubeRepositoryImp  implements  YoutubeRepository{

    public boolean saveVideoDto(VideoDto dto) {

        Connection connection = DbUtils.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.INSERT_QUERY);

            preparedStatement.setString(1, dto.getTitle());
            preparedStatement.setString(2, dto.getMusicName());
            preparedStatement.setInt(3, dto.getNoOfLikes());
            preparedStatement.setInt(4, dto.getQuality());
            preparedStatement.setInt(5, dto.getNoOfComments());
            preparedStatement.setInt(6, dto.getNoOfShare());
            preparedStatement.setInt(7, dto.getNoOfViews());

            preparedStatement.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    public List<VideoDto> readAll() {

        Connection connection = DbUtils.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.READ_ALL_QUERY);


            ResultSet resultSet = preparedStatement.executeQuery();

            List<VideoDto> dtoList = new ArrayList<>();

            while (resultSet.next()) {

                String videoTitle = resultSet.getString("video_title");
                String musicName = resultSet.getString("music_name");
                int noLikes = resultSet.getInt("no_likes");
                int videoQuality = resultSet.getInt("video_quality");
                int noComments = resultSet.getInt("no_comments");
                int noShare = resultSet.getInt("no_share");
                int noViewes = resultSet.getInt("no_viewes");

                VideoDto videoDto = new VideoDto(videoTitle, musicName, noLikes, videoQuality, noComments, noShare, noViewes);

                dtoList.add(videoDto);

            }
            return dtoList;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<VideoDto> findByVideoTitle(String videoTitle) {

        Connection connection = DbUtils.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.FIND_BY_TITLE_QUERY);

            preparedStatement.setString(1,videoTitle);

          ResultSet resultSet = preparedStatement.executeQuery();

          List<VideoDto> dtos = new ArrayList<>();

          while (resultSet.next()){

           String video_title =  resultSet.getString("video_title");
           String music_name =  resultSet.getString("music_name");
           int no_likes = resultSet.getInt("no_likes");
              int video_quality = resultSet.getInt("video_quality");
              int no_comments = resultSet.getInt("no_comments");
              int no_share = resultSet.getInt("no_share");
              int no_viewes = resultSet.getInt("no_viewes");

            VideoDto dto = new VideoDto(video_title, music_name,no_likes,video_quality,no_comments,no_share,no_viewes);

           dtos.add(dto);

          }
            return dtos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public boolean update(String newValue,String oldValue){

      Connection connection = DbUtils.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.UPDATE_QUERY);

            preparedStatement.setString(1,newValue);
            preparedStatement.setString(2,oldValue);

            preparedStatement.execute();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }


    public boolean delete(String title){

      Connection connection = DbUtils.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.DELETE_QUERY);

            preparedStatement.setString(1,title);

            preparedStatement.execute();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public boolean likesCount(String title){

       Connection connection = DbUtils.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.INCREMENT_LIKES_QUERY);

            preparedStatement.setString(1,title);

            preparedStatement.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return  true;

    }



}

















