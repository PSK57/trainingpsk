package Basics.Sorting;

public class QuickSort {
	public static void main(String args[]) {
		int arr[] = { 8, 1, 2, 6, 7, 4, 91, 3, 50, 10 };
		int l = arr.length;
		sort(arr, 0, l - 1);
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int arr[], int i, int j) {
		if (i < j) {
			int m = partition(arr, i, j);
			sort(arr, i, m - 1);
			sort(arr, m + 1, j);
		}
	}

	public static int partition(int arr[], int low, int high) {
		int Pivot = arr[high];
		int i = low;
		int j = high - 1;
		int k = 0;
		while (i < j) {
			if (arr[i] > Pivot && arr[j] < Pivot) {
				swap(arr, i, j);
			}
			if (arr[i] <= Pivot) {
				i++;
			}
			if (arr[j] > Pivot) {
				j--;
			}
		}
		if (arr[i] > Pivot) {
			swap(arr, i, high);
			k = i;
		} else if (arr[i] < Pivot) {
			swap(arr, i + 1, high);
			k = i + 1;
		}
		return k;
	}

	public static void swap(int arr[], int i, int j) {
		int s = arr[i];
		arr[i] = arr[j];
		arr[j] = s;
	}
}
