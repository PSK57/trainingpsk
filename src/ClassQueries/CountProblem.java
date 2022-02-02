package ClassQueries;

public class CountProblem {
	public static void main(String args[]) {
		CountProblem obj = new CountProblem();
		int A[] = { 11, 25, 56, 12, 11, 25, 56, 25, 11, 11, 12, 56, 25, 11 };
		int a = A.length;
		obj.sort(A);
		System.out.println("Sorted array :- ");
		for (int i = 0; i < a; i++) {
			System.out.print(A[i] + " ");
		}
		int B[] = new int[A[a - 1] + 1];
		for (int i = 0; i < a; i++) {
			B[A[i]]++;
		}
		for (int i = 0; i < A[a - 1]; i++) {
			if (B[i] == 1) {
				System.out.print("\nThe number " + i + " occurs " + B[i] + " time.");
			} else if (B[i] > 1) {
				System.out.print("\nThe number " + i + " occurs " + B[i] + " times.");
			}
		}
	}

	public void sort(int A[]) {
		int a = A.length;
		for (int i = 0; i < a - 1; i++) {
			for (int j = 0; j < a - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					swap(A, j, j + 1);
				}
			}
		}
	}

	public void swap(int a[], int i, int j) {
		int s;
		s = a[i];
		a[i] = a[j];
		a[j] = s;
	}
}
