package z_5_TestMySQLConnection.z_5_TestMySQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlCon {

	public String dbConn(){  
		String result = "";
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://10.254.8.213:3306/mysql","root","WHbQPe3gSietbBSK");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select database()");  
			while(rs.next())  
				result = rs.getString(2);  
			con.close();  
		}catch(Exception e){ 
			result = e.getMessage();
			}  
		
		return result;
		
	}
	
}
