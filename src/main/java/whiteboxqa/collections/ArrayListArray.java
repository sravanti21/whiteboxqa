package whiteboxqa.collections;
import java.util.ArrayList;

public class ArrayListArray {
	public static void main(String[] args) {

		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(2);
		ls.add(9);
		ls.add(4);
		ls.add(8);
		ls.add(0);
		ls.add(7);

		System.out.println("ArrayList  has " + ls);

		System.out.println("Array has " + arrayToString(changeToArray(ls)));

	}

	public static int[] changeToArray(ArrayList<Integer> al) {
		int[] ar = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			ar[i] = al.get(i);
		}
		return ar;
	}
	
	public static String arrayToString(int[] al){
		String s ="";
		for(int i=0;i<al.length;i++){
			s+=al[i]+",";
		}
		return s;
	}
}
