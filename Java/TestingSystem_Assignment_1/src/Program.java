import java.time.LocalDate;
public class Program {

	public static void main(String[] args) {
		// department//

		
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Marketing";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Sale";
		
		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Manager";
		
	// position //
		
		

		Position position1 = new Position();
		position1.positionID = 1;
		position1.PositionName = positionName.DEV;

		Position position2 = new Position();
		position2.positionID = 2;
		position2.PositionName = positionName.PM ;
		
		Position position3 = new Position();
		position3.positionID = 2;
		position3.PositionName = positionName.TEST;
		

		// account //
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "hongson@gmail.com";
		account1.userName = "Hongsonbaka";
		account1.fullName = "Phạm Hồng Sơn";
		account1.position = position1;
		account1.department = department1;
		account1.createDate =  LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
	    account2.email = "lucgay@gmail.com";
	    account2.userName = "lucbede";
	    account2.fullName = "Lê Huy Lực";
		account2.position = position2;
		account2.department = department2;
		account2.createDate = LocalDate.now();
		
		Account account3 = new Account();
		account3.id = 3;
	    account3.email = "huygay@gmail.com";
	    account3.userName = "Huybede";
	    account3.fullName = "Lê Đăng Huy";
		account3.position = position3;
		account3.department = department3;
		account3.createDate = LocalDate.now();
		account3.userName = "Huybede";
		
		//group //
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "Java Developer";
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.groupID= 2;
		group2.groupName = "PHP Junior";
		group2.createDate = LocalDate.now();
		
		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "C++ Fresher";
		group3.createDate = LocalDate.now();
		
	
		
		Account[] accountOfGroup1 = { account1, account2, account3 };
		group1.accounts = accountOfGroup1;
		
		Account[] accountOfGroup2 = {account2, account3 };
		group2.accounts = accountOfGroup2;
		
		Account[] accountOfGroup3 = { account1,account2 };
		group3.accounts = accountOfGroup3;
		

		Group[] groupOfAccount1 = { group1,group2 };
		account1.groups= groupOfAccount1;

		Group[] groupOfAccount2 = {group2,group3 } ;
		account2.groups = groupOfAccount2;

		Group[] groupOfAccount3 = { group1,group2,group3 };
		account3.groups = groupOfAccount3;
		
		
		//Type question //
		
		TypeQuestion type1 = new TypeQuestion();
		type1.id = 1 ;
		type1.typeName = TypeName.ESSAY ;
		
		TypeQuestion type2 = new TypeQuestion();
		type2.id = 2 ;
		type2.typeName =TypeName.MULTIPLE_CHOICE;
		
		// CategoryQuestion //
		
		CategoryQuestion category1 = new CategoryQuestion();
		category1.id = 1 ;
		category1.categoryName = "Java";
		
		CategoryQuestion category2 = new CategoryQuestion();
		category2.id = 2 ;
		category2.categoryName = "SQL";
		
		// Question //
		
		
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "If else";
		question1.createDate = LocalDate.now();
		
		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Switch case";
		question2.createDate = LocalDate.now();
		
		// Answer //
		
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = " If else is";
		answer1.isCorrect = true ;
		
		
		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = " Switch case is";
		answer1.isCorrect = false ;
		
		
		//  Exam  //
		 
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "MH101";
		exam1.title = " Khảo sát chất lượng 1";
		exam1.duration = 60;
		exam1.createDate = LocalDate.now();
		
		 
		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "MH373";
		exam2.title = " Khảo sát chất lượng 2 ";
		exam2.duration = 90;
		exam2.createDate = LocalDate.now();
		
		
		
		
		
		
		
		
		
		
		//
		
		
		
		
		
                //in  department//
				
				System.out.println("Thông tin Department 1 : ");

				System.out.println("name: " + department1.departmentName);
				System.out.println("id: " + department1.departmentID);
				System.out.println("\n");

				System.out.println("Thông tin Department 2 : ");

				System.out.println("name: " + department2.departmentName);
				System.out.println("id: " + department2.departmentID);
				System.out.println("\n");
				
				// in position //
				System.out.println("Thông tin Position 1 : ");

				System.out.println("name: " + position1.PositionName);
				System.out.println("id: " + position1.positionID);
				System.out.println("\n");
				
				System.out.println("Thông tin Position 2 : ");

				System.out.println("name: " + position2.PositionName);
				System.out.println("id: " + position2.positionID);
				System.out.println("\n");
 

				// in account //
				
				
				System.out.println("Thông tin Account 1 : ");

				System.out.println("id: " + account1.id);
				System.out.println("Email: " + account1.email);
				System.out.println("username:  "+ account1.userName);
				System.out.println("fullname:  "+ account1.fullName);
				System.out.println("Department Name: " + account1.department.departmentName);
				System.out.println("Position Name:  "+ account1.position.PositionName);
				System.out.println("Create Date: " + account1.createDate);
				
				System.out.println("Thông tin Account 2 : ");

				System.out.println("id: " + account2.id);
				System.out.println("Email: " + account2.email);
				System.out.println("username:  "+ account2.userName);
				System.out.println("fullname:  "+ account2.fullName);
				System.out.println("Department Name: " + account2.department.departmentName);
				System.out.println("Position Name:  "+ account2.position.PositionName);
				System.out.println("Create Date: " + account2.createDate);
				
				//group //
				System.out.println("Thông tin group 1 : ");
				
				System.out.println("id:  "+ group1.groupID);
				System.out.println("Name:  "+ group1.groupName);
				System.out.println("Create Date: " + group1.createDate);
				
                System.out.println("Thông tin group 2 : ");
				
				System.out.println("id:  "+ group2.groupID);
				System.out.println("Name:  "+ group2.groupName);
				System.out.println("Create Date: " + group2.createDate);
				
				// Type question //
				System.out.println("Thông tin type question 1 : ");
				
				System.out.println("id:  "+ type1.id);
				System.out.println("Name:  "+ type1.typeName);
				
				// category question //
				
                System.out.println("Thông tin category question 1 : ");
				
				System.out.println("id:  "+ category1.id);
				System.out.println("Name:  "+ category1.categoryName);
				
				// question //
				 System.out.println("Thông tin  question 1 : ");
					
				 System.out.println("id:  "+ question1.id);
				 System.out.println("Content:  "+ question1.content);
				 System.out.println("Create Date:  "+ question1.createDate);
				 
				 // answer //
				 System.out.println("Thông tin  answer 1 : ");
					
				 System.out.println("id:  "+ answer1.id);
				 System.out.println("Content:  "+ answer1.content);
				 System.out.println("isCorrect:  "+ answer1.isCorrect);
				 
				 // exam //
				 System.out.println("Thông tin  exam 1 : ");
					
				 System.out.println("id:  "+ exam1.id);
				 System.out.println("Code:  "+ exam1.code);
				 System.out.println("Title:  "+ exam1.title);
				 System.out.println("Duration:  "+ exam1.duration);
				 System.out.println("Create Date:  "+ exam1.createDate);
				 
				 
				
				
				
	}

}
