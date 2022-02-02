package Practice.ACBeginners;

public class PracticeQ7i {

	public static void main(String args[]) {
		int arr[] = { 12, 4, 6, 7, 8, 5, 3, 21, 89, 67, 34, 56, 71, 2, 7, 54 };
		int key = 71;
		System.out.print(key + " is at " + ind(arr, key) + "th Index.");
	}

	public static int ind(int arr[], int i) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				return j;
			}
		}
		return -1;
	}
}