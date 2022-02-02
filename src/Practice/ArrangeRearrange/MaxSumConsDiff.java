package Practice.ArrangeRearrange;

public class MaxSumConsDiff {

	public static void main(String args[]) {
		int ar[] = { 4, 2, 1, 8 };
		int l = ar.length;
		Sort(ar, 0, l);
		int SD = SumDiff(ar);
		System.out.println(SD);
		for (int i = 0; i < l; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	public static int SumDiff(int ar[]) {
		int SD = Math.abs(ar[0] - ar[ar.length - 1]);
		for (int i = 0; i < ar.length - 1; i++) {
			SD = SD + Math.abs(ar[i] - ar[i + 1]);
		}
		return SD;
	}

	public static void Sort(int ar[], int n, int l) {
		if (n < l - 1) {
			int min = ar[n];
			for (int i = n + 1; i < l; i++) {
				if (min > ar[i]) {
					min = ar[i];
				}
			}
			for (int i = 0; i < l; i++) {
				if (ar[i] == min) {
					Swap(ar, n, i);
				}
			}
		}
		if (n < l - 2) {
			int max = ar[n + 1];
			for (int i = n + 2; i < l; i++) {
				if (max < ar[i]) {
					max = ar[i];
				}
			}
			for (int i = 0; i < l; i++) {
				if (ar[i] == max) {
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