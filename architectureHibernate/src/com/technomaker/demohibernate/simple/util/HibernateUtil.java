package com.technomaker.demohibernate.simple.util;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        //todo
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
