package whiteboxqa.arrays;

public class Missing {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8,9,10};
		int i;
		
		for(i=2;i<arr.length;i++){
			
			//a = arr[i-1] ;
			
			if(arr[i-1] != arr[i]-1 ){
				//a = arr[i];
			}
			
		}
	
		
		
		
	}
	
}
