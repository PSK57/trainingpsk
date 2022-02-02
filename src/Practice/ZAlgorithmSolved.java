package Practice;

import java.util.ArrayList;

public class ZAlgorithmSolved {

	public static void main(String args[]) {
		String S = "aaaaaaaaaaaaaaaaaaaa";
		String pat = "aa";
		StringBuilder str = new StringBuilder(pat);
		str.append("$");
		str.append(S);

		int left = 0, right = 0, n = str.length();
		int store[] = new int[n];
		for (int k = 1; k < n; k++) {
			if (k > right) {
				right = k;
				left = k;
				while (right < n && str.charAt(right) == str.charAt(right - left))
					right++;
				store[k] = right - left;
				right--;
			}
			else {
				int k1 = k - left;
				if (store[k1] < right - k + 1)
					store[k] = store[k1];
				else {
					left = k;
					while (right < n && str.charAt(right) == str.charAt(right - left))
						right++;
					store[k] = right - left;
					right--;
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			if (store[i] == pat.length())
				ans.add(i - pat.length());
		System.out.println(ans);
	}
}