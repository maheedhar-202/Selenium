package Infosys_HackerRank;

public class ReplaceQuestionMarWithSubString {
	public static String getSmallestString(String word, String substr) {
		int wordLen=word.length();
		int substrLen=substr.length();
		String smallest=null;
		
		for(int i=0;i<=wordLen-substrLen;i++) {
			StringBuilder sb= new StringBuilder(word);
			boolean canPlace=true;
			for(int j=0;j<substrLen;j++) {
				char wc=sb.charAt(i+j);
				char sc=substr.charAt(j);
				if(wc!='?'&&wc!=sc) {
					canPlace=false;
					break;
				}
				sb.setCharAt(i+j,sc);
			}
			if(canPlace) {
				for(int k=0;k<wordLen;k++) {
					if(sb.charAt(k)=='?') {
						sb.setCharAt(k, 'a');
					}
				}
				String candidate=sb.toString();
				if(smallest==null ||candidate.compareTo(smallest)<0) {
					smallest=candidate;
				}
			}
		}
		return smallest==null ? "-1":smallest;		
	}
	
	public static void main(String[] args) {
	String word="as?b?e?gf?";
	String substr="dbk";
	System.out.println(getSmallestString(word, substr));
	
	}

}
