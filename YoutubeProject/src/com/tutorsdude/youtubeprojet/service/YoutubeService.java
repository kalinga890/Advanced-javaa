package com.tutorsdude.youtubeprojet.service;

import com.tutorsdude.youtubeprojet.dto.VideoDto;
import com.tutorsdude.youtubeprojet.exception.VideoCommentsException;
import com.tutorsdude.youtubeprojet.exception.VideoLikesException;
import com.tutorsdude.youtubeprojet.exception.VideoQualityException;
import com.tutorsdude.youtubeprojet.repository.YoutubeRepositoryImp;

import java.util.List;

public class YoutubeService {

     YoutubeRepositoryImp repository = new YoutubeRepositoryImp();

    public boolean validateAndSave(VideoDto videoDto){
        if(videoDto!=null){
            if(videoDto.getQuality()>144){
                if(videoDto.getNoOfComments()<500){
                    if(videoDto.getNoOfLikes()<1000){

                        System.out.println("Video validated and save it");
                        return  repository.saveVideoDto(videoDto);


                    }

                    throw new VideoLikesException("Likes must be less than 1000");



                }  throw new VideoCommentsException("Video has too many comments (limit: 499)");

            }  throw new VideoQualityException("Video quality must be higher than 144p");

        } else
            System.out.println("videoDto not valid");
        return false;
    }



    public boolean likeVideo(String title) {
        if (title != null && !title.isEmpty()) {
            boolean updated = repository.likesCount(title);

            if (updated) {
                System.out.println("Like added successfully for video: " + title);
                return true;
            } else {
                System.out.println("Video not found: " + title);
                return false;
            }
        } else {
            System.out.println("Invalid title");
            return false;
        }
    }



    public List<VideoDto> searchByVideoTitle(String videoTitle) {
        if (videoTitle != null ) {
          return   repository.findByVideoTitle(videoTitle);

        }
        System.out.println("Search title is invalid");
        return null;

    }

    public List<VideoDto> readAll() {
        return repository.readAll();
    }


    public  boolean update(String newValue,String oldValue){

        return  repository.update(newValue,oldValue);
    }

    public boolean delete(String title){

        return repository.delete(title);
    }



}






















