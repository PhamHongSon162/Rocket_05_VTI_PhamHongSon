package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Department;

public class DepartmentDao {
	public List<Department> getDepartments() throws SQLException{
		List<Department> departments = new ArrayList<>();
		String dbUrl = "jdbc:mysql://localhost:3306/ testingsystem";
        String user = "root";
        String pass = "123456";
        
      Connection myConn = DriverManager.getConnection(dbUrl,user,pass);      
		Statement statement = myConn.createStatement();

	
		String sql = "SELECT * FROM `Department`";
		ResultSet resultSet = statement.executeQuery(sql);

		
		while (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("DepartmentID"));
			department.setName(resultSet.getString("DepartmentName"));
			departments.add(department);
	}
		return departments;
	

}
}
