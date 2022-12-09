package com.hb04.bi_onetoonePractice03;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb04.bi_onetoone.Diary02;
import com.hb04.bi_onetoone.Student04;


public class RunnerFetch004 {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class)
				.addAnnotatedClass(Diary02.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		
		tx.commit();
		session.close();
	}

}
