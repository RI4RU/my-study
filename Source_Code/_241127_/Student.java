package _241127_practice;

public class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "학생 이름: " + studentName;
    }

    @Override
    public int hashCode() {
    	return studentName.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            return this.studentName.equals(((Student) obj).getName());
        }
        return false;
    }

}
