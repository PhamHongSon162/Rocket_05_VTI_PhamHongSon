import java.util.Date;
public class Exercise1 {

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
				
		// Account //
				
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
	
				
				
			// Group //
				
				Group group1 = new Group();
				group1.id = 1;
				group1.name = "Java Developer";
				group1.createDate = new Date("2020/07/25");

				Group group2 = new Group();
				group2.id = 2;
				group2.name = "PHP Junior";
				group2.createDate = new Date("2020/07/25");
				
				Group group3 = new Group();
				group3.id = 3;
				group3.name = "C++ Fresher";
				group3.createDate = new Date("2020/07/25");
				
				Group group4 = new Group();
				group4.id = 4;
				group4.name = "C# Fresher";
				group4.createDate = new Date("2020/07/25");
				
				
				
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

				Group[] groupOfAccount3 = { group1,group2,group3,group4 };
				account3.groups = groupOfAccount3;
				

				
			// Question 1 //
				
				if (account2.department == null) {
				System.out.println("Nhân viên này chưa có phòng ban");
				} else
					System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
				
			// Question 2 //
				// Q2 //
				if (groupOfAccount2.length == 0) {
				System.out.println("Nhân viên này chưa có group");

				} else if (groupOfAccount2.length == 1) {
				System.out.println("Group của nhân viên này là :  " + groupOfAccount2[0].name);

				} else if (groupOfAccount2.length == 2) {
				System.out.println("Group của nhân viên này là : " +  groupOfAccount2[0].name + "," +  groupOfAccount2[1].name);

				} else if (groupOfAccount2.length == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");

				} else
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
              // Question 5 //
				int s = groupOfAccount2.length;
				switch (s) {
				case 1:
				System.out.println("Nhóm có một thành viên");
				break;
				case 2:
				System.out.println("Nhóm có hai thành viên");
			    break;
			    case 3:
			    System.out.println("Nhóm có ba thành viên");
			    default:
				System.out.println("Nhóm có nhiều thành viên");
				}
			// question 6 //
			int l = groupOfAccount2.length;
				switch (l) {
				case 0:
	            System.out.println("Nhân viên này chưa có group");
				break;
				case 1:
				System.out.println("Group của nhân viên này là"+ groupOfAccount2[0].name);
				break;
				case 2:
				System.out.println("Group của nhân viên này là"+ groupOfAccount2[0].name + ", " + groupOfAccount2[1].name);
				break;
				case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
				default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
			// question6 //
			int y = groupOfAccount2.length;
			switch (y) {
			case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
			case 1:
			System.out.println("Group của nhân viên này là  "  + groupOfAccount2[0].name);
			break;
			case 2:
			System.out.println("Group của nhân viên này là" + groupOfAccount2[0].name + ", " + groupOfAccount2[1].name);
			break;
			case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
			default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				}
				// question 8 //
				Account[] accounts = { account1, account2, account3 };
				for (Account account : accounts) {
				System.out.println("Email: " + account.email);
				System.out.println("FullName: " + account.fullName);
				System.out.println("Department Name: " + account.department.name);
				}
				// question 9 //
				Department[] departments = { department1,department2,department3};
				for (Department department : departments) {
				System.out.println("ID:  " + department.id);
				System.out.println("Name:  "+department.name);
				}
				// question 10 //
				for(int i = 0; i < accounts.length; i++) {
				System.out.println("Thông tin account thứ " + (i+1) + " là :" );
				
				System.out.println("Email: " + accounts[i].email);
				System.out.println("FullName: " + accounts[i].fullName);
				System.out.println("Department Name: " + accounts[i].department.name);
				}
				// question 11 //
				for (int i = 0 ; i < departments.length; i++) {
				System.out.println("Thông tin department thứ " + (i+1) + " là :" );
				System.out.println("ID : " + departments[i].id);
				System.out.println("Name : " + departments[i].name);
				}
				// question 12 //
				for (int i = 0 ; i < 2 ; i++) {
				System.out.println("Thông tin department thứ " + (i+1) + " là :" );
				System.out.println("ID : " + departments[i].id);
				System.out.println("Name : " + departments[i].name);
				}
				// question 13//
				for (int i = 0; i < departments.length; i++) {
				if (i != 1) {
				System.out.println("Thông tin department thứ " + (i+1) + " là :");
				System.out.println("ID: " + departments[i].id);
				System.out.println("Name: " + departments[i].name);
				
				}
				}
				// question 14 //
				for(int i = 0; i < accounts.length; i++) {
				if (i != 3)
				{
				System.out.println("Email: " + accounts[i].email);
				System.out.println("FullName: " + accounts[i].fullName);
				System.out.println("Department Name: " + accounts[i].department.name);
				}
				}
				// question 15 //
				for (int i = 0 ; i <= 20 ; i++) {
				if(i%2==0) {
				System.out.println(i);
				}
				}
				// question 16 //
				// Q16-10.//
				int i = 0;
				while (i < accounts.length) {
					System.out.println("Thông tin account thứ " + (i + 1) + " là :");
					System.out.println("Email: " + accounts[i].email);
					System.out.println("Fullname: " + accounts[i].fullName);
					System.out.println("Department: " + accounts[i].department.name);
					i++;
				}

				// Q16-11.//
				i = 0;
				while (i < accounts.length) {
					System.out.println("Thông tin department thứ " + (i + 1) + " là :");
					System.out.println("ID: " + departments[i].id);
					System.out.println("Name: " + departments[i].name);
					i++;
				}

				// Q16-12.//
				i = 0;
				while (i < 2) {
					System.out.println("Thông tin department thứ " + (i + 1) + " là :");
					System.out.println("ID: " + departments[i].id);
					System.out.println("Name: " + departments[i].name);
					i++;
				}

				// Q16-13.//
				i = 0;
				while (i < departments.length) {

					if (i == 1) {
						i++;
						continue;
					}
					System.out.println("Thông tin department thứ " + (i + 1) + " là :");
					System.out.println("ID: " + departments[i].id);
					System.out.println("Name: " + departments[i].name);
					i++;
				}

				// Q16-14.//
				i = 0;
				while (i < accounts.length) {
					if (accounts[i].id >= 4) {
						i++;
						continue;
					}
					System.out.println("Thông tin account thứ " + (i + 1) + " là :");
					System.out.println("Email: " + accounts[i].email);
					System.out.println("Fullname: " + accounts[i].fullName);
					System.out.println("Department: " + accounts[i].department.name);
					i++;
				}

				// Q16-15.//
				i = 2;
				while (i <= 20) {
					System.out.println(i);
					i = i + 2;
				}
				
				
				
	}

}
