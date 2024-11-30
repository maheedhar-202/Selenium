package Sample.Selenium;

public class Plaindrom {
	
	public static String text="smadams";
	//public static String text1;
	public static String text2="";
	public static String texts;
	
	public static void main(String[] args) {
		for(int i=text.length()-1;i>=0;i--) {
			text2 = text2+text.charAt(i);
			
			
			
		}
		System.out.println(text2);
		if(text.equals(text2)) {
			//System.out.print(text1);
			System.out.println("Give String in Plaindrom");
			
		}else {
			System.out.println("Given String not plaindrom");
		}
	}

}
