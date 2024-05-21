import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ myData","root","HarshMishra@");
        PreparedStatement ps =con.prepareStatement("delete from student where email=?");
        String email="HarshMishra79532@gmail.com";
        ps.setString(1,email);
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("delete ");
        }
        else {
            System.out.println("failed");
        }
    }
}