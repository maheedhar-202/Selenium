package Interview_Programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter You Number");
		int num = s.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Given Number Value "+fact);
	}

}
