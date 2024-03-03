package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.helper.FactoryProvider;

public class OneToOneMapDemo {
	public static void main(String[] args) {

		SessionFactory factory = FactoryProvider.getFactory();

		// creating first QUestionMap object
		QuestionMap questionMap = new QuestionMap();
		questionMap.setqId(101);
		questionMap.setQ("What is Java");

		Answer ans = new Answer();
		ans.setAnsId(205);
		ans.setAns("Java is a programming language");
		ans.setQuestion(questionMap);
		questionMap.setAns(ans);

		// creating second QUestionMap object
		QuestionMap questionMap1 = new QuestionMap();
		questionMap1.setqId(102);
		questionMap1.setQ("What is JPA");

		Answer ans1 = new Answer();
		ans1.setAnsId(209);
		ans1.setAns("JPA is a java framework");
		ans1.setQuestion(questionMap1);
		questionMap1.setAns(ans1);

		//saving the data
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		s.persist(ans);
		s.persist(questionMap);
		
		s.persist(ans1);
		s.persist(questionMap1);

		tx.commit();
		s.close();
		factory.close();

	}
}
