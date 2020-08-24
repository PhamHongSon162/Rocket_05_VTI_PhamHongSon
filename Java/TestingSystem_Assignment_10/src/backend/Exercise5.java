package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exercise5 {
	 public boolean connectedForTesting() throws SQLException {
			String dbUrl = "jdbc:mysql://localhost:3306/ testingsystem";
		    String user = "root";
		    String pass = "123456";
		    
		    Connection con = DriverManager.getConnection(dbUrl,user,pass);      
			boolean test = false;
			
			System.out.println("Connect success!");
			test = true ;
			return test;
		}
}
