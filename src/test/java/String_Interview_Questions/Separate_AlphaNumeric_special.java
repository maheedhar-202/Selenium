package String_Interview_Questions;

public class Separate_AlphaNumeric_special {
	public static void main(String[] args) {
		String s= "Java 12345 !&@!|^$";
		StringBuffer Alpabets=new StringBuffer();
		StringBuffer Numbers=new StringBuffer();
		StringBuffer special=new StringBuffer();
		
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				Alpabets.append(s.charAt(i));
			}else if (Character.isDigit(s.charAt(i))) {
				Numbers.append(s.charAt(i));
			}else {
				special.append(s.charAt(i));
			}
		}
		System.out.println(Numbers);
		System.out.println(Alpabets);
		System.out.println(special);
		
	}

}
