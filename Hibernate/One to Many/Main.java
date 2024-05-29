package Onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Create a SessionFactory
    	
    	Configuration con = new Configuration();
    	con.configure("hibernate.cfg.xml");
        SessionFactory factory = con.buildSessionFactory();
                
                

        // Create a session
        Session session = factory.openSession();

        
          

            // Create a department
            Department department = new Department();
            department.setName("HR");

            // Create employees
            Employee employee1 = new Employee();
            employee1.setName("John Doe");
            employee1.setDepartment(department);

            Employee employee2 = new Employee();
            employee2.setName("Jane Doe");
            employee2.setDepartment(department);

            // Add employees to the department
            Set<Employee> employees = new HashSet<>();
            employees.add(employee1);
            employees.add(employee2);

            department.setEmployees(employees);
            
            Transaction tx = session.beginTransaction();

            // Save the department (which will save the employees as well)
            session.save(department);
            session.save(employee1);
            session.save(employee2);

           tx.commit();
           session.close();
           factory.close();
            
       
    }
}

