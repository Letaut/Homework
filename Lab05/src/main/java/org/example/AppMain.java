package org.example;

import org.example.pojoclass.Air;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class AppMain
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Air.class).buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            Air emp = new Air("VIP");
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }

    }
}
