package Practice;

import java.util.Scanner;

public class CosmicNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int D = N / 9;
			int Q = N % 9;
			if (Q != 0) {
				System.out.print(Q);
			}
			for (int i = 0; i < D; i++) {
				System.out.print("9");
			}
			for (int i = 0; i < N; i++) {
				System.out.print("0");
			}
			if (N == 0) {
				System.out.print("0");
			}
			System.out.println();
		}
		sc.close();
	}
}