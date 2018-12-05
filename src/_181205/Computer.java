package _181205;

import java.util.Random;

public class Computer extends Player {

	public Computer() {
		super();
	}

	@Override
	public void play() {
		Random random = new Random();
		value = random.nextInt(3);
	}
}
