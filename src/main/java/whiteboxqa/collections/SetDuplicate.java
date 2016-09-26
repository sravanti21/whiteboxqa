package whiteboxqa.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDuplicate {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 3, 4, 5, 2, 7, 8, 8, 10, 0, 5};
		Set<Integer> set = new HashSet<Integer>();
		for (int element : arr) {
			if (set.add(element) == false) {
				System.out.println(element + " is duplicated");

			}

		}

	}
}