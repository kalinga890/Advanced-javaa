package com.tutorsdude.youtubeprojet.repository;

import com.tutorsdude.youtubeprojet.dto.VideoDto;

import java.util.List;

public interface YoutubeRepository {

    public boolean saveVideoDto(VideoDto dto);

    public List<VideoDto> readAll();

    public List<VideoDto> findByVideoTitle(String videoTitle);

    public boolean update(String newValue,String oldValue);

    public boolean delete(String title);

    public boolean likesCount(String title);


}



