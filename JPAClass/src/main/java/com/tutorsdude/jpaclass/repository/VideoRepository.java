package com.tutorsdude.jpaclass.repository;


import com.tutorsdude.jpaclass.Dto.VideoDto;
import com.tutorsdude.jpaclass.Utils.DbUtils;
import jakarta.persistence.*;

import java.util.List;


public class VideoRepository {


    public boolean save(VideoDto dto){

       EntityManagerFactory entityManagerFactory = DbUtils.getEntityManagerFactory();


        EntityManager em = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(dto);

       transaction.commit();

       return true;
    }

    public List<VideoDto> readAll(){

     EntityManagerFactory emf =  DbUtils.getEntityManagerFactory();

      EntityManager em = emf.createEntityManager();

     EntityTransaction entityTransaction = em.getTransaction();

      String readQuery = "select dto from VideoDto dto";

      List<VideoDto> dtoList =  em.createQuery(readQuery,VideoDto.class).getResultList();

       entityTransaction.begin();

        System.out.println(dtoList);

        entityTransaction.commit();


        return dtoList;
    }


    public boolean update(){

       EntityManagerFactory emf  = DbUtils.getEntityManagerFactory();

       EntityManager em = emf.createEntityManager();

       EntityTransaction entityTransaction = em.getTransaction();

        entityTransaction.begin();

        String updateQuery = "update VideoDto dto set dto.music_name  = :mname where dto.video_title = :ntitle";

          Query query =  em.createQuery(updateQuery);

          query.setParameter("mname","chandira chacori");
          query.setParameter("ntitle","melodic song");


          query.executeUpdate();

          entityTransaction.commit();


        return true;
    }

    public boolean delete(){

      EntityManagerFactory emf = DbUtils.getEntityManagerFactory();

    EntityManager em = emf.createEntityManager();

          EntityTransaction et  = em.getTransaction();

          et.begin();

          String deleteQuery = "delete  from VideoDto dto where dto.video_title = :ntitle";

        Query query = em.createQuery(deleteQuery);

        query.setParameter("ntitle","melodic song");

        query.executeUpdate();

        et.commit();

        return true;
    }

    public List<VideoDto> findByTitle(){

     EntityManagerFactory emf =  DbUtils.getEntityManagerFactory();

   EntityManager em = emf.createEntityManager();

   String findTitle = "select dto from VideoDto dto where dto.video_title = :ntitle";

   TypedQuery<VideoDto> query = em.createQuery(findTitle,VideoDto.class);

   query.setParameter("ntitle","sad song");

        List<VideoDto> resultList = query.getResultList();

        System.out.println(resultList);


        return List.of();
    }

}
