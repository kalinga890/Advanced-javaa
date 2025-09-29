package com.tutorsdude.jpaclass;


import com.tutorsdude.jpaclass.Dto.VideoDto;
import com.tutorsdude.jpaclass.repository.VideoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class JpaRunner {

    public static void main(String[] args) {

      VideoRepository videoRepository = new VideoRepository();


        VideoDto videoDto = new VideoDto(13,"love song","karedantte",120,240,250,300,350);

//            boolean resultQuery = videoRepository.save(videoDto);
//
//                System.out.println(resultQuery);

//                videoRepository.update();
//
//                videoRepository.readAll();

//                videoRepository.delete();

                  videoRepository.findByTitle();










    }
}
