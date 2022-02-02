package Basics.Sorting;

public class InsertionSort {
	public static void main(String args[]) {
		InsertionSort is = new InsertionSort();
		int arr[] = { 8, 4, 5, 6, 7, 2, 3, 1, 9, 6 };
		is.sort(arr);
		is.print(arr);
	}

	void sort(int arr[]) {
		int j, k;
		for (j = 0; j < arr.length; j++) {
			k = arr[j];
			while (j > 0 && arr[j - 1] > k) {
				int s = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = s;
				j--;
			}
		}
	}

	void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
