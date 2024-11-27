package _241127_practice;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private String name;
	private List<Student> student;
	
	public Subject(String name) {
		super();
		this.name = name;
		this.student = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public List<Student> getCourse() {
		return student;
	}
	
	public Subject addcourse(Student name) {
		student.add(name);
		return this;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", student=" + student + "]";
	}
	
}
