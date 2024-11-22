package _241121_practice;

public class Contacts {
	private static int count = 0;
	private String name;
	private String tel;
	private String email;
	
	public Contacts() {
		
	}
	
	public Contacts(String name, String tel, String email) {
		super();
		this.name = name;
		this.tel = tel;
		this.email = email;
		Contacts.count++;
	}

	@Override
	public String toString() {
		return name + "의 전화번호: " + tel + " 이메일: " + email;
	}

	public static int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}
	
}
