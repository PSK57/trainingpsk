package ClassQueries;

import java.util.Arrays;

public class Problem2 {
	public static void main(String args[]) {
		int arr[] = { 100, 50, 40, 200, 40, 50, 799, 1000 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
