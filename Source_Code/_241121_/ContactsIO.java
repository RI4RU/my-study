package _241121_practice;

import java.util.Scanner;

public class ContactsIO {
	private final static Scanner SCAN = new Scanner(System.in);
	private final Contacts[] CONTACTS = new Contacts[100];
	
	public void inputAllContacts() {
		System.out.println("연락처를 입력하시오(종료 -1)");
		boolean flag = true;
		for (int i = 0; (i < CONTACTS.length) && flag; i++) {
			CONTACTS[i] = inputContacts();
		}
		System.out.println("지인들의 수는 " + Contacts.getCount() + "명입니다.");
	}
	
	public Contacts inputContacts() {
		System.out.print("이름과 전화번호, 이메일을 입력하시오: ");
		String name = SCAN.nextLine();
		String tel = SCAN.nextLine();
		String email = SCAN.nextLine();
		
		Contacts contact = new Contacts(name, tel, email);
//		System.out.println(contact);
		return contact;
	}
	
	public void searchContact() {
		System.out.print("검색할 이름을 입력하시오: ");
		String name = SCAN.nextLine();
		
		
	}

}