package com.tutorsdude.jpaclass.Utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DbUtils {

    public static EntityManagerFactory  getEntityManagerFactory(){

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tutorsdude");

            EntityManager entityManager = emf.createEntityManager();

            System.out.println(entityManager);

            return emf;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
