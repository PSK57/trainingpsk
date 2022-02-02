package Practice;

import java.util.Scanner;

public class RotateBy90 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					arr[i][j] = sc.nextInt();

			rotate(arr);
			printMatrix(arr);
		}
		sc.close();
	}

	static void printMatrix(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("");
		}
	}

	static void rotate(int matrix[][]) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				int t = 0;
				t = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = t;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int t = 0;
				t = matrix[j][i];
				matrix[j][i] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = t;
			}
		}
	}
}