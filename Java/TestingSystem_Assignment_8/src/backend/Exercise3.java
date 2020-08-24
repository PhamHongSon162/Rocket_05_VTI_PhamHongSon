package backend;

import entity.MyMap;
import entity.Student2;

public class Exercise3 {
   public void question2() {
	   Student2<Integer> student1 = new Student2<Integer>(1, "Son");
	   Student2<Float> student2 = new Student2<Float>(2.0f, "Luc");
	   Student2<Double> student3 = new Student2<Double>(3.0, "Huy");
	   
	   print(student1);
	   print(student2);
	   print(student3);
	   
	   print(1);
	   print(2f);
	   print(3d);
   }

  public void question4() {
	
			Integer[] arrInt = { 7, 9, 11};
			Float[] arrFloat = { 7f, 9f, 12f };
			Double[] arrDouble = { 7.2, 9.7, 5.9 };
			
			printArray(arrInt);
			printArray(arrFloat);
			printArray(arrDouble);
		}

  private <T> void print(T a) {
		System.out.println(a);
	}

	private <T> void printArray(T[] arr) {
		for (T x : arr) {
			System.out.println(x);
		}
  }
public void question6() {
	MyMap<Integer,String> students = new MyMap<Integer, String>();
	
	students.put(1, "Son");
	students.put(3, "Luc");
	students.put(6, "Huy");
	
	System.out.println(students.getValue(3));
	}
}


