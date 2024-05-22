package Hibernatea;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emdemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration ();
		cfg.configure ("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Student student1 = new Student();
		student1.setId(3455);
		student1.setName("Harsh");
		student1.setCity("indore");
		student1.setCity("lko");
		Certificate certificate = new Certificate();
		certificate.setCourse("Android");
		certificate.setDuration("2 months");
		student1.setCerti(certificate);
		Session s= factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(student1);
		tx.commit();
		s.close();
		factory.close();
		
		

	}

}
