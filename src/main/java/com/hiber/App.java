package com.hiber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Student student = new Student();
        student.setId(1010);
        student.setName("Lotus Tesla");
        student.setCity("China");
        student.setDate_admitted(new Date()); 
        
        FileInputStream fis = new FileInputStream("src/main/java/group.png");
        byte [] data = new byte[fis.available()];
        fis.read(data);
        student.setImage(data);
        
        System.out.println(student);
        
        Session session = factory.openSession();
        
        session.beginTransaction();
         
        session.save(student);
        
        session.getTransaction().commit();
        
        session.close();
        
        System.out.println("Saved..");
        
        
    }
}
