package backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entity.Student;

public class Exercise2 {
	private List<Student> students;
	public Exercise2() {
	students = new ArrayList<>();
	inputStudents();
}
	private void inputStudents() {
		students.add(new Student("Son", LocalDate.parse("2020-07-29"), 7));
		students.add(new Student("Luc", LocalDate.parse("2020-07-25"), 9));
		students.add(new Student("Minh", LocalDate.parse("2020-07-04"), 8));
		students.add(new Student("Huy", LocalDate.parse("2020-07-28"), 10));
		System.out.println("List student vừa khởi tạo: ");
		printStudent();
	}

	private void printStudent() {
		for (Student st : students) {
			System.out.println(st);
		}
	}

//	Question 1: Comparable 

	public void question1() {
		Collections.sort(students);

		System.out.println("List sau khi sắp xếp theo tên/ ngày sinh/ điểm: ");
		printStudent();
		
		
	}
	//question2 : comparator
	public void question2() {
		SortStudentByName sortstudentbyname = new SortStudentByName();
		SortStudentByScore sortsudentbyscore = new SortStudentByScore();
		Collections.sort(students, sortstudentbyname.thenComparing(sortsudentbyscore));
		printStudent();
	}
}


