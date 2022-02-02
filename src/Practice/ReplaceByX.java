package Practice;

import java.util.Scanner;

public class ReplaceByX {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		while (N > 0) {
			String inpS = sc.nextLine();
			String inpO = sc.nextLine();
			int Ol = inpO.length();
			for (int i = 0; i <= inpS.length() - Ol - Ol; i++) {
				String ch = inpS.substring(i, i + Ol);
				String ch2 = inpS.substring(i + Ol, i + Ol + Ol);
				if (ch.equals(ch2) && ch.equals(inpO)) {
					inpS = inpS.substring(0, i) + inpS.substring(i + Ol);
					i--;
				}
			}
			for (int i = 0; i <= inpS.length() - Ol; i++) {
				String str = inpS.substring(i, i + Ol);
				if (str.equals(inpO)) {
					inpS = inpS.substring(0, i) + "X" + inpS.substring(i + Ol);
				}
			}
			N--;
			System.out.println(inpS);
		}
		sc.close();
	}
}