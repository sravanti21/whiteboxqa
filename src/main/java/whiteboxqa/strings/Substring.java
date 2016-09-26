package whiteboxqa.strings;

public class Substring {
	public static void main(String[] args) {

//		int indexOfss = findSubstring("yearhah half", "half");
		
		String originalWord = "year and half plus month";
		
		System.out.println("Original word - "+originalWord);
		String newWord = replaceString(originalWord,"half","full");
		System.out.println("New word after replacement - "+newWord);
	}

	public static int findSubstring(String fs, String ss) {

		for (int i = 0; i < fs.length() - 1; i++) {

			if (ss.charAt(0) == fs.charAt(i)) {
				boolean isSubstring = true;
				for (int j = 0; j < ss.length() - 1; j++) {
					if (ss.charAt(j) != fs.charAt(i + j)) {
						isSubstring = false;
						break;
					}
				}
				if (isSubstring) {
					return i;
				}
			}
		}
		return -1;

	}
	
	
	
	public static String replaceString(String fs,String ss,String rs){
		int indexOfss = findSubstring(fs,ss);
		String us="";
		for (int i =0;i<fs.length();i++){
			if(i<indexOfss || i>=indexOfss +ss.length()){
				us = us+fs.charAt(i);
			}
			
			else if(i == indexOfss){
					for(int j =0;j<rs.length();j++){
							us =us + rs.charAt(j);
							
					}
				}	
			}
		return us;
	}
}
