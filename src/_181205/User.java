package _181205;

import java.util.Scanner;

public class User extends Player {
	private Scanner sc;

	public User() {
		super();
		sc = new Scanner(System.in);
	}

	@Override
	public void play() {
		System.out.println("Rock(0) Paper(1) Scissor(2)");
		while (true) {
			int select = sc.nextInt();
			if (select == 0 || select == 1 || select == 2) {
				value = select;
				break;
			} else {
				System.out.println("Retry");
			}
		}
	}
}
