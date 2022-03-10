package com.technomaker.demohibernate.simple.util;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        //done
        try{
           sessionFactory = new Configuration().configure().buildSessionFactory();
        }catch (Throwable t){
            System.err.println("Echec de création de la sessionFactory: "+ t);
            throw new ExceptionInInitializerError(t);

        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
