package com.tutorsdude.youtubeprojet;

import com.tutorsdude.youtubeprojet.dto.VideoDto;

import com.tutorsdude.youtubeprojet.service.YoutubeService;

import java.util.List;

public class YoutubeRunner {


    public static void main(String[] args) {


        VideoDto video = new VideoDto("bangari music",100,900,1000,240,480,"Classical song");

        VideoDto video1 = new VideoDto("Mayavi",200,800,500,600,720," Love song");


        YoutubeService youtubeService = new YoutubeService();

        youtubeService.validateAndSave(video);
        youtubeService.validateAndSave(video1);

        List<VideoDto> read= youtubeService.ReadAll();
        System.out.println(read);




    }








}
