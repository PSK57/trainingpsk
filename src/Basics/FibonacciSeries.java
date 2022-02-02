package Basics;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner N = new Scanner(System.in);
		int n = N.nextInt();
		int a = 0, b = 1;
		System.out.println(a);
		series(a, b, n);
		N.close();
	}

	public static void series(int a, int b, int n) {
		a = 0;
		b = 1;
		int s = 0;
		for (int i = 0; i < n; i++) {
			s = a + b;
			System.out.println(s);
			a = b;
			b = s;
		}
	}
}
