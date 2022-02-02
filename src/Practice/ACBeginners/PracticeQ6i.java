package Practice.ACBeginners;

public class PracticeQ6i {

	public static void main(String args[]) {
		int arr[] = { 35, 10, 34, 76, 5, 4, 23, 79, 12 };
		int a = arr.length;
		for (int k = a - 1; k >= 0; k--) {
			for (int i = 0; i < a - 1; i++) {
				m1(arr, i);
			}
		}
		for (int j = 0; j < a; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public static void m1(int arr[], int i) {
		int s;
		if (arr[i] > arr[i + 1]) {
			s = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = s;
		}
	}
}