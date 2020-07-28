
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
public class Exercise3 {

	public static void main(String[] args) {		
		//  Department //
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Marketing";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Sale";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Manager";
		
// Position //		
		
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Dev";

		Position position2 = new Position();
		position2.id = 2;
		position2.name = "PM";

		Position position3 = new Position();
		position3.id = 3;
		position3.name = "Test";
		
		// account //
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "hongson@gmail.com";
		account1.userName = "Hongsonbaka";
		account1.fullName = "Phạm Hồng Sơn";
		account1.position = position1;
		account1.department = department1;
		account1.createDate = new Date("2020/07/25");

		Account account2 = new Account();
		account2.id = 2;
	    account2.email = "lucgay@gmail.com";
	    account2.userName = "lucbede";
	    account2.fullName = "Lê Huy Lực";
		account2.position = position2;
		account2.department = department2;
		account2.createDate = new Date("2020/07/25");
		
		Account account3 = new Account();
		account3.id = 3;
	    account3.email = "huygay@gmail.com";
	    account3.userName = "Huybede";
	    account3.fullName = "Lê Đăng Huy";
		account3.position = position3;
		account3.department = department3;
		account3.createDate = new Date("2020/07/25");;
		
		// Exam //
		
		 Exam exam1 = new Exam();
		 exam1.id = 1;
		 exam1.code = "MH370";
		 exam1.title = " Khảo sát chất lượng JAVA";
		 exam1.duration = 60 ;
		 exam1.createDate = new Date("2020/07/25");;
		 exam1.creatorID = account1 ;
		 
		 Exam exam2 = new Exam();
		 exam2.id = 2;
		 exam2.code = "MH737";
		 exam2.title = " Khảo sát chất lượng SQL";
		 exam2.duration = 60 ;
		 exam2.createDate = new Date("2020/07/25");;
		 exam2.creatorID = account2 ;
		 //question 1 //
		 Locale locale = new Locale("vi", "VN");
		 DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
		 String date = dateformat.format(exam1.createDate);
		 System.out.println(exam1.code + ": " + date);
		 System.out.println("ID : " + exam1.id);
		 System.out.println("Title : " + exam1.title);
		 System.out.println("Duration : " + exam1.duration);
		 
		 // question 2 //
		String pattern = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Exam[] exams = { exam1, exam2 };
		for (Exam exam : exams) {
		date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.code + ": " + date);
		System.out.println("ID : " + exam1.id);
		System.out.println("Title : " + exam1.title);
		System.out.println("Duration : " + exam1.duration);
		}
		// Q3 //
		pattern = "yyyy";
		simpleDateFormat = new SimpleDateFormat(pattern);
		for (Exam exam : exams) {
		date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.code + ": " + date);
		System.out.println("ID : " + exam1.id);
		System.out.println("Title : " + exam1.title);
		System.out.println("Duration : " + exam1.duration);
		}

		// Q4 //
		pattern = "yyyy-MM";
		simpleDateFormat = new SimpleDateFormat(pattern);
		for (Exam exam : exams) {
		date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.code + ": " + date);
		System.out.println("ID : " + exam1.id);
		System.out.println("Title : " + exam1.title);
		System.out.println("Duration : " + exam1.duration);
		}
		// Q5 //
		pattern = "MM-dd";
		simpleDateFormat = new SimpleDateFormat(pattern);
		for (Exam exam : exams) {
		date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.code + ": " + date);
		System.out.println("ID : " + exam1.id);
		System.out.println("Title : " + exam1.title);
		System.out.println("Duration : " + exam1.duration);
		}
		
		
	}

}
