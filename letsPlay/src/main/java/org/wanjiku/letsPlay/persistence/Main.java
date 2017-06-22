package org.wanjiku.letsPlay.persistence;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		/*UserAccount account = new UserAccount();
		account.setDateJoined(new Date());*/
		session.getTransaction().commit();
		session.close();
		System.out.println("number of users ");

	}

}
