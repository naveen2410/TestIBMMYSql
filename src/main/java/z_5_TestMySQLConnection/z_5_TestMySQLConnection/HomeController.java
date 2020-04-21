/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package z_5_TestMySQLConnection.z_5_TestMySQLConnection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;

@RestController
public class HomeController {

	@Value("${welcome}")
	private String welcome;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String ipaddress() throws Exception {

		/*String result="";
		try{  
			//Class.forName("com.mysql.jdbc.Driver"); 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager.get
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://mysql1234:3306/sampledb1234?user=root&password=G2WBtaWijqhexqYJ&useSSL=false");
			//"jdbc:mysql://mysql:3306/sampledb?user=root&password=hDgjFKdKO8avDhBt&useSSL=false");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT * FROM `demo`");  
			while(rs.next()){  
				result = rs.getString(2);
			}
			con.close();
			return result;
		}catch(Exception e){
			//System.out.println(e);
			return e.toString();
		}  */

		int i = 0;
		Runnable periodicTask = new Runnable() {
		    public void run() {
		        // Invoke method(s) to do the work
		    	try {
					insertTableMIISch();
					Thread.sleep(10000);
				} catch (SQLException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		};
		
		
		return "Finished";

	}

	public void insertTableMIISch() throws SQLException {

		Connection databaseConnection= null;

		//Connect to the database
		databaseConnection = DriverManager.getConnection("jdbc:mysql://mysql:3306/sampledb?user=root&password=hDgjFKdKO8avDhBt&useSSL=false");

		Statement stmt = databaseConnection.createStatement();

		String sql = "INSERT demo VALUES ('a"+Math.random()+"','b"+Math.random()+"')";

		stmt.execute(sql);

		System.out.println("A new record is recorded successfully!");

	}
}







