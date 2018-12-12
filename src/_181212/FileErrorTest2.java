package _181212;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileErrorTest2 {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
