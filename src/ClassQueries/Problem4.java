package ClassQueries;

public class Problem4 {
	public static void main(String[] args) {
		int A[] = { 11, 12, 11, 34, 12, 45, 56, 67, 56, 34, 78, 90, 67 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			if (max < A[i]) {
				max = A[i];
			}
		}
		int B[] = new int[max + 1];
		for (int i = 0; i < A.length; i++) {
			B[A[i]]++;
		}
		for (int i = 0; i <= max; i++) {
			if (B[i] == 1) {
				System.out.println("The number " + i + " occurs " + B[i] + " time.");
			} else if (B[i] > 1) {
				System.out.println("The number " + i + " occurs " + B[i] + " times.");
			}
		}
	}
}
