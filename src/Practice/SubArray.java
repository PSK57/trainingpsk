package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		List<String> ar = new ArrayList<>(Arrays.asList(str.split(" ")));
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(ar.get(i));
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				int add = Add(arr, i, j);
				if (add < 0) {
					sum++;
				}
				add2 = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(sum);
		sc.close();
	}

	public static int add2 = 0;

	public static int Add(int arr[], int i, int j) {
		if (i >= 0) {
			add2 = add2 + arr[j];
			Add(arr, i - 1, j + 1);
		}
		return add2;
	}
}