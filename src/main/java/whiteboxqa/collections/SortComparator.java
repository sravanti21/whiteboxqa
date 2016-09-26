package whiteboxqa.collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortComparator implements Comparator<String>{

	HashMap<String,Integer> hm;
	
	SortComparator(HashMap<String,Integer> hm){
		this.hm=hm;
	}
	
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(hm.get(o1)<hm.get(o2)){
			return -1;
		}
		if(hm.get(o1)==hm.get(o2)){
			return 0;
		}
		else{
			return 1;
		}
	}

}
