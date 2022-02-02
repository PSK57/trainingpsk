package ExamPractice.NovelVista;

import java.util.*;

public class Reverse {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String S1 = input.nextLine();
		input.close();
		String S2 = " ";
		int i = S1.length();
		for (int j = 0; j < i; j++) {
			char ch = S1.charAt(j);
			S2 = rev(S2, ch);
		}
		System.out.println(S2);
	}

	public static String rev(String S, char c) {
		return c + S;
	}
}