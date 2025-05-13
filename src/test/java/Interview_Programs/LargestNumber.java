package Interview_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LargestNumber {
	public static void main(String[] args) {
		int num1=39;
		int num2=15;
		int num3=12;
		
		if(num1>=num2&&num1>=num3) {
			System.out.println(num1+" is Largest Number");
		}else if (num2>=num3&&num2>=num1) {
			System.out.println(num2+ "Is Largets Number");
		}else {
			System.out.println(num3+" Is Largest Number");
		}
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(num1);
		a.add(num2);
		a.add(num3);
		System.out.println(Collections.max(a)+ " Is Largest number");
		
	}

}
