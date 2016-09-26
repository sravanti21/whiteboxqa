package whiteboxqa.loops;

public class SwapVariable {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int x1;
		System.out.println(a + " " + b);
		x1 = a + b;
		a = x1 - a;
		b = x1 - b;
		System.out.println(a + " " + b);
	}
}