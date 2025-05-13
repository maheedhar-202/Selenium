package Infosys_HackerRank;

import java.util.regex.Pattern;

public class ReplaceQuestionMarkInSSub {
	public static String ReplaceQuestionMark(String string, String substring) {
		int len=substring.length();
		int minLen=string.length();
		for(int i=0;i<minLen-len;i++) {
			boolean canReplace=true;
			for(int j=0;j<len;j++) {
			char oldChar=string.charAt(i+j);
			char patChar=substring.charAt(j);
			if(oldChar!='?'&&oldChar!=patChar) {
				canReplace=false;
				break;
			 }
			}
			if(canReplace) {
				 // Build the final string with replacements
                StringBuilder result = new StringBuilder(string);
                for (int j = 0; j < len; j++) {
                    result.setCharAt(i + j, substring.charAt(j));
                }
                return result.toString();
			}
			
		}
		return "No Match";
	}
	
	public static void main(String[] args) {
		String s="m?rn?ng";
		String subString="morni";
		System.out.println(ReplaceQuestionMark(s, subString));
		
	}

}
