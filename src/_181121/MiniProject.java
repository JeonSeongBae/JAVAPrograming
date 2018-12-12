package _181121;

import java.util.Random;
import java.util.Scanner;

class Main extends Sprite {

	@Override
	void move(char c) {
		if (c == 'a') {
			--x;
		} else if (c == 'w') {
			--y;
		} else if (c == 's') {
			++y;
		} else if (c == 'd') {
			++x;
		}
		if (x < 1) {
			x = 1;
		}
		if (x > 17) {
			x = 17;
		}
		if (y < 1) {
			y = 1;
		}
		if (y > 8) {
			y = 8;
		}
	}
}

class Gold extends Sprite {
	public Gold() {
		x = random.nextInt(17) + 1;
		y = random.nextInt(8) + 1;
	}

	@Override
	void move(char c) {

	}
}

class Monster extends Sprite

{

	public Monster() {
		x = random.nextInt(17) + 1;
		y = random.nextInt(8) + 1;
	}

	@Override
	void move(char c) {
		x += (Math.random() - 0.5) > 0 ? 1 : -1;
		y += (Math.random() - 0.5) > 0 ? 1 : -1;
		if (x < 1) {
			x = 1;
		}
		if (x > 17) {
			x = 17;
		}
		if (y < 1) {
			y = 1;
		}
		if (y > 8) {
			y = 8;
		}
	}

}

abstract class Sprite {
	Random random = new Random();

	int x = random.nextInt(17) + 1;
	int y = random.nextInt(8) + 1;

	abstract void move(char c);
}

public class MiniProject {

	private static Scanner sc;

	public static void main(String[] args) {
		char[][] map = {
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
				{ '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
				{ '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
				{ '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
				{ '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
				{ '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
				{ '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
				{ '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
				{ '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' }, };
		sc = new Scanner(System.in);

		Main mine = new Main();
		Monster monster = new Monster();
		Gold gold = new Gold();

		System.out.println("방향 w(위) s(아래) a(왼쪽) d(오른쪽)");
		while (true) {
			for (int y = 0; y < map.length; y++) {
				for (int x = 0; x < map[y].length; x++) {
					if (y == mine.y && x == mine.x) {
						System.out.print('O');
					} else if (y == monster.y && x == monster.x) {
						System.out.print('X');
					} else if (y == gold.y && x == gold.x) {
						System.out.print('@');
					} else {
						System.out.print(map[y][x]);
					}
				}
				System.out.println();
			}
			char c = sc.next().charAt(0);
			mine.move(c);
			monster.move(c);
			if (mine.x == gold.x && mine.y == gold.y) {
				System.out.println("Sucess");
				break;
			} else if (mine.x == monster.x && mine.y == monster.y) {
				System.out.println("Fail");
				break;
			}
		}
	}

}
