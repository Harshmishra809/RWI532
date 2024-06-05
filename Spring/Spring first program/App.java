package Spring.Springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	ApplicationContext context = new   ClassPathXmlApplicationContext("Spring.cfg.xml");
    	Employee emp =(Employee) context.getBean("emp");
    	System.out.println(emp);
        }
}
