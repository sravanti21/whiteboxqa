package whiteboxqa.strings;

public class Palindrome {
	public static void main(String[] args) {

		String inputPalindrome = "malayalam";
		boolean isPal = isPalindrome(inputPalindrome);

		System.out.println(inputPalindrome +" is a palindrome word : "+isPal);
	}

	public static boolean isPalindrome(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
