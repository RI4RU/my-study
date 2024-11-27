package _241127_practice;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Subject> subject;
	
	public Student(String name) {
		super();
		this.name = name;
		this.subject = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public List<Subject> getSubject() {
		return subject;
	}
	
	public Student addSubject(Subject name) {
		subject.add(name);
		return this;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + "]";
	}
	
}
