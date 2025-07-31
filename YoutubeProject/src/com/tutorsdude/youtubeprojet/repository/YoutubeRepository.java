package com.tutorsdude.youtubeprojet.repository;

import com.tutorsdude.youtubeprojet.dto.VedioDto;

import java.util.ArrayList;
import java.util.List;

public class YoutubeRepository {



    List<VedioDto> vedioDtoList = new ArrayList<>();


    public boolean upload(VedioDto vedioDto){
        vedioDtoList.add(vedioDto);

        return true;
    }

    public boolean vedioLikes(VedioDto vedioDto){
        vedioDto.likes();
        return true;

    }




}
