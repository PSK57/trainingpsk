package Practice;

import java.io.*;
import java.util.*;

public class GeeksForGeeksNewSystem {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			String str = br.readLine();
			ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split(" ")));
			if (N == arr.size()) {
				for (int i = 0; i < arr.size(); i++) {
					if (map.containsKey(arr.get(i))) {
						int a = map.get(arr.get(i));
						a++;
						System.out.print(arr.get(i) + a + " ");
						map.replace(arr.get(i), a);
					} else {
						System.out.print("Verified ");
						map.put(arr.get(i), 0);
					}
				}
			}
			System.out.println();
		}
	}
}

/*	Output Values :-
*	1
*	6
*	abc aba abc aba aab abc
*/