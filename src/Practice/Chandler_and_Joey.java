package Practice;

import java.util.Scanner;

public class Chandler_and_Joey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int pizza = 0;
			if (N % 2 == 1) {
				int odd = (N / 2) + 1;
				int no = 0;
				if (odd % 2 == 1) {
					no = 1 + (odd / 2);
				} else if (odd % 2 == 0) {
					no = 2 * (1 + (odd / 2));
				}
				pizza = no;
			} else if (N % 2 == 0) {
				int even = N / 2;
				int no = 0;
				if (even == 1) {
					no = 1;
				} else if (even > 1) {
					no = 1 + (int) (Math.pow(2, even - 2));
				}
				pizza = no;
			}
			if (pizza % 2 == 1) {
				System.out.println("NO");
			} else if (pizza % 2 == 0) {
				System.out.println("YES " + pizza);
			}
		}
		sc.close();
	}
}
