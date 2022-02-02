package Practice.ArrayRotations;

import java.util.Scanner;

public class NRotations {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int ar[] = { 1, 3, 5, 7, 9 };
		int k = inp % ar.length;
		for (int a = 0; a < k; a++) {
			for (int i = 0; i < ar.length - 1; i++) {
				swap(ar, i, i + 1);
			}
		}
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j] + " ");
		}
		sc.close();
	}

	public static void swap(int ar[], int i, int j) {
		int sw = ar[i];
		ar[i] = ar[j];
		ar[j] = sw;
	}
}