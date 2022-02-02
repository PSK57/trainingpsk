package Practice.ArrayRotations;

import java.util.Scanner;

public class RecursiveRotation {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = ar.length;
		Rotate(ar, inp, n);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		sc.close();
	}

	public static void Rotate(int ar[], int d, int n) {
		if (d > 0) {
			for (int j = 0; j < ar.length - 1; j++) {
				Swap(ar, j, j + 1);
			}
			d--;
			Rotate(ar, d, n);
		}
	}

	public static void Swap(int ar[], int i, int j) {
		int s = ar[i];
		ar[i] = ar[j];
		ar[j] = s;
	}
}