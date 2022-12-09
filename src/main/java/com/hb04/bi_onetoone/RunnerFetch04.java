package com.hb04.bi_onetoone;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class)
				.addAnnotatedClass(Diary02.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// student fetch ediyoruz bir id ile
//	    Student04 student = session.get(Student04.class, 1001);

		// diary fetch ediyoruz
//	    Diary02 diary= session.get(Diary02.class, 101);
//	    
//	    System.out.println(student);
//	    System.out.println("------------------------");
//	    System.out.println(student.getDiary());
//	    System.out.println("------------------------");
//	    System.out.println(diary);
//	    System.out.println("------------------------");
//	    System.out.println(diary.getStudent());
//	    System.out.println("------------------------");

		/*hql ile arka planda hibernate tarafından oluşturulan sql (sutun 47-52)
		 * select student04x0_.std_name as col_0_0_, diary02x1_.name as col_1_0_ from
		 * Student04 student04x0_ inner join Diary02 diary02x1_ on (
		 * student04x0_.id=diary02x1_.std_id )
		 *Bizim yazdığımız sql 
		 * select s.std_name,d.name from student04 s inner join diary02 d on s.id=d.std_id; 
		 * 
		 * 
		 */
		// fetch ile
//		String hqlQuery1 = "SELECT s.name,d.name FROM Student04 s INNER JOIN FETCH Diary02 d on s.id=d.student";
//		List<Object[]> resultList1 = session.createQuery(hqlQuery1).getResultList();

//		for (Object[] objects : resultList1) {
//			System.out.println(Arrays.toString(objects));
//		}
		
//		resultList1.forEach(oa->{ // lamda expression ile cozum list den baska
//			System.out.println(Arrays.toString(oa));
//		});
		
//		String hqlQuery2 = "SELECT s.name,d.name FROM Student04 s LEFT JOIN FETCH Diary02 d on s.id=d.student";
//		List<Object[]> resultList2 = session.createQuery(hqlQuery2).getResultList();
//
//		for (Object[] objects : resultList2) {
//			System.out.println(Arrays.toString(objects));
//		}
//		//HQL ile RIGHT JOIN 
//		String hqlQuery3 = "SELECT s.name,d.name FROM Student04 s RIGHT JOIN FETCH Diary02 d on s.id=d.student";
//		List<Object[]> resultList3 = session.createQuery(hqlQuery3).getResultList();
//
//		for (Object[] objects : resultList3) {
//			System.out.println(Arrays.toString(objects));
//		}
//	
		String hqlQuery4 = "SELECT s.name,d.name FROM Student004 s FULL JOIN FETCH Diary002 d on s.id=d.student";
		List<Object[]> resultList4 = session.createQuery(hqlQuery4).getResultList();

		for (Object[] objects : resultList4) {
			System.out.println(Arrays.toString(objects));
		}
		String hqlQuery5="FROM student004 s INNER JOIN FETCH s.diary";
		List<Student04> resiList =session.createQuery(hqlQuery5,Student04.class).getResultList();
		
	

		tx.commit();
		session.close();
		sf.close();
	}

}
