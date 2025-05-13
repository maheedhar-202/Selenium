package Infosys_HackerRank;

public class ReplaceWithQuestionMark {
	public static String replaceTheQuestionMark(String input, String replacement) {
		StringBuilder result= new StringBuilder();
		
		for(char c:input.toCharArray()) {
			if(c=='?') {
				result.append(replacement);
			}else {
				result.append(c);
			}
		}
			
			
		return result.toString();
	}
	public static void main(String[] args) {
		String input="a?b?c?d?";
		String replacement="b";
		String results = replaceTheQuestionMark(input, replacement);
		System.out.println("Given "+input+" Replaced Value "+results);
		
	}

}
