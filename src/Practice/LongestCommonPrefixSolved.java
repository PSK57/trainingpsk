package Practice;

public class LongestCommonPrefixSolved {

	public static void main(String args[]) {
		String arr[] = { "Geeksforgeeks", "Geeks", "Geek", "Geezer" };
		int n = arr.length;
		System.out.println(longestCommonPrefix(arr, n));
	}

	public static String longestCommonPrefix(String arr[], int n) {
		if (arr.length == 0)
			return "-1";
		if (arr.length < 2)
			return arr[0];
		String temp = "";
		String s1 = arr[0];
		String s2 = arr[1];
		for (int i = 1; i < arr.length; i++) {
			if (temp.length() == 0) {
				int j = 0;
				int smallLength = s1.length() < s2.length() ? s1.length() : s2.length();
				while (j < smallLength && s1.charAt(j) == s2.charAt(j)) {
					temp += s1.charAt(j);
					j++;
				}
			} else {
				int j = 0;
				s1 = arr[i];
				s2 = new String(temp);
				temp = "";
				int smallLength = s1.length() < s2.length() ? s1.length() : s2.length();
				while (j < smallLength && s1.charAt(j) == s2.charAt(j)) {
					temp += s1.charAt(j);
					j++;
				}
				if (temp.length() == 0) {
					return "-1";
				}
			}
		}
		return temp.length() > 0 ? temp : "-1";
	}
}