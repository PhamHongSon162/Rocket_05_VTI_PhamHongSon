package backend;

import entity.Student;

public class Question2 {
	@SuppressWarnings("deprecation")
	public static void question2() {
		Student student = new Student(1, "Nguyễn Văn A");
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		/**
		 * @deprecated replace by {@link #printtIdV2()}
		 * 
		 */
		
		System.out.println(student.getIdV2());

}
}
