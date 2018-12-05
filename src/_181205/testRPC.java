package _181205;

public class testRPC {

	public static void main(String[] args) {
		User user = new User();
		Computer computer = new Computer();
		while (true) {
			user.play();
			computer.play();
			System.out.println("User : " + user);
			System.out.println("Computer : " + computer);
		}
	}

}
