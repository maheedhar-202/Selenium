package infosys;

public class max_elements_in_array {
	
	public static void main(String[] args) {
	   int[] test= {134,2,3,4,5,6,10};
	   int max=test[0];
	   
	   for(int num:test) {
		   if(num>max) {
			   max=num;
		   }
	   }
	   System.out.println("Max characters in given Array:"+max);
	}

}
