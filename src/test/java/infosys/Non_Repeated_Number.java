package infosys;

import java.util.HashMap;
import java.util.Map;

public class Non_Repeated_Number {
	
	public static void main(String[] args) {
		int[] number= {1,2,5,8,8,2,5,6,6,6,6,6,6};
		Map<Integer,Integer> num=new HashMap<Integer, Integer>();
		for(int num1:number) {
			num.put(num1, num.getOrDefault(num1, 0)+1);
		}
		for(Map.Entry<Integer,Integer> entry: num.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}

}
