import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class DbOperations {
	
	
	public Collection selectAll()
	{

		Connection con=null;
		ResultSet rs=null;
		con=DbConnection.getConnection();
		Employee e =new Employee();
		ArrayList a=new ArrayList();
		try {
			PreparedStatement u = con.prepareStatement("select * from Employee ");
			rs=u.executeQuery();
			while(rs.next())
			{
				a.add(rs.getInt(1));
				a.add(rs.getString(2));
				a.add(rs.getString(3));
				a.add(rs.getString(4));
				
			} 
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return a;
		
	}
	
}
