package com.tutorsdude.youtubeprojet.Constants;

public class QueryConstants {

    public static String INSERT_QUERY = "INSERT INTO  video_dto (video_title,music_name,no_likes,video_quality,no_comments,no_share,no_viewes) VALUES (?,?,?,?,?,?,?)";

    public static String READ_ALL_QUERY = "SELECT * FROM video_dto";

    public static String UPDATE_QUERY = "UPDATE video_dto  SET music_name = ?   WHERE  video_title = ?";

    public static String DELETE_QUERY = "DELETE FROM video_dto WHERE video_title =  ?";

    public static String FIND_BY_TITLE_QUERY = "SELECT * FROM  video_dto WHERE video_title = ? ";

    public static String INCREMENT_LIKES_QUERY = "UPDATE video_dto SET  no_likes = no_likes + 1 WHERE video_title = ?";




}
