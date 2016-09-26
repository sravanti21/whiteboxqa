package whiteboxqa.strings;

public class Reverse {
public static void main(String[] args) {
	
	String origWord ="Hi my name is Sravanti and I love icecream";
	System.out.println("Original Sentence is: "+origWord);
	
	String printReverse = reverseString(origWord);
	System.out.println("Reversed Sentence is : "+printReverse);
}
	
	public static String reverseString(String input){
		String us="";
			for(int i=input.length()-1;i>=0;i--){
				us+=input.charAt(i);
			}		
	return us;
	}
	
	
	
}
