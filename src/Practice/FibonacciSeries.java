package Practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int No = N % 300;
			int a = 1, b = 1;
			for (int n = 3; n <= No; n++) {
				int Y = (a + b) % 100;
				a = b;
				b = Y;
			}
			System.out.println(b);
		}
		sc.close();
	}
}