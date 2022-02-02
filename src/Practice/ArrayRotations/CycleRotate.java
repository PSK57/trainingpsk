package Practice.ArrayRotations;

public class CycleRotate {

	public static void main(String args[]) {
		int ar[] = { 1, 2, 3, 4, 5 };
		for (int i = ar.length - 1; i > 0; i--) {
			Swap(ar, i, i - 1);
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	public static void Swap(int ar[], int i, int j) {
		int s = ar[i];
		ar[i] = ar[j];
		ar[j] = s;
	}
}