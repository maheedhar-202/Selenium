package Interview_Programs;

import java.util.Arrays;
import java.util.List;

public class Merging_two_arrays {
	public static void main(String[] args) {
		int array[]= {1,7,3,9,5};
		int array2[]= {6,2,8,4,10};
		
		//Create new array
		int newarray[] = new int[array.length+array2.length];
		System.arraycopy(array, 0, newarray, 0, array.length);
		System.arraycopy(array2, 0, newarray, array.length, array2.length);
		Arrays.sort(newarray);
		System.out.println("Array1:"+Arrays.toString(array));
		System.out.println("Array2:"+Arrays.toString(array2));
		System.out.println("Merrage Array:"+Arrays.toString(newarray));

		
		
	}

}
