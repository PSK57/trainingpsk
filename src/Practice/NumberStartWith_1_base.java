package Practice;

import java.util.Scanner;

public class NumberStartWith_1_base {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(CheckIfstartsWithOne(n, b) ? "Yes" : "No");
		}
		sc.close();
	}

	static boolean CheckIfstartsWithOne(int n, int b) {
		int m = (int) (Math.log10(n) / Math.log10(2));
		for (int i = 1; i <= m; i++) {
			if (n >= (int) Math.pow(b, i) && n <= 2 * (int) Math.pow(b, i) - 1)
				return true;
		}
		return false;
	}
}