package _181024;

public class _4 {
	public static class Calculation {
		// 여기에 정의한다.

		public int sum(int a, int b, int c) {
			return a + b + c;
		}

		public int sum(int a, int b) {
			return a + b;
		}

	}

	public static void main(String[] args) {
		Calculation obj = new Calculation();
		obj.sum(10, 20, 30);
		obj.sum(10, 20);
	}

}
