package String_Interview_Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Common_value_in_Array {
	public static void main(String[] args) {
		Integer[] a1= {32,45,3,4,5};
		Integer[] a2= {3,9,10,15};
		List<Integer> common=new ArrayList<Integer>();
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					common.add(a1[i]);
					
				}
				
			}
		}
		System.out.println("Common Value :"+common);
		// By Using Retain All method
		List<Integer> Array1= new ArrayList<Integer>(Arrays.asList(a1));
		List<Integer> Array2= new ArrayList<Integer>(Arrays.asList(a2));
		Array1.retainAll(Array2);
		System.out.println(Array1);
		// By using Streams
		
	}
	

}
