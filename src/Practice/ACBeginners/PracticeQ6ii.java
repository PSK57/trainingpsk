package Practice.ACBeginners;

public class PracticeQ6ii {

	public static void main(String args[]) {
		int arr[] = { 35, 10, 34, 76, 5, 4, 23, 79, 12 };
		int a = arr.length;
		int s;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (arr[i] > arr[j] && i < j) {
					s = arr[i];
					arr[i] = arr[j];
					arr[j] = s;
				}
			}
		}
		for (int b = 0; b < a; b++) {
			System.out.print(arr[b] + " ");
		}
	}
}