package com.tutorsdude.youtubeprojet.service;

import com.tutorsdude.youtubeprojet.dto.VideoDto;
import com.tutorsdude.youtubeprojet.exception.VideoCommentsException;
import com.tutorsdude.youtubeprojet.exception.VideoLikesException;
import com.tutorsdude.youtubeprojet.exception.VideoQualityException;
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


                    }

                    throw new VideoLikesException("Likes must be less than 1000");



                }  throw new VideoCommentsException("Video has too many comments (limit: 499)");

            }  throw new VideoQualityException("Video quality must be higher than 144p");

        } else
            System.out.println("videoDto not valid");
        return false;
    }



    public VideoDto validAndLikes(VideoDto title)   {
        if (title != null && title.getTitle() != null) {
            List<VideoDto> allVideos = repository.ReadAll();  // get all stored videos

            for (VideoDto video : allVideos) {
                if (video.getTitle().equalsIgnoreCase(title.getTitle())) {
                    int currentLikes = video.getNoOfLikes();
                    video.setNoOfLikes(currentLikes + 1);  // increment like
                    System.out.println("Video liked: " + video.getTitle());
                    return video; // return updated video
                }
            }

            System.out.println("Video with given title not found.");
            return null;

        } else {
            System.out.println("Invalid video title or null video");

            return null;
        }
    }


    public List<VideoDto> searchByVideoTitle(String titlePart) {
        if (titlePart != null ) {
          return   repository.findVideo(titlePart);

        }
        System.out.println("Search title is invalid");
        return null;

    }

    public List<VideoDto> ReadAll() {
        return repository.ReadAll();
    }
}






















