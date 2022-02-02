package Basics.Searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {
		BinarySearch bs = new BinarySearch();
		Scanner A = new Scanner(System.in);
		int A1 = A.nextInt();
		int arr[] = { 8, 4, 5, 6, 7, 2, 3, 1, 9, 6 };
		int a = arr.length;
		bs.sort(arr);
		int res = bs.binary(arr, 0, a - 1, A1);
		if (res == -1) {
			System.out.println("Element not present.");
		} else {
			System.out.println("Element " + A1 + " is at " + (res + 1) + "th index.");
		}
		A.close();
	}

	void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	void swap(int arr[], int i, int j) {
		int s = arr[i];
		arr[i] = arr[j];
		arr[j] = s;
	}

	int binary(int arr[], int i, int j, int k) {
		if (j >= i) {
			int m = i + (j - i) / 2;
			if (arr[m] == k) {
				return m;
			} else if (k < arr[m]) {
				return binary(arr, i, m - 1, k);
			} else if (k > arr[m]) {
				return binary(arr, m + 1, j, k);
			}
		}
		return -1;
	}
}
