package com.hb02.embeddable_Practice001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave001 {

	public static void main(String[] args) {

		Student001 student01 = new Student001();

		Address001 address01 = new Address001();
		address01.setStreet("Apple Street");
		address01.setCity("Newyork");
		address01.setCountry("TR");
		address01.setPostCode(852);

		student01.setAddress0001(address01);

		PersonelInfo001 personelInfo1 = new PersonelInfo001();
		personelInfo1.setName("tarik");
		personelInfo1.setSurname("kose");
		personelInfo1.setSex("Male");

		student01.setPersonelInfo0001(personelInfo1);

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student001.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(student01);

		tx.commit();

		// Session close edilmeli, edilmezse connection açık kalır.
		session.close();

		sf.close();

	}

}
