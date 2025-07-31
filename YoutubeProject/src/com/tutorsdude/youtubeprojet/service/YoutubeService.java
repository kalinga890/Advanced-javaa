package com.tutorsdude.youtubeprojet.service;

import com.tutorsdude.youtubeprojet.dto.UserDto;
import com.tutorsdude.youtubeprojet.dto.VedioDto;

public class YoutubeService {



    public boolean validate(UserDto userDto, VedioDto vedioDto){
        if (userDto != null && vedioDto != null) {
            if(userDto.getUsername().length()<=6){
                if(userDto.getPassword().length()<=8){
                    if(vedioDto.getQuality()>144){
                        // All validations passed
                        return true;

                    } else {
                        System.out.println("invalid:= vedio quality less than 144p");
                    }

                } else {
                    System.out.println("invalid user password");
                }

            } else {
                System.out.println("invalid username");
            }

        } else {
            System.out.println("value is null");

        }

        return false; // If any condition fails, return false
    }



}
