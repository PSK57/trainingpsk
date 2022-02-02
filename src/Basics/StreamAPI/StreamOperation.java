package Basics.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperation {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 8, 9, 4, 9);

		List<String> strnames = Arrays.asList("Anurag", "Sneha", "Akshay", "Shreya", "Bindu");

		// Stream<Integer> strm = numbers.stream();

		// Stream<Integer> strm1 = strm.distinct();

		// Collectors.tolist();

		System.out.println(numbers.stream().map(i -> i * i).collect(Collectors.toList()));

		// List<String> filteredList =
		// strnames.parallelStream().filter(str->str.startsWith("A")).collect(Collectors.toList());

		Boolean flag = strnames.parallelStream().anyMatch(str -> str.contains("Aashish"));

		System.out.println(flag);

		// System.out.println(strm1.collect(Collectors.toList()));

	}
}