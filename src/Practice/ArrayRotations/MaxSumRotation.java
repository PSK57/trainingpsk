package Practice.ArrayRotations;

public class MaxSumRotation {

	public static int t = 0;

	public static int j = 0;

	public static void main(String arg[]) {
		int ar[] = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int a = 0; a < ar.length; a++) {
			int sum = 0;
			for (int i = 0; i < ar.length; i++) {
				sum = sum + (ar[i] * i);
			}
			if (t < sum) {
				t = sum;
			}
			for (int k = 0; k < ar.length - 1; k++) {
				Swap(ar, k, k + 1);
			}
		}
		System.out.println(t);
	}

	public static void Swap(int ar[], int i, int j) {
		int s = ar[i];
		ar[i] = ar[j];
		ar[j] = s;
	}
}