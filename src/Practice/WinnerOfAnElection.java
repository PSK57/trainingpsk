package Practice;

import java.io.*;
import java.util.*;

public class WinnerOfAnElection {

	public static void main(String args[]) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int N = Integer.parseInt(br.readLine());
			String str = br.readLine();
			int x = 0;
			HashMap<Integer, TreeSet<String>> data = new HashMap<>();
			ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split(" ")));
			if (arr.indexOf("") != -1) {
				arr.remove(arr.indexOf(""));
			}
			if (N == arr.size()) {
				for (int i = 0; i < arr.size(); i++) {
					TreeSet<String> values = new TreeSet<>();
					int k = 0;
					for (int j = i + 1; j < arr.size(); j++) {
						if (arr.get(i).equals(arr.get(j))) {
							k++;
							arr.remove(j);
							j--;
						}
					}
					if (data.containsKey(k)) {
						data.get(k).add(arr.get(i));
						data.replace(k, data.get(k));
					} else {
						values.add(arr.get(i));
						data.put(k, values);
					}
					x = x < k ? k : x;
				}
				Iterator<String> it = data.get(x).iterator();
				System.out.println(it.next() + " ");
			}
		}
	}
}