
public class Exercise4q1 {
	public void question1() {
		Student student1 = new Student("Son", "Ha Nam");
		student1.setMark(8);

		Student student2 = new Student("Luc", "Nam Dinh");
		student2.setMark(9);

		Student student3 = new Student("Linh", "Ha Noi");
		student3.setMark(2);

		student3.addMark(3);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}
}

