package whiteboxqa.arrays;

/*
 * a. Write a program to find the largest number in a given array.
 */

public class LargestNumber {
	public static void main(String[] args) {
		
		int arr[] = {10,80,5,25,20,95,60,55,42};
		int largestNumber = findLargest(arr);
		
		System.out.println("The Largest number in the given array is: "+largestNumber);
	}
	
	
	
	public static int findLargest(int[] intputArray){
		int largest=0;
		
		for(int element:  intputArray){
			if(element>largest){
				largest=element;
			}
		}
		
		return largest;
	}
}
