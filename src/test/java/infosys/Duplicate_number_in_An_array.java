package infosys;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_number_in_An_array {
	public static void main(String[] args) {
		int[] arr= {10,15,10,15,16,18};
		Map<Integer,Integer> map= new HashMap<Integer, Integer>();
		
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"->"+entry.getValue()+"times");
			}
		}
	}

}
