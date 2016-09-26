package whiteboxqa.strings;

public class Reverse_3a {
	public static void main(String args[]) {

		
//		StringUtil a =new StringUtil();
		String rev = doReverse("good");
		
		System.out.println(rev);

	}	
	public static String doReverse(String input){
		String reverse =" ";
		
		for(int i = input.length()-1;i>=0;i--){
			reverse += input.charAt(i);
		}
//		System.out.println(reverse);
	
		return reverse;
	}	
		
	
	
}