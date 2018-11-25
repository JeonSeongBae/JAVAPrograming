package _181121;

import java.util.Scanner;

class Main extends Sprite {

	@Override
	void move(char c) {
		if (c == 'h') {
			--x;
		} else if (c == 'j') {
			--y;
		} else if (c == 'k') {
			++y;
		} else if (c == 'l') {
			++x;
		}
	}
}

class Gold extends Sprite {
	public Gold() {
		x = 3;
		y = 6;
	}

	@Override
	void move(char c) {

	}
}

class Monster extends Sprite

{

	public Monster() {
		x = y = 7;
	}

	@Override
	void move(char c) {
		x += (Math.random() - 0.5) > 0 ? 1 : -1;
		y += (Math.random() - 0.5) > 0 ? 1 : -1;
	}

}

abstract class Sprite {
	int x = 3;
	int y = 3;

	abstract void move(char c);
}

public class MiniProject {

	private static Scanner sc;

	public static void main(String[] args) {
		char[][] map = {
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' }, };
		sc = new Scanner(System.in);
		Main mine = new Main();
		Monster monster = new Monster();
		Gold gold = new Gold();

		while (true) {
			for (int y = 0; y < map.length; y++) {
				for (int x = 0; x < map[y].length; x++) {
					if (y == monster.y && x == monster.x) {
						System.out.print('M');
					} else if (y == mine.y && x == mine.x) {
						System.out.print('@');
					} else if (y == gold.y && x == gold.x) {
						System.out.print('G');
					} else {
						System.out.print(map[y][x]);
					}
					System.out.println();
				}
				System.out.print("방향 hjkl");
				char c = sc.next().charAt(0);
				mine.move(c);
				monster.move(c);
			}
		}
	}

}
