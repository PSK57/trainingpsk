package Practice;

import java.util.ArrayList;

public class LongestCommonPrefix {

	public static void main(String args[]) {
		String arr[] = { "Geeksforgeeks", "Geeks", "Geek", "Geezer" };
		int n = arr.length;
		System.out.println(longestCommonPrefix(arr, n));
	}

	public static String longestCommonPrefix(String arr[], int n) {
		String str = "";
		ArrayList<String> arr2 = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			String str1 = arr[i];
			String str2 = arr[i + 1];
			int l = str1.length() <= str2.length() ? str1.length() : str2.length();
			for (int j = 0; j < l; j++) {
				char ch1 = str1.charAt(j);
				char ch2 = str2.charAt(j);
				if (ch1 != ch2) {
					if (j == 0) {
						str = "-1";
						break;
					}
					str = str1.substring(0, j);
					break;
				} else {
					if (l == 1) {
						str = str1.length() <= str2.length() ? str1 : str2;
					} else {
						if (str1.length() < str2.length()) {
							str = str2.substring(0, j);
						} else {
							str = str1.substring(0, j);
						}
					}
				}
			}
			arr2.add(str);
		}
		if (arr2.indexOf("-1") != -1) {
			return "-1";
		}
		String s = arr2.get(0);
		int len = s.length();
		for (int i = 1; i < arr2.size(); i++) {
			if (arr2.get(i).length() < len) {
				len = arr2.get(i).length();
				s = arr2.get(i);
			}
		}
		return s;
	}
}