import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection getConnection() {
		
		Connection con=null;
		
		try {
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydb","root","root");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return con;
	}
	
}
