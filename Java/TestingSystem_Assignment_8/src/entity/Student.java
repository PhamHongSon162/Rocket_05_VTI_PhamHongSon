package entity;

import java.time.LocalDate;
import java.util.Scanner;

import Utils.ScannerUtils;

public class Student implements Comparable<Student>{
	private static int count = 0;

	private int id;
	private String name;
	private LocalDate birthDay;
	private int score;

	public Student() {
		inputStudent();
		setId(++count);
	}

	public Student(String name) {
		this.name = name;
		setId(++count);
	}

	public Student(String name, LocalDate birthDay, int score) {
		this.name = name;
		this.birthDay = birthDay;
		this.score = score;
		setId(++count);
	}

	private void inputStudent() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên student: ");
		name = ScannerUtils.inputString(scanner, "Please input a name as String...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", birthDay=" + birthDay + ", score=" + score + '}';
	}

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.name.compareTo(student.getName());
	}

}
