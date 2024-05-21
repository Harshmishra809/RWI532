import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root","HarshMishra@");
		PreparedStatement ps= Connect.prepareStatement("update register city=? where email=? mobile=");
		String city1 = "pune";
		String Name = "HArsh";
		String  mobile="Sony";
		ps.setString(1, city1 );
		ps.setString(2, Name);
		ps.setString(3, mobile);
		
		int count =ps.executeUpdate();
		if(count> 0) {
			System.out.println("updated");
		}
		else {
			System.out.println("Error!");
		}

	}

}