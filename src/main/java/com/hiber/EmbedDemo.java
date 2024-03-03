package com.hiber;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.helper.FactoryProvider;

import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.RollbackException;
import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;

public class EmbedDemo {

	public static void main(String[] args) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		SessionFactory factory = FactoryProvider.getFactory();
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Python");
		certificate.setDuration("2 months");
		
		Student student = new Student();
		student.setId(207);
		student.setName("Rjames William");
		student.setCity("New Delhi");
		student.setDate_admitted(new Date());
		student.setCerti(certificate);
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Android");
		certificate1.setDuration("4 months");
		
		Student student1 = new Student();
		student1.setId(208);
		student1.setName("Mikel James");
		student1.setCity("New Jersy");
		student1.setDate_admitted(new Date());
		student1.setCerti(certificate1);
		
		Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		
		session.persist(student);
		session.persist(student1);
		
		tx.commit();
		session.close();
		
	}

}
