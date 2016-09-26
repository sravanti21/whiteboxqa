package whiteboxqa.loops;

public class Prime {
	public static void main(String args[]) {
		int i;
		int j;
		int count = 10;
		for (i = 1; i < count; i++) {
			boolean isPrime = true;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + " is prime");
			} else {
				System.out.println(i + " is not prime");
			}
		}
	}
}
