package Practice.ACBeginners;

public class PracticeQ5 {

	public static void main(String args[]) {
		String s1 = "FACEBOOK";
		char c = 'O';
		int a = s1.length();
		int b = 0;
		for (int i = 0; i < a; i++) {
			char ch = s1.charAt(i);
			if (ch == c) {
				b++;
			}
		}
		System.out.print(b);
	}
}