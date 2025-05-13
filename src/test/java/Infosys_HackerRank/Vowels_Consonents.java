package Infosys_HackerRank;

public class Vowels_Consonents {
	
	public static void main(String[] args) {
       String name="maheedhar";
       int vowels=0;
       int consonents=0;
       for(char c:name.toCharArray()) {
    	   if(c>'a'&&c<'z') {
    		   if(c=='a' || c=='e' || c=='i' || c=='o'||c=='u') {
    			   vowels++;
    		   }else {
    			   consonents++;
    		   }
    	   }
       }
       System.out.println(vowels);
       System.out.println(consonents);
	}

}
