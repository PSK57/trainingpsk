package ExamPractice.NovelVista;

import java.util.*;

public class Vowels {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int an = Output(str);
		sc.close();
		System.out.print(an);
	}

	public static int Output(String str1) {
		int n = 0;
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				n++;
			}
		}
		return n;
	}
}