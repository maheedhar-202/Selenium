package Infosys_HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vowels_In_List_OfString {
	public static List<String> InVowles(List<String> givenValue,List<String> value){
		Set<Character> vowels=new HashSet<>();
		// Count =0;
		
		for(String val:value) {
			for(char c:val.toCharArray()) {
				vowels.add(c);
			}
		}
		List<String> result= new ArrayList<String>();
		for(String str:givenValue) {
			for(char s:str.toCharArray()) {
				if(vowels.contains(s)) {
					result.add(str);
					break;
				}
				
			}
		}
		return result;
	}
	public static void main(String[] args) {
		 List<String> given = Arrays.asList("apple", "sky", "orange", "bcd");
	        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");

	        System.out.println(InVowles(given, vowelList));
	}

}
