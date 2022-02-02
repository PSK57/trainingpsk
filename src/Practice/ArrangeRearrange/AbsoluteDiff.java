package Practice.ArrangeRearrange;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AbsoluteDiff {

	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		int arr[] = { 10, 5, 3, 9, 2 };
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int arr3[] = new int[arr.length];
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> arr2 = new ArrayList<>();
			int a = Math.abs(arr[i] - inp);
			for (int j = 0; j < arr.length; j++) {
				if ((Math.abs(arr[j] - inp)) == a) {
					arr2.add(arr[j]);
				}
			}
			if (map.containsKey(a)) {
				map.replace(a, arr2);
			} else {
				map.put(a, arr2);
			}
		}
		int index = 0;
		for (Map.Entry entry : map.entrySet()) {
			ArrayList<Integer> arr2 = map.get(entry.getKey());
			for (int i = 0; i < arr2.size(); i++) {
				arr3[index++] = arr2.get(i);
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		sc.close();
	}
}