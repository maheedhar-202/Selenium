package infosys;

import java.util.HashSet;

public class Duplicate_Char_usingHashSet {

	public static void main(String[] args) {
		String[] arr= {"test","testing"};
		HashSet<Character> Unique_Character = new HashSet<Character>();
		HashSet<Character> Duplicate_Character = new HashSet<Character>();
		for(String word:arr) {
			for(char c:word.toCharArray()) {
				if(!Unique_Character.add(c)) {
					Duplicate_Character.add(c);
				}
			}
		}
		System.out.println("Unique Characters:"+Unique_Character.toString());
		System.out.println("Duplicate Characters:"+Duplicate_Character.toString());

	}

}
