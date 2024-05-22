package Hibernate_first;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration  con = new Configuration();
       con.configure("Hibernate.cfg.xml");
       SessionFactory factory = con.buildSessionFactory();
       
       Session session = factory.openSession();
       Student e1 = new Student();
       e1.setCity("Indore");
       e1.setName("Harsh");
       e1.setSalary("5000000");
        
       
                
       Transaction tx = session.beginTransaction();
       
       session.save(e1);
       tx.commit();       
       session.close();
       factory.close();
    }
}