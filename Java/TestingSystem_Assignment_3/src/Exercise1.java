import java.util.Random;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
			 question1();
			 question23();
			question4();
		}

		// Question 1:
		
		public static void question1() {

			float Salary1;
			float Salary2;

			Salary1 = (float) 5240.5;
			Salary2 = (float) 10970.055;
			System.out.println("Salary1: " + Salary1 + "||  Salary2: " + Salary2);

			int roundSalary1 = (int) Salary1;
			int roundSalary2 = (int) Salary2;
			System.out.println("roundSalary1: " + roundSalary1 + " ||  roundSalary2: " + roundSalary2);
		}

		// Question 2:
		
		public static void question23() {
			int min = 0;
			int max = 99999;
			int a = (int) (Math.random() * max) + min;
			while (a < 10000) {
				a = a * 10;
			}
			System.out.printf("===Question2======\n");
			System.out.println("Số ngẫu nhiên: " + a);

			System.out.println("======Question3=======");
			String b = String.valueOf(a);
			System.out.println("Hai số cuối: " + b.substring(3));
		}

		// Question 4:
		// Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		public static void question4() {
			int a, b;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập a = ");
			a = scanner.nextInt();
			do {
				System.out.println("Nhập b = ");
				b = scanner.nextInt();
				if (b == 0) {
					System.out.println("Vui lòng nhập b khác 0 !");
				}
			} while (b == 0);

			scanner.close();

			System.out.println("Thương: " + (float) a / (float) b);
		}
	}


