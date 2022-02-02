package Practice.ACBeginners;

import java.util.Arrays;

public class PracticeQ7ii {

	public static void main(String args[]) {
		int arr[] = { 12, 4, 6, 7, 8, 5, 3, 21, 89, 67, 34, 56, 71, 2, 7, 54 };
		int key = 71;
		int a = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < a; i++) {
			System.out.print(arr[i] + " ");
		}
		int res = bin(arr, 0, a - 1, key);
		if (res == -1) {
			System.out.println("\nNumber not found.");
		} else {
			System.out.println("\nNumber is at " + res + "th index.");
		}
	}

	public static int bin(int arr[], int i, int j, int k) {
		if (j >= i) {
			int mid = i + (j - i) / 2;
			if (arr[mid] > k) {
				return bin(arr, i, mid - 1, k);
			} else if (arr[mid] < k) {
				return bin(arr, mid + 1, j, k);
			} else if (arr[mid] == k) {
				return mid;
			}
		}
		return -1;
	}
}