package Basics.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Example5 {

	public static void main(String[] args) {
		// map is using when we have to give some function
		List<Integer> l2 = Arrays.asList(8, 9, 4, 5, 7, 2, 3, 6, 1, 10);
		List<Integer> l3 = l2.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(l3);

		// sorted
		List<Integer> sorted = l2.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);

		// min
		Integer min = l2.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("Min Value : " + min);

		// max
		Integer max = l2.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("Max Value : " + max);
	}
}