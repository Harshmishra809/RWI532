package Hibernatea;
import java.util.Date;

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
     
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       
       Student st = new Student();
       st.setId(101);
       st.setName("john");
       st.setCity("delhi");
       System.out.println(st);
       
       // creating object of Address class
       Address ad = new Address();
     ad.setStreet("Street1");
     ad.setCity("Delhi");
     ad.setOpen(true);
     ad.setAddedDate(new Date());
     ad.setX(123.543);
      
  Session session  =    factory.openSession();
  Transaction tx= session.beginTransaction();
  session.save(st);
  session.save(ad);
 tx.commit();
  session.close();
       System.out.println("done");
     
    }
}


