package Inte;

public class Vowles_in_a_String {
	public static void main(String[] args) {
		String s= "maheedhar";
		int vowels = 0 ;
		int consonents=0;
		
		for(char c:s.toCharArray()) {
			if(c > 'a' &&c <'z') {
				if(c =='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
					vowels++;
				}else {
					consonents++;
				}
			}
			
		}
		System.out.println("Vowles:"+vowels);
		System.out.println("Consonents:"+consonents);
	}

}
