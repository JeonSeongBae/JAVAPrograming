package _181213;

public class Student extends Human {
	String major;

	public static void main(String[] args) {
		Student student1 = new Student("명진", 21, "컴퓨터");
		Student student2 = new Student("미현", 22, "경영");
		Student student3 = new Student("용준", 24, "경제");
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String getProfession() {
		return this.major;
	}
}
