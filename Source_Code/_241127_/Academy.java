package _241127_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Academy {
	private List<Student> studentList;
	private Map<String, Course> courseMap;
	
	public Academy() {
		studentList = new ArrayList<>();
		courseMap = new HashMap<>();
		
		courseMap.put("영어A", new Course("영어A"));
		courseMap.put("영어B", new Course("영어B"));
		courseMap.put("수학A", new Course("수학A"));
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public Map<String, Course> getCourseMap() {
		return courseMap;
	}
	
	public void printAcademyStudentList() {
		System.out.println("---학원의 학생 목록---");
		for (Student l : studentList) {
			System.out.println(l);
		}
	}
	
	public void printCourseStudentList(String courseName) {
		System.out.println("---" + courseName + "의 학생 목록---");
		if (courseMap.get(courseName) == null) {
			System.out.println("해당 과목을 수강하는 학생이 없습니다.");
		} else {
			for (Student s : courseMap.get(courseName).getStudents()) {
				System.out.println(s);
			}
		}
	}
	
	public void printCourseForStudent(String studentName) {
		System.out.println("---" + studentName + " 이 수강중인 과목---");
		
	}
}
