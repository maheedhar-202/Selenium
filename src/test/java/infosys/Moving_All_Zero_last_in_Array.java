package infosys;

public class Moving_All_Zero_last_in_Array {
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,0,4,0,5,0,7,0,8,0};
		
		int num=arr.length;
		
		int count =0;
		for(int i=0;i<num;i++) {
			if(arr[i]!=0) {
	          arr[count++]=arr[i];
			}
		}
		while(count<num) {
			arr[count++]=0;
		}
		System.out.println("Arayy After pushing Back the Zero's : ");
		for(int j=0;j<num;j++) {
			System.out.print(arr[j]);
		}
	}

}
