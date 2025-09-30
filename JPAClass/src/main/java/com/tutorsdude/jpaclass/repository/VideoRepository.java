package com.tutorsdude.jpaclass.repository;


import com.tutorsdude.jpaclass.dto.VideoDto;
import com.tutorsdude.jpaclass.utils.DbUtils;
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

     List<VideoDto> dtoList =  em.createNamedQuery("readQuery",VideoDto.class).getResultList();

       entityTransaction.begin();

       entityTransaction.commit();

       return dtoList;
    }


    public boolean update(String music, String title){

       EntityManagerFactory emf  = DbUtils.getEntityManagerFactory();

       EntityManager em = emf.createEntityManager();

       EntityTransaction entityTransaction = em.getTransaction();

        entityTransaction.begin();

          Query query =  em.createNamedQuery("updateQuery");

          query.setParameter("mname",music);
          query.setParameter("ntitle",title);

          query.executeUpdate();

          entityTransaction.commit();


        return true;
    }

    public boolean delete(String title){

      EntityManagerFactory emf = DbUtils.getEntityManagerFactory();

    EntityManager em = emf.createEntityManager();

          EntityTransaction et  = em.getTransaction();

          et.begin();

        Query query = em.createNamedQuery("deleteQuery");

        query.setParameter("ntitle", title);

        query.executeUpdate();

        et.commit();

        return true;
    }

    public List<VideoDto> findByTitle(String title){

     EntityManagerFactory emf =  DbUtils.getEntityManagerFactory();

   EntityManager em = emf.createEntityManager();

   TypedQuery<VideoDto> query = em.createNamedQuery("findByTitle", VideoDto.class);

   query.setParameter("ntitle", title);


   return  query.getResultList();

    }

}
