package Basics.Sorting;

public class SelectionSort {

	public static void main(String args[]) {
		SelectionSort ss = new SelectionSort();
		int arr[] = { 8, 4, 5, 6, 7, 2, 3, 1, 9, 6 };
		ss.sort(arr);
		ss.print(arr);
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

	void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
