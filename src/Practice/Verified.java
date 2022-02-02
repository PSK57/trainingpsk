package Practice;

import java.io.*;
import java.util.*;

public class Verified {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split(" ")));
			String ar[] = new String[arr.size()];
			if (N == arr.size()) {
				for (int i = 0; i < arr.size(); i++) {
					int k = 0;
					for (int j = i + 1; j < arr.size(); j++) {
						if (arr.get(i).equals(arr.get(j))) {
							++k;
							String str2 = arr.get(j) + k;
							arr.remove(j);
							arr.add(j, str2);
							ar[j] = str2;
						}
					}
				}
				for (int i = 0; i < ar.length; i++) {
					if (ar[i] == null) {
						ar[i] = "Verified";
					}
				}
				for (int i = 0; i < ar.length; i++) {
					System.out.print(ar[i] + " ");
				}
			}
		}
		sc.close();
	}
}