package _241127_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Academy {
	private List<Student> studentList;
	private List<Subject> subjectList;
	
	public Academy() {
		this.studentList = new ArrayList<>();
		this.subjectList = new ArrayList<>();
	}
	
	public Academy addStudent(Student name) {
		studentList.add(name);
		return this;
	}
	
	public Academy addSubject(Subject name) {
		subjectList.add(name);
		return this;
	}
	
	public List<Student> getAcademyStudentList() {
		return studentList;
	}

	public List<Subject> getAcademySubjectList() {
		return subjectList;
	}

//	public Map<String, List<String>> getStudentMap() {
//		return studentMap;
//	}
//
//	public Map<String, List<String>> getSubjectMap() {
//		return subjectMap;
//	}
//	
	
	
	
}
