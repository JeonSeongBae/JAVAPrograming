package _181212;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		int[] list;
		int sum = 0, count;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수의 개수");
		count = sc.nextInt();
		try {
			try {
				list = new int[count];

				for (int i = 0; i < count; i++) {
					System.out.println("정수를 입력하시오: ");
					list[i] = sc.nextInt();
				}
				sc.close();

				for (int i = 0; i < count; i++) {
					sum += list[i];
				}
				System.out.println("평균은 " + sum / count);

			} catch (NegativeArraySizeException e) {
				System.out.println("count가 음수가 될 수 없습니다.");
			}

		} catch (ArithmeticException e) {
			System.out.println("count는 0이 될 수 없습니다.");
		}

	}

}
