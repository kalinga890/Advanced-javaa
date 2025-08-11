package com.tutorsdude.youtubeprojet.repository;

import com.tutorsdude.youtubeprojet.dto.VideoDto;

import java.util.ArrayList;
import java.util.List;

public class YoutubeRepository {

    private List<VideoDto> videoDtoList = new ArrayList<>();


    public boolean saveVideo(VideoDto videoDto) {
        if (videoDto != null) {
            videoDtoList.add(videoDto);
            System.out.println("Video saved");
            return true;

        } else
            System.out.println("Storage may be null or issue");
        return false;

    }

    public List<VideoDto> ReadAll() {
        return videoDtoList;
    }




    public List<VideoDto> findVideo(String videoTitle) {
        List<VideoDto> searchList = new ArrayList<>();
        if (videoTitle != null) {
            for (VideoDto dto : videoDtoList) {
                if (dto.getTitle().contains(videoTitle)) {
                    searchList.add(dto);
                }
            }
        }
        return searchList;
    }
}
















