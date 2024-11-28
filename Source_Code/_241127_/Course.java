package _241127_practice;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean addStudent(Student student) {
        if (students.size() >= 3) {
        	System.out.println("이 과목은 인원이 가득 찼습니다.");
            return false; // 이미 3명 이상일 경우, 반을 추가해야 함
        }
        if (!students.contains(student)) {
            students.add(student);
            return true;
        }
        return false; // 중복 학생 방지
    }

    public boolean isFull() {
        return students.size() >= 3;
    }

    @Override
    public String toString() {
        return "과목명: " + courseName + ", 수강생 수: " + students.size();
    }
}
