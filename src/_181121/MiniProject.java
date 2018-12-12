package _181121;

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
	int x = 3;
	int y = 3;

	abstract void move(char c);
}

public class MiniProject {

	private static Scanner sc;

	public static void main(String[] args) {
		char[][] map = {
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', ',', '#' },
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' }, };
		sc = new Scanner(System.in);

		Main mine = new Main();
		Monster monster = new Monster();
		Gold gold = new Gold();

		while (true) {
			boolean check = false;
			for (int y = 0; y < map.length; y++) {
				boolean check2 = false;
				for (int x = 0; x < map[y].length; x++) {
					boolean check3 = false;
					if (y == mine.y && x == mine.x) {
						System.out.print('@');
						check3 = true;
					}
					if (y == monster.y && x == monster.x) {
						System.out.print('M');
						if (check3) {
							System.out.println();
							System.out.println("Fail");
							check2 = true;
							break;
						}
					} else if (y == gold.y && x == gold.x) {
						System.out.print('G');
						if (check3) {
							System.out.println();
							System.out.println("Sucess");
							check2 = true;
							break;
						}
					} else {
						System.out.print(map[y][x]);
					}
				}
				if (check2) {
					check = true;
					break;
				}
				System.out.println();
			}
			if (check) {
				System.out.println("게임종료");
				break;
			}
			System.out.print("방향 wsad");
			char c = sc.next().charAt(0);
			mine.move(c);
			monster.move(c);
		}
	}

}
