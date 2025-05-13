package Sample.Selenium;

public class Array_Validating_Value {
	public static void main(String[] args) {
		int[] a= {6,8,11,6,7,18};
		int target=17;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				int sum = a[i]+a[j];
				if(sum==target) {
					System.out.println("Equals : "+a[i]+" "+a[j]+"="+sum);
				}else {
				System.out.println("Not Equals : "+a[i]+" "+a[j]+"="+sum);
				}
			}
			
		}
		
	}

}
