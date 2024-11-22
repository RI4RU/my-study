package _241121_practice;

// 지인들의 연락서를 최대 100개까지 저장하고 검색하는 프로그램을 만들기
// 연락처를 입력하시오(종료 -1)
// 이름과 전화번호, 이메일을 입력하시오: Kim 010-111-2222 kim@java.com
// 이름과 전화번호, 이메일을 입력하시오: Park 010-111-3333 park@java.com
// 이름과 전화번호, 이메일을 입력하시오: Kim 010-111-2222 kim@java.com
// 이름과 전화번호, 이메일을 입력하시오: -1
// 지인들의 수는 3명입니다.

// 검색할 이름을 검색하시오: Park
// Park의 전화번호: 010-111-3333 이메일: park@java.com

public class TestContacts {
	public static void main(String[] args) {
		ContactsIO contactIO = new ContactsIO();
		
		contactIO.inputAllContacts();
		contactIO.searchContact();
	}
}
