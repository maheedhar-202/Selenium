package String_Interview_Questions;

public class Remove_Spaces_in_String {
	public static void main(String[] args) {
		String s="Iam Learning Java";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
