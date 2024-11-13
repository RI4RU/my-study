package _241113_object;

// 스마트폰 클래스 작성 연습
// 필드
// 제조사, 모델, 가격, 통신사

// C 모든 필드를 초기화 하는 생성자
// getter, setter
// toString 모든 필드 문자열화

// equals 오버라이드
// => 스마트폰은 제조사와 모델명이 같으면 동일한 스마트폰

public class TestSmartPhone {

	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("samsung", "galaxy24 ultra", 1_698_400, "SKT");
		SmartPhone phone2 = new SmartPhone("apple", "iPhone16 pro", 2_000_000, "SKT");
		SmartPhone phone3 = new SmartPhone("samsung", "galaxy24 ultra", 1_358_720, "KT");
		
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		
		System.out.println("phone1 vs phone2 : " + phone1.equals(phone2));
		System.out.println("phone1 vs phone3 : " + phone1.equals(phone3));
		
	}

}
