package com.tutorsdude.youtubeprojet.service;

import com.tutorsdude.youtubeprojet.dto.VideoDto;

import java.util.List;

public interface YoutubeService {


    public boolean validateAndSave(VideoDto videoDto);

    public boolean likeVideo(String title);

    public List<VideoDto> searchByVideoTitle(String videoTitle);

    public List<VideoDto> readAll();

    public  boolean update(String newValue,String oldValue);

    public boolean delete(String title);
}
