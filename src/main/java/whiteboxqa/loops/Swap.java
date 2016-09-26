package whiteboxqa.loops;

public class Swap {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		System.out.println(a + " " + b);
		while (a < 2) {
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println(a + " " + b);
		}
	}
}
