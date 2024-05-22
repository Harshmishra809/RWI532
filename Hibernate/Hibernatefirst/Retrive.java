package Hibernate_first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Retrive {
   
    public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure("Hibernate.cfg.xml"); // Load default configuration file
        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();

                
    
        Student student =session.get(Student.class, 1);
        System.out.println(student);
        Transaction tx = session.beginTransaction();
       session.save(student);
       tx.commit();
        

        session.close();
        factory.close();
    }
}