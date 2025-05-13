
package Virtus;

public class Array_assendingorder {
	public static void main(String[] args) {
		int value[] = {11,2,14,20,5};
		
		
		for(int i=0;i<value.length-1;i++) {
			for(int j=i+1;j<value.length;j++) {
				if(value[i]>value[j]) {
					int temp = value[i];
					value[i]=value[j];
					value[j]=temp;
				}
			}
		}
		System.out.print("Sorted Order:");
		
		for(int num:value) {
			System.out.print(num+" ");
			
			
		}
	}

}
