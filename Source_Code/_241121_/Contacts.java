package _241121_practice;

public class Contacts {
	private static int count = 0;
	private String name;
	private String tel;
	private String email;
	
	public Contacts(String name, String tel, String email) {
		super();
		this.name = name;
		this.tel = tel;
		this.email = email;
		Contacts.count++;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", tel=" + tel + ", email=" + email + "]";
	}

	public static int getCount() {
		return count;
	}
	
}
