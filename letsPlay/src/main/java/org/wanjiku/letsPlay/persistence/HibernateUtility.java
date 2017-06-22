package org.wanjiku.letsPlay.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	
	public static SessionFactory sessionFactory;
	private HibernateUtility(){
	}
	private static synchronized SessionFactory getfactory(){
		if(sessionFactory == null){
			sessionFactory = new Configuration()
						.configure("hibernate.cfg.xml")
						.buildSessionFactory();
		}
		return sessionFactory;
			
		}
	public static synchronized Session getSession(){
		return  getfactory().openSession();
	}
		
	}
	

