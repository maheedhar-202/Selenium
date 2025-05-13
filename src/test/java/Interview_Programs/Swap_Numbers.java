package Interview_Programs;

public class Swap_Numbers {
	public static void main(String[] args) {
		// using 3 variables
		int a=100;int b=200;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swaping"+a+"And"+b);
		//using 2 variables
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swaping"+a+"And"+b);
		//Swapping a and b with XOR
		a=a^b;
		System.out.println(a);
		b=a^b;
		System.out.println(b);
		a=a^b;
		System.out.println("After Swaping"+a+"And"+b);
	}
	
	

}
