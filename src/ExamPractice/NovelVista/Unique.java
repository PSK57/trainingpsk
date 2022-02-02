package ExamPractice.NovelVista;

import java.util.*;

public class Unique {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		input.close();
		int len = unique(s);
		System.out.println(len);
	}

	public static int unique(String s) {
		StringBuilder sb = new StringBuilder(s);
		char ch, ch2;
		for (int i = 0; i < sb.length(); i++) {
			ch = sb.charAt(i);
			for (int j = (i + 1); j < sb.length(); j++) {
				ch2 = sb.charAt(j);
				if (ch == ch2) {
					sb.deleteCharAt(j);
				}
			}
		}
		int l = sb.length();
		return l;
	}
}