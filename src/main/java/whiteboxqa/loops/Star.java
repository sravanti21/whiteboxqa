package whiteboxqa.loops;

public class Star {

	public static void main(String[] args) {
		int count = 8;
		for (int i = 0; i < count; i++) {
			String s = " ";
			for (int j = 0; j < i; j++) {
				s = s + "*";
			}
			System.out.println(s);
		}
	}
}
