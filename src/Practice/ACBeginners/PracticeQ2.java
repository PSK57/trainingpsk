package Practice.ACBeginners;

public class PracticeQ2 {

	public static void main(String args[]) {
		String s1 = "MICROSOFT";
		String s2 = " ";
		int a = s1.length();
		for (int i = 0; i < a; i++) {
			char ch = s1.charAt(i);
			s2 = ch + s2;
		}
		System.out.print(s2);
	}
}