package String_Interview_Questions;

public class Reverse {
	public static void main(String[] args) {
		String s1="MaaM";
		String s2="";

		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("Reverse Word"+s2);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Reverse String");
		}else {
			System.out.println("String is Not Reverse");
		}
		// Reverse with String builder
		StringBuilder s= new StringBuilder();
		s.append(s1);
		s.reverse();
		System.out.println(s);
		// Reverse With String Buffer
		StringBuffer sb= new StringBuffer(s1);
		sb.reverse();
		System.out.println(sb);
	}

}
