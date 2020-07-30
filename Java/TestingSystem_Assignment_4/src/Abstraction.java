
public class Abstraction {
	public void question1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("Son", "0974688043");
		phone.removeContact("Son");
		phone.updateContact("Son", "0974688043");
		phone.searchContact("Son");
	}

	public void question2_3() {
		Employee employee = new Employee("Son", 7.9);
		employee.displayInfo();

		Manager manager = new Manager("Son", 8.6);
		manager.displayInfo();

		Waiter waiter = new Waiter("Son", 3.6);
		waiter.displayInfo();
	}

}


