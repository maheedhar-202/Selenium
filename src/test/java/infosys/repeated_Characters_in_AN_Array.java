package infosys;

import java.util.HashMap;
import java.util.Map;

public class repeated_Characters_in_AN_Array {

	
	public static void main(String[] args) {
		String[] Words = {"hgshd","hjgdfs","hjdgf"};
		Map<Character,Integer> charCount=new HashMap<Character, Integer>();
		
		for(String word:Words) {
			for(char ch:word.toCharArray()) {
				charCount.put(ch,charCount.getOrDefault(ch,0)+1);
			}
		}
		char maxvalue=' ';
		int maxcount=0;
		System.out.println("Repeated Characters");
		for(Map.Entry<Character,Integer> entry:charCount.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"->"+entry.getValue()+" times");
			}
			if(entry.getValue()>maxcount) {
				maxvalue=entry.getKey();
				maxcount=entry.getValue();
			}
			
		}
		System.out.println(maxvalue+"->"+maxcount);
	}
}
