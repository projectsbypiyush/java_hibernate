package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.helper.FactoryProvider;

public class FetchData {

	public static void main(String[] args) {
		SessionFactory factory = FactoryProvider.getFactory();
		Session session = factory.openSession();

		// get method returns null if id not found
		// load method returns ObjectNotFoundException

		//use get if not sure
		//use load if you are sure that data exists
		
		//get method hits Session Cache or database immediately when method is called.
		//load method only returns proxy object on call and then executes select query on internal usage.
		
		// get method (for select query) to get student data with id 506
		Student student = (Student) session.get(Student.class, 3);
		System.out.println(student);

		session.close();
		factory.close();

	}

}
