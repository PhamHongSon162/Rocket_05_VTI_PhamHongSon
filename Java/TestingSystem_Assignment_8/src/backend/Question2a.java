package backend;

import java.util.LinkedList;
import java.util.Queue;

import entity.Student;

public class Question2a {
	public void question2() {

		System.out.println("Thứ tự student đến phỏng vấn từ sớm nhất đến muộn nhất: ");
		printStudentComeEarly();
		
	}
		
	public void printStudentComeEarly() {
	
			Queue<Student> students = new LinkedList<>();
			students.add(new Student("Nguyễn Văn Nam"));
			students.add(new Student("Nguyễn Văn Huyên"));
			students.add(new Student("Trần Văn Nam"));
			students.add(new Student("Nguyễn Văn A"));

		
			System.out.println(students.poll());
			System.out.println(students.poll());
			System.out.println(students.poll());
			System.out.println(students.poll());

		}

}
