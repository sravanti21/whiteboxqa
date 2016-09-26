package whiteboxqa.collections;

import java.util.HashMap;

public class HashMapEx {
public static void main(String[] args) {
	
	
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	
	hm.put("Shay",10);
	hm.put("Andrew",20);
	hm.put("Charlie",30);

	
	hm.get("Shay");
	System.out.println(hm.get("Shay"));


	

}
}
