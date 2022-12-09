package com.hb02.embeddable_Practice001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class RunnerFetch001 {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student001.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Student001 student = session.get(Student001.class, 4);

		System.out.println(student);
//		System.out.println(student.getAddress());

//		System.out.println(student.getPersonelInfo());

		tx.commit();

		session.close();

		sf.close();

	}
}