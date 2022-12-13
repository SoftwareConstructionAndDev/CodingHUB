package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	private static DataBaseConnection obj=null;
	private DataBaseConnection()
	{
	}
	public static DataBaseConnection getInstance()
	{
		if (obj==null)
            obj = new DataBaseConnection();
		return obj;
	}
	public  Connection getconnection() {
		 Connection con=null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aqsababar", "root", "");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
	   }
}
