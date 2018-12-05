package _181205;

public class Player {
	int value;

	public Player() {
		this.value = -1;
	}

	public void setValue(int v) {
		this.value = v;
	}

	public int getValue() {
		return value;
	}

	public void play() {
	}

	@Override
	public String toString() {
		String output = "";
		if (value == 0) {
			output += "Rock";
		} else if (value == 1) {
			output += "Paper";
		} else if (value == 2) {
			output += "Scissor";
		}
		return output;
	}
}
