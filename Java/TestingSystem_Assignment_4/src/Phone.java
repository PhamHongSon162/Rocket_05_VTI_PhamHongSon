

public  abstract class Phone<Arraycontacts> {
	private Arraycontacts[] contacts;
	private String number;
	private String name;

	public abstract void insertContact(String name, String phone);

	public abstract void removeContact(String name);

	public abstract void updateContact(String name, String newPhone);

	public abstract void searchContact(String name);

	
	}


