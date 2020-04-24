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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.PostConstruct;

@RestController
public class HomeController {

	/*@Value("${welcome}")
	private String welcome;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String ipaddress() throws Exception {

		
		
		ExecutorService executor = Executors.newFixedThreadPool(30);
		Runnable worker = new MyRunnable(welcome);
		executor.execute(worker);
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {

		}
		return "Finished";

	}
	
	public static class MyRunnable implements Runnable {
		private final String url;

		MyRunnable(String url) {
			this.url = url;
		}


		public void run() {
			try {
				insertTableMIISch();
				Thread.sleep(10000);
			} catch (SQLException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void insertTableMIISch() throws SQLException {

		Connection databaseConnection= null;

		//Connect to the database
		databaseConnection = DriverManager.getConnection("jdbc:mysql://mysql:3306/sampledb?user=root&password=hDgjFKdKO8avDhBt&useSSL=false");

		Statement stmt = databaseConnection.createStatement();

		String sql = "INSERT demo VALUES ('a"+Math.random()+"','b"+Math.random()+"')";

		stmt.execute(sql);

		System.out.println("A new record is recorded successfully!");

	}*/
	
	 @PostConstruct
	    public void init() throws Exception {
		 
		 Connection databaseConnection= null;

			//Connect to the database
			databaseConnection = DriverManager.getConnection("jdbc:mysql://mysql:3306/sampledb?user=root&password=hDgjFKdKO8avDhBt&useSSL=false");

			Statement stmt = databaseConnection.createStatement();

			String sql = "INSERT demo VALUES ('a"+Math.random()+"','b"+Math.random()+"')";

			stmt.execute(sql);

			System.out.println("A new record is recorded successfully!");
	 }
}







