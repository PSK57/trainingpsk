package Basics.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		// List<Integer> numbers = Arrays.asList(3,4,5,6,7,8,9,4,9);
		List<Integer> num = Arrays.asList(1, 9, 2, 8, 3, 7, 4, 6, 5);
		Random rand = new Random();
		List<Integer> filter = num.stream().filter(i -> i == num.get(rand.nextInt(num.size())))
				.collect(Collectors.toList());

		System.out.println("size of array : " + num.size());
		System.out.println("Random Number from array : " + filter);
		System.out.println("Random Number size : " + filter.size());
	}
}