package Sample.Selenium;

public class PrintNumberBehindCharacters {
	public static void main(String[] args) {
		String input="b11C23D1A12";
		StringBuilder output = new StringBuilder();
		
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			
			StringBuilder numberbuilder= new StringBuilder();
			
			while(i+1<input.length()&&Character.isDigit(input.charAt(i+1))) {
				numberbuilder.append(input.charAt(i+1));
				i++;
			}
			int repeatCount = Integer.parseInt(numberbuilder.toString());
			for(int j=0;j<repeatCount;j++) {
				System.out.print(c);
			}
		}
		System.out.println(output.toString());
	}
}
