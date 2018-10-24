package _181024;

public class _3 {
	public static class Ractangle {
		int width, height;

		int area() {
			return width * height;
		}
	}

	public static void main(String[] args) {
		Ractangle myRect = new Ractangle();
		myRect.width = 10;
		myRect.height = 20;
		System.out.println("면적은 " + myRect.area());
	}

}
