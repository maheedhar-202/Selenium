package Interview_Programs;

public class Prime_number {
	public static void main(String[] args) {
		int n=6;
		if(isPrime(n)){
			System.out.println("Given Number Is Prime");
		}else{
			System.out.println("Given Number Is Not Prime");
		}
	}



	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			System.out.println(Math.sqrt(n));
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
