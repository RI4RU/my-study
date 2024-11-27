package _241127_practice;
/*
 * 학원 수강생 관리 프로그램
 * 개설된 과정은 영어A 영어B 수학A
 * 
 * 학원의 사정으로 같은 이름의 학생 등록 불가
 * 한 학생은 여러 과정 등록 가능
 * 같은 과목에 같은 학생이 중복 등록 불가
 * 각 반은 총원이 3명 (총원이 가득판 경우, 과목의 신규 반 개설)
 * 
 * 학원 전체 학생 목록을 확인할 수 있다
 * 특정 과목을 수강하는 학생 목록을 확인할 수 있다
 * 특정 학생이 수강하는 과정 목록을 확인할 수 있다
 */
public class Q1 {
	public static void main(String[] args) {
		Academy ac = new Academy();
		Student stu1 = new Student("s1");
		Subject sub1 = new Subject("영어A");
		Subject sub2 = new Subject("영어B");
		Subject sub3 = new Subject("수학A");
		
		stu1.addSubject(sub1);
		stu1.addSubject(sub3);
		System.out.println(stu1);
		
	}
}
