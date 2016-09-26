package whiteboxqa.strings;

public class Convert {
	public static void main(String[] args) {

		String convertValue = "This is nice ";
		System.out.println("Original word is : "+convertValue);
		
		String printConvert = convertsTo(convertValue);
		System.out.println("New word is : "+printConvert);
	}
	public static String convertsTo(String input){
		String us = "";
		int counter = 1;
			for(int i =0;i<input.length();i++){
				if ( input.charAt(i) == ' ' ){
					
					us+=counter+" ";
					counter++;
				}	
				else if (input.charAt(i)!=' '){
					us+=input.charAt(i);
					
				}
//				
			
				
		}
	  return us;
	}
}	
