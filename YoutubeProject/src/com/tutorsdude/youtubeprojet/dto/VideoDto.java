package com.tutorsdude.youtubeprojet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class VideoDto {

    private String title;
    private String musicName;
    private int noOfLikes;
    private int quality;
    private int noOfComments;
    private int noOfShare;
    private int noOfViews;


}
