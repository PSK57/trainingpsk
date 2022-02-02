package ClassQueries;

import java.util.Arrays;

public class Problem3Alt {
	public static void main(String args[]) {
		int arr[] = { 399, 400, 201, 50, 60, 80, 800, 1700, 210, 429, 500 };
		Arrays.sort(arr);
		int a = arr.length;
		for (int i = (a - 1); i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
