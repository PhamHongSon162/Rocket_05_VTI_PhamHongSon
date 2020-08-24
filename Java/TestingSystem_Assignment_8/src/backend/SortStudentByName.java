package backend;

import java.util.Comparator;

import entity.Student;

public class SortStudentByName implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return  student1.getName().compareTo(student2.getName());
	}

}
