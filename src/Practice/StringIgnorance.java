package Practice;

import java.util.Scanner;

public class StringIgnorance {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String res;
		sc.nextLine();
		while(N>0) {
			String s = sc.nextLine();
			res = operation(s);
			System.out.println(res);
			N--;
		}
		sc.close();
	}
	
	public static String operation(String s) {
		String str = s;
		int i = 0;
		while(i<str.length()) {
			char ch = str.charAt(i);
			int low = str.indexOf(String.valueOf(ch).toLowerCase(), i+1);
			int upp = str.indexOf(String.valueOf(ch).toUpperCase(), i+1);
			int del;
			if(low==-1&&upp==-1) {del=-1;}
			else if(low==-1&&upp!=-1) {del=upp;}
			else if(low!=-1&&upp==-1) {del=low;}
			else {del = upp>=low?low:upp;}
			if(del>=0) {str = charRemoval(str,del);}
			i++;
		}
		return str;
	}
	
	public static String charRemoval(String str, int del) {
		return str.substring(0, del)+str.substring(del+1);
	}
}