package Practice.ArrangeRearrange;

public class AlternativeSorting {

	public static void main(String args[]) {
		int ar[] = { 7, 1, 2, 3, 4, 5, 6 };
		int l = ar.length;
		Sort(ar, 0, l);
		for (int i = 0; i < l; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	public static void Sort(int ar[], int n, int l) {
		if (n < l - 2) {
			int max = ar[n];
			for (int i = n + 1; i < l; i++) {
				if (max < ar[i]) {
					max = ar[i];
				}
			}
			for (int i = 0; i < l; i++) {
				if (ar[i] == max) {
					Swap(ar, n, i);
				}
			}
			int min = ar[n + 1];
			for (int i = n + 2; i < l; i++) {
				if (min > ar[i]) {
					min = ar[i];
				}
			}
			for (int i = 0; i < l; i++) {
				if (ar[i] == min) {
					Swap(ar, n + 1, i);
				}
			}
			Sort(ar, n + 2, l);
		}
	}

	public static void Swap(int ar[], int i, int j) {
		int s = ar[i];
		ar[i] = ar[j];
		ar[j] = s;
	}
}