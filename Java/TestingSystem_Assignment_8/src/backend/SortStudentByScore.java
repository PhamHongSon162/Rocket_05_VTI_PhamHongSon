package backend;

import java.util.Comparator;

import entity.Student;

public class SortStudentByScore implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		 if (student1.getScore() > student2.getScore()) {
	            return 1;
	        }
	        return -1;
	    }
	}