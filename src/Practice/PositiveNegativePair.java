package Practice;

import java.util.*;

public class PositiveNegativePair {

	public static void main(String args[]) {
		int n = 8;
		int arr[] = { 3, 6, -2, -1, 1, -3, 2, 7 };
		ArrayList<Integer> al = new ArrayList<>();
		Map<Integer, Integer> tm = new TreeMap<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			al.add(arr[i]);
		}
		System.out.println(al);
		for (int i = 0; i < n; i++) {
			if (al.contains(-al.get(i)) && !tm.containsKey(al.indexOf(al.get(i)))) {
				int m = al.indexOf(-al.get(i));
				if (al.get(i) > 0) {
					tm.put(m, al.get(i));
				} else if (al.get(i) < 0) {
					tm.put(m, -al.get(i));
				}
			}
		}
		System.out.println(tm);
		for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
			System.out.print(-entry.getValue() + " " + entry.getValue() + " ");
		}
		System.out.println();
		for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
		    al2.add(-entry.getValue());
		    al2.add(entry.getValue());
		}
		System.out.println(al2);
	}
}