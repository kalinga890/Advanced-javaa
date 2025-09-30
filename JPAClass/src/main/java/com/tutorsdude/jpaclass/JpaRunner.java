package com.tutorsdude.jpaclass;


import com.tutorsdude.jpaclass.dto.VideoDto;
import com.tutorsdude.jpaclass.services.VideoServices;

import java.util.List;

public class JpaRunner {

    public static void main(String[] args) {

        VideoServices videoServices = new VideoServices();


        VideoDto videoDto = new VideoDto(14,"melodic song","karedantte",120,480,250,300,350);

//        boolean insertResult = videoServices.validAndSave(videoDto);
//
//        System.out.println("successfully insert into the table:" + insertResult);

//         List<VideoDto> readAll = videoServices.readAll();
//
//         System.out.println(readAll);

           boolean updated = videoServices.update("naguva gulabi", "love song");

           System.out.println(updated);

//             boolean deleted = videoServices.delete("melodic song");
//
//             System.out.println(deleted);

//              List<VideoDto>  videoList =  videoServices.findByTitle("love song");
//
//              System.out.println(videoList)

    }
}
