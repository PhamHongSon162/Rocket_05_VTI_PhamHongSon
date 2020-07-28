import java.time.LocalDate;
import java.util.Date;

public class Exercise6q2 {
//Q2 //
	
    public static void show2() {
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
		account3.createDate = new Date ("2020/07/25");
    	Account[] accounts = { account1, account2, account3 };
    	for (Account account : accounts) {
    		System.out.println("ID: " + account.id);
			System.out.println("Email: " + account.email);
			System.out.println("UserName: " + account.userName);
			System.out.println("FullName: " + account.fullName);
			System.out.println("Department Name: " + account.department.name);
			System.out.println("Position Name: " + account.position.name);
			System.out.println("CreateDate: " + account.createDate);
			}
    }
	public static void main(String[] args) {
	show2();
	}

}
