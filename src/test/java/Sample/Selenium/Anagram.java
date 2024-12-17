package Sample.Selenium;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a1="Test";
		String a2="Maheedhar";
		
	char[]b1=a1.toCharArray();
	char[]b2=a2.toCharArray();
		
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		Arrays.sort(b1);
		Arrays.sort(b2);
		if(Arrays.equals(b1, b2)) {
			System.out.println("anagram");
		}else {
			System.out.println("Not an Anagram");
		}
	}

}
