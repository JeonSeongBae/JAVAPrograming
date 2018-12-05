package _181205;

import java.util.Scanner;
import java.util.StringTokenizer;

public class testTokenizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		System.out.println(st.countTokens());
	}
}
