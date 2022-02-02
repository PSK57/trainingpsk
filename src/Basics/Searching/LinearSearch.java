package Basics.Searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {
		LinearSearch ls = new LinearSearch();
		int arr[] = { 8, 4, 5, 6, 7, 2, 3, 1, 9, 6 };
		Scanner A = new Scanner(System.in);
		int b = A.nextInt();
		int res = ls.search(arr, b);
		if (res == -1) {
			System.out.println("Element " + b + " not present.");
		} else {
			System.out.println("Element " + b + " is at " + (res + 1) + "th Index.");
		}
		A.close();
	}

	public int search(int arr[], int b) {
		for (int i = 0; i < arr.length; i++) {
			if (b == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
