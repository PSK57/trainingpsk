package Practice.ArrayRotations;

public class RotationCount {
	public static void main(String args[]) {
		int ar[] = { 15, 18, 2, 3, 6, 12 };
		int k = 0;
		for (int a = 1; a < ar.length; a++) {
			if (ar[0] < ar[a]) {
				continue;
			} else {
				for (int i = 0; i < ar.length - 1; i++) {
					swap(ar, i, i + 1);
				}
			}
			a = 1;
			k++;
		}
		System.out.println(k);
	}

	public static void swap(int ar[], int i, int j) {
		int sw = ar[i];
		ar[i] = ar[j];
		ar[j] = sw;
	}
}