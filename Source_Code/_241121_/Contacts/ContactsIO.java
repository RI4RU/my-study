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
			if(CONTACTS[i].getName() == null) {
				flag = false;
			}
		}
		System.out.println("지인들의 수는 " + Contacts.getCount() + "명입니다.");
	}
	
	private Contacts inputContacts() {
		System.out.println("이름과 전화번호, 이메일을 입력하시오: ");
		String name = SCAN.nextLine();
		if (name.equals("-1")) {
			Contacts contact = new Contacts();
			return contact;
		}
		String tel = SCAN.nextLine();
		String email = SCAN.nextLine();
		Contacts contact = new Contacts(name, tel, email);

		return contact;
	}
	
	public void searchContact() {
		System.out.print("검색할 이름을 입력하시오: ");
		String name = SCAN.nextLine();
		boolean flag = true;
		int count = 0;
		for (int i = 0; (i < CONTACTS.length) && flag; i++) {
			if (name.equals(CONTACTS[i].getName())) {
				System.out.println(CONTACTS[i]);
				count++;
			}
			if (CONTACTS[i].getName() == null) {
				flag = false;
			}
		}
		if (count == 0) {
			System.out.println("일치하는 이름이 없습니다.");
		} else {
			System.out.println(count + "명이 검색되었습니다");
		}
	}
}