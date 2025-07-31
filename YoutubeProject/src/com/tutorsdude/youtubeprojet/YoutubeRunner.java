package com.tutorsdude.youtubeprojet;

import com.tutorsdude.youtubeprojet.dto.UserDto;
import com.tutorsdude.youtubeprojet.dto.VedioDto;
import com.tutorsdude.youtubeprojet.repository.YoutubeRepository;
import com.tutorsdude.youtubeprojet.service.YoutubeService;

public class YoutubeRunner {


    public static void main(String[] args) {


        UserDto u1 = new UserDto("bangaluru",10,"12345678",583122,"kali");

        VedioDto v1 = new VedioDto("bangari",50,100,240,"classical vedio");

        YoutubeService youtubeService = new YoutubeService();

        youtubeService.validate(u1,v1);

        YoutubeRepository youtubeRepository = new YoutubeRepository();

        youtubeRepository.upload(v1);

        youtubeRepository.vedioLikes(v1);
        youtubeRepository.vedioLikes(v1);
        youtubeRepository.vedioLikes(v1);


        System.out.println(v1.likes());






    }
}
