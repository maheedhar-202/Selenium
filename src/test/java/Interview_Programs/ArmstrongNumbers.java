package Interview_Programs;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		int num=100;int sum=0; int temp;int res;
		temp=num;
		while(num>0) {
			res=num%10;
			System.out.println("persen"+res);
			num=num/10;
			System.out.println("div"+num);
			sum=sum+(res*res*res);
		}
		if(temp==sum) {
			System.out.println(num+"ArmStrong Number ");
		}else {
			System.out.println(num+" Not an Arm");
		}
	}

}
