package Infosys_HackerRank;

public class Common_Arrays_in_String {
	
	public static void commentvalue() {
		String[] s1= {"ad","ab","ac"};
		String[] s2= {"ad","ab","am"};
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					System.out.println("Yes "+s1[i]);
					System.out.println("Matched "+s1[i]+" ");
				}else {
					System.out.println("No "+s1[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		commentvalue();
	}
	

}

