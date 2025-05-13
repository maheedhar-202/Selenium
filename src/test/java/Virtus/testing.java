package Virtus;

public class testing {
	public static void main(String[] args) {
		String s= "Maheedhar";
		String s2="";
		//regex= {A,E,I,O,U};
		int vowelCount=0;
		String vowels="aeiouAEIOU";
		
		for(int i=s.length()-1;i>=0;i--) {
			    s2 = s2+s.charAt(i);
			 
		}
		System.out.println(s2);
		char[] ch = s.toCharArray();
		for(char cha:ch) {
			
			if(vowels.indexOf(cha)!=-1) {
				System.out.print(cha+" ");
				vowelCount++;
			}
		}
		System.out.println("vowels:"+vowelCount);
		
	}

}
