package com.technomaker.demohibernate;

import com.technomaker.demohibernate.simple.Formation;
import com.technomaker.demohibernate.simple.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DemoHibernate {

	public static void main(String[] args) {
		
		//done
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		Formation formation = new Formation("Hibernate");
		Formation jpa = new Formation("JPA");
		Long idFormation = (Long) session.save(formation);
		Long idFormation2 = (Long) session.save(jpa);
		System.out.println("Clé primaire:" + idFormation);
		System.out.println("Clé primaire:" + idFormation2);


		transaction.commit();
		session.close();
				
	}

}
