package Interview_Programs;

public class Reverse_A_Number_Plandrom {
	public static void main(String[] args) {
		int num=1221;
		int temp=num;
		int reminder;
		int rev=0;
		while(num>0) {
			reminder=num%10;
			rev=(rev*10)+reminder;
			num=num/10;
		}
		System.out.println("Reverse Value:"+rev);
		if(rev==temp) {
			System.out.println("Given Number Is "+temp+" Plandrome");
		}else {
			System.out.println("Given Number Is Not "+temp+" Not Plandrome");
		}
	}
}
