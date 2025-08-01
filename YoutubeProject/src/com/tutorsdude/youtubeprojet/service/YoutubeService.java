package com.tutorsdude.youtubeprojet.service;

import com.tutorsdude.youtubeprojet.dto.VideoDto;
import com.tutorsdude.youtubeprojet.repository.YoutubeRepository;

import java.util.List;

public class YoutubeService {

     YoutubeRepository repository = new YoutubeRepository();

    public boolean validateAndSave(VideoDto videoDto){
        if(videoDto!=null){
            if(videoDto.getQuality()>144){
                if(videoDto.getNoOfComments()<500){
                    if(videoDto.getNoOfLikes()<1000){
                        System.out.println("Video validated and save it");
                     return  repository.saveVideo(videoDto);

                    } else
                        System.out.println("Invalid: Video Likes more than 1000");
                    return false;


                } else
                    System.out.println("Invalid: Video Comments more than 500");
                return false;

            } else
                System.out.println("Invalid: video quality less than 144p");
            return false;

        } else
            System.out.println("videoDto not valid");
        return false;
    }

    public List<VideoDto> ReadAll(){
        return repository.ReadAll();
    }
}
