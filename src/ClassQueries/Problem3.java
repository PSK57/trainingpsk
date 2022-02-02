package ClassQueries;

public class Problem3 {
	public static void main(String args[]) {
		int arr[] = { 399, 400, 201, 50, 60, 80, 800, 1700, 210, 429, 500 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
}