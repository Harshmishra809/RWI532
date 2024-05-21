import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertDemo {

	public static void main(String[] args) throws Exception{
		
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/railworld","root","HarshMishra@");
        System.out.println("Driver Connected");
        
        String name ="Harsh";
        String password="Harsh@1234";
        String city= "Indore";
        
        
       
        
        PreparedStatement ps= con.prepareStatement("Insert into emp values (?,?,?)");
        ps.setNString(1, name);
        ps.setString(2, password);
        ps.setString(3, city);
         int count = ps.executeUpdate();
        if(count>0) {
        	 System.out.println("Record added  successfully");
        }
        else {
        	System.out.println("Record addition Failed");
        }
        
        		
        
	}

}