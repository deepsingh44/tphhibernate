package com.example;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		/*
		 * Transaction txt = session.beginTransaction();
		 * 
		 * Person p = new Person(); p.setName("Sandeep Hudda");
		 * p.setAddress("gzb");
		 * 
		 * Teacher t=new Teacher(); t.setTid(12398); t.setName("deep");
		 * t.setAddress("gzb"); t.setSalary(989898);
		 * 
		 * Student s=new Student(); s.setRoll(123); s.setMarks(87);
		 * s.setName("abhishek"); s.setAddress("delhi");
		 * 
		 * session.persist(p); session.persist(t); session.persist(s);
		 * 
		 * txt.commit(); System.out.println("success");
		 */

		Query q = session.createQuery("from Student");

		List<Student> list = q.list();
		
		for (Person p : list) {
			System.out.println(p.getName());
		}
	}
}
