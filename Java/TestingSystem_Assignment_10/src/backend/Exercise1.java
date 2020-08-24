package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise1 {
	public void Position()throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/ testingsystem";
        String user = "root";
        String pass = "123456";
        
      Connection myConn = DriverManager.getConnection(dbUrl,user,pass);      
		Statement statement = myConn.createStatement();

	
		String sql = "SELECT * FROM `Position`";
		ResultSet resultSet = statement.executeQuery(sql);

		
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("PositionID"));
			System.out.println(resultSet.getString("PositionName"));
}
	}
}
