package Practice;

public class BinaryArraySorting {

	public static void main(String args[]) {
		int A[] = { 1, 0, 1, 1, 1, 1, 1, 0, 0, 0 };
		int N = A.length;
		int B[] = new int[N];
		int No1 = 0, No0 = 0, end = N - 1, start = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] == 1) {
				No1++;
			} else if (A[i] == 0) {
				No0++;
			}
			if (No1 > 0) {
				B[end--] = 1;
				No1--;
			} else if (No0 > 0) {
				B[start++] = 0;
				No0--;
			}
		}
		for (int i = 0; i < N; i++) {
			A[i] = B[i];
		}
		for (int i = 0; i < N; i++) {
			System.out.print(A[i] + " ");
		}
	}
}