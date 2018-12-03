package _181128;

public class Student {
	String name;
	String studentNumber;
	String depart;
	int grade;
	int completeGrades;

	public Student() {
		super();
	}

	public Student(String name, String studentNumber, String depart, int grade, int completeGrades) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
		this.depart = depart;
		this.grade = grade;
		this.completeGrades = completeGrades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCompleteGrades() {
		return completeGrades;
	}

	public void setCompleteGrades(int completeGrades) {
		this.completeGrades = completeGrades;
	}

}
