package com.tutorsdude.hibernateMaven;


import com.tutorsdude.hibernateMaven.dto.VideoDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateRunner {

    public static void main(String[] args) {


        Configuration configuration = new Configuration();

        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5433/youtubedb");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "kalinga@567");

        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");

        configuration.addAnnotatedClass(VideoDto.class);


        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        System.out.println(sessionFactory);

         VideoDto dto = new VideoDto("melodic", "saniya",50,240,300,250,400);


         Session session = sessionFactory.openSession();

         Transaction transaction = session.getTransaction();

         transaction.begin();

         session.persist(dto);

         transaction.commit();















    }
}
