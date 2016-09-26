package whiteboxqa.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortingMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Harry", 10);
		hm.put("Larry", 1000);
		hm.put("Elon", 9);
		hm.put("Sundar", 5);
		hm.put("Satya", 67);
		hm.put("Tim",40 );


		System.out.println("Original map  "+hm);
		System.out.println("Sorted map is "+sortMapByValue(hm));
	}
	
	public static Map<String,Integer> sortMapByValue(HashMap<String,Integer> inputMap){
		//this method takes an input parameter "inputMap" of type hashmap and gives a new hashmap 
		Set<String> ks = inputMap.keySet();
		//creating keyset of input hashmap meaning taking keys and putting it in a set
		List<String> ls = new ArrayList<String>();
		//creating a new arraylist	in order to be able to iterate   
		ls.addAll(ks);
		//adding all the keys in set to this new arraylist by addall method
		Collections.sort(ls,new SortComparator(inputMap));
		//sorting the arraylist based on the values of hashmap	
		Map<String,Integer> uhm = new LinkedHashMap<String,Integer>();
		for(String s :ls ){
			uhm.put(s,inputMap.get(s));
		
		}
		return uhm;
	} 
}
