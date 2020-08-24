package front_end;




import java.sql.SQLException;
import java.util.List;

import backend.DepartmentDao;
import entity.Department;

public class Program2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		question1();
			}
	private static void question1() throws SQLException {
		List<Department> departments = new DepartmentDao().getDepartments();

		for (Department department : departments) {
			System.out.println(department);
		}
	}
		

	}


