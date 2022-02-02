package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Geekonacci {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++){
			ArrayList<Integer> arr = new ArrayList<>();
		    for(int j=0;j<3;j++){
		        int inp = sc.nextInt();
		        arr.add(inp);
		    }
		    int inp2 = sc.nextInt();
		    for(int j=3;j<inp2;j++){
		        int sum = arr.get(j-3)+arr.get(j-2)+arr.get(j-1);
		        arr.add(sum);
		    }
		    System.out.println(arr);
		    System.out.println(arr.get(inp2-1));
		}
		sc.close();
	}
}