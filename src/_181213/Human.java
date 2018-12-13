package _181213;

public class Human {
	String name;
	int age;

	public static void main(String[] args) {
		Human human1 = new Human("춘향", 18);
		Human human2 = new Human("몽룡", 21);
		Human human3 = new Human("사또", 50);
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 나이 : " + age;
	}

	public String getProfession() {
		return null;
	}
}
