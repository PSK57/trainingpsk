package Basics.Sorting;

public class MergeSort {
	public static void main(String args[]) {
		int arr[] = { 8, 4, 5, 6, 7, 2, 3, 1, 9, 6 };
		System.out.println("Given Array");
		printArray(arr);
		MergeSort obj = new MergeSort();
		obj.sort(arr, 0, arr.length - 1);
		System.out.println("\nSorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void merge(int arr[], int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int A[] = new int[n1];
		int B[] = new int[n2];
		for (int a = 0; a < n1; ++a) {
			A[a] = arr[low + a];
			for (int b = 0; b < n2; ++b) {
				B[b] = arr[mid + 1 + b];
			}
		}
		int i = 0, j = 0;
		int k = low;
		while (i < n1 && j < n2) {
			if (A[i] <= B[j]) {
				arr[k] = A[i];
				i++;
			} else {
				arr[k] = B[j];
				j++;
			}
			k++;
		}
		if (j >= n2) {
			while (i < n1) {
				arr[k] = A[i];
				i++;
				k++;
			}
		}
		if (i >= n1) {
			while (j < n2) {
				arr[k] = B[j];
				j++;
				k++;
			}
		}
	}

	void sort(int arr[], int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
