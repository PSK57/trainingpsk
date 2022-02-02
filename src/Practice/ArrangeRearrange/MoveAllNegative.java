package Practice.ArrangeRearrange;

public class MoveAllNegative {

	public static void main(String args[]) {
		int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
		int arr2[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				arr2[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr2[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}