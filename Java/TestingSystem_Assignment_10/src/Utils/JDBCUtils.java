package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	private Connection con;   
    public Connection getConnection() throws SQLException {
	      if(con == null || con.isClosed()) {
	    	  String dbUrl = "jdbc:mysql://localhost:3306/ testingsystem";
	          String user = "root";
	          String pass = "123456";
	          
	          con = DriverManager.getConnection(dbUrl,user,pass);      
	  	
	    	  
	      }
	      return con;
	    }
	      
	     public void disconnect() throws SQLException {
	    	 if(con != null && !con.isClosed()) {
	    		 con.close();
	    	 }
	    	 
	     }
	 }
