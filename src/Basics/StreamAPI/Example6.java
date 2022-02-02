package Basics.StreamAPI;

import java.util.*;

public class Example6 {

	public static void main(String args[]) {
		List<String> L1 = Arrays.asList("Sanjeet", "Anurag", "Sai Ram", "Nikhil");
		long L2 = L1.stream().filter(i -> i.equalsIgnoreCase("sanjeet")).count();
		System.out.println(L2);
	}
}