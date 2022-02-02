package Basics.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Integer> L1 = new ArrayList<>();
		L1.add(14);
		L1.add(74);
		L1.add(26);
		L1.add(34);
		L1.add(98);
		L1.add(67);

		long PM = L1.stream().filter(m -> m < 35).count();
		List<Integer> L2 = L1.stream().filter(m -> m < 35).collect(Collectors.toList());

		System.out.println("Count of Failed Subject/s  :  " + PM);
		System.out.println("Marks of failed subject  :  " + L2);
	}
}