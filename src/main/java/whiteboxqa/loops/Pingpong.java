package whiteboxqa.loops;

public class Pingpong {
	public static void main(String args[]) {
		int i;
		for (i = 1; i < 10; i++) {
			if (i % 3 == 0) {
				System.out.println("ping");
			} else if (i % 5 == 0) {
				System.out.println("pong");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("ping pong");
			} else {
				System.out.println(i);
			}
		}
	}
}
