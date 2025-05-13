package infosys;

import java.util.HashMap;
import java.util.Map;

public class retrive_all_Data_in_hashmap {
	
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(1,"Testing");
		m.put(2, "Maheedhar");
		m.put(3, "Tester");
		for(Map.Entry<Integer,String> entry:m.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}

}
