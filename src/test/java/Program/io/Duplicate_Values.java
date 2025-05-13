package Program.io;

import java.util.ArrayList;

public class Duplicate_Values {
	    public static void main(String[] args) {
	        String s = "Maheedhar";
	        ArrayList<Character> a = new ArrayList<>(); // Use Character instead of char

	        char[] value = s.toCharArray();

	        // Check for duplicate characters
	        for (int i = 0; i < value.length; i++) {
	            for (int j = i + 1; j < value.length; j++) { // j starts from i+1 to avoid self-comparison
	                if (value[i] == value[j] && !a.contains(value[i])) { // Avoid adding duplicates multiple times
	                    a.add(value[i]);
	                }
	            }
	        }

	        // Print duplicate characters
	        for (char c : a) { // Corrected loop
	            System.out.println(c + " is Duplicate");
	        }
	    }

}
