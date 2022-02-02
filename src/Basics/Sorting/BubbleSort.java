package Basics.Sorting;

public class BubbleSort {
	public static void main(String args[]) {
		BubbleSort obj = new BubbleSort();
		int arr[] = { 8, 4, 5, 6, 7, 2, 3, 1, 9, 6 };
		int a = arr.length;
		obj.sort(arr);
		for (int i = 0; i < a; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void sort(int arr[]) {
		int a = arr.length;
		for (int i = 0; i < a - 1; i++) {
			for (int j = 0; j < a - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public void swap(int arr[], int i, int j) {
		int s = arr[i];
		arr[i] = arr[j];
		arr[j] = s;
	}
}
