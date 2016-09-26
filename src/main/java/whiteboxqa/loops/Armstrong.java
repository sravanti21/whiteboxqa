package whiteboxqa.loops;

public class Armstrong {
	public static void main(String args[]) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100;
			int b = (i % 10) % 10;
			int c = (i % 100) / 10;
			// System.out.println(a);
			// System.out.println(b);
			// System.out.println(c);
			// System.out.println(a^3);
			// System.out.println((a^3)+(b^3)+(c^3));
			if ((a * a * a) + (b * b * b) + (c * c * c) == i) {
				System.out.println(i + " is an Armstrong number");
			} else {
				System.out.println(i);
			}
		}
	}
}