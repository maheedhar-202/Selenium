package Collection_FrameWork;

import java.util.Arrays;

public class Arrays_Program {
	public static void main(String[] args) {
		int num[]=new int[3];
		num[0]=9;
		num[1]=10;
		num[2]=11;
		//num[3]=12;
		int num1[]=new int[4];
	    for(int i=0, k=2;i<num.length;i++,k--) {
	    	
	    	num1[k]=num[i];
	    }
	    System.out.println(Arrays.toString(num1));
	    System.out.println(Arrays.toString(num));
		
	}

}
