package com.hb03.uni_onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb02.embeddable.Student02;

public class RunnerFetch03 {

	public static void main(String[] args) {
	
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student03.class).addAnnotatedClass(Diary.class);
		

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		//student fetch ediyoruz id ile	
		Student03 student = session.get(Student03.class, 1001);
		//diary fetch ediyoruz
		Diary diary= session.get(Diary.class, 101);
		
			System.out.println(student);
		    System.out.println("------------------------");
		    System.out.println(diary);
		    System.out.println("------------------------");
		    System.out.println(diary.getStudent()); // diary icinde bir student var, o yuzden ulasabiliyorum, iliskiyi diary yonetiyor.
		    //
		   
		
		

		
		
		tx.commit();

		//Session close edilmeli, edilmezse connection açık kalır. 
		session.close();
		

		sf.close();
		

	}

}