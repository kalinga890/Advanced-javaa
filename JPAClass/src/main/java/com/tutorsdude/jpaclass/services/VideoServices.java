package com.tutorsdude.jpaclass.services;

import com.tutorsdude.jpaclass.dto.VideoDto;
import com.tutorsdude.jpaclass.repository.VideoRepository;

import java.util.List;

public class VideoServices {

    VideoRepository videoRepository = new VideoRepository();


    public boolean validAndSave(VideoDto videoDto){

        if(videoDto.getVideo_quality()> 140){
            if(videoDto.getMusic_name().length()>=5){

              videoRepository.save(videoDto);
              return true;

            } else
                System.out.println("music name must be greater than equal to 5");

        } else

            System.out.println("Video quality must be greater than 144p");

        return false;
    }


    public boolean update(String music, String title ){

        if(music!=null && music.length()>=4){
            if(title!=null && title.length()>=4){

                videoRepository.update(music,title);
                return true;

            } else
                System.out.println("title not null and length must be greater than equal to 4");

        } else

            System.out.println("music not null and length must be greater than equal to 4");

        return false;

    }

    public boolean delete(String title){

        if(title!=null && title.length()>=4){

            videoRepository.delete(title);
            return true;

        } else
            System.out.println("title not null and length must be greater than equal to 4");

        return false;
    }


    public List<VideoDto> readAll(){

       return videoRepository.readAll();
    }


    public List<VideoDto> findByTitle(String title){

        if(title!=null && title.length()>=4){

            return videoRepository.findByTitle(title);


        } else

            System.out.println("title not null and length must be greater than equal to 4");

        return null;
    }


}
