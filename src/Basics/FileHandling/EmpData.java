package Basics.FileHandling;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class EmpData {

	public static void main(String args[]) throws IOException {

		File F = new File("Demo Emp Data");
		F.createNewFile();

		FileWriter f2 = new FileWriter(F);
		f2.write("1234 Anurag HDFC123 123456789 INDIA 20000 12-12-2021\r\n"
				+ "1235 Sanjeet AXIS456 987654321 INDIA 20000 12-12-2021\r\n"
				+ "1236 Akansha AXIS789 456123789 INDIA 30000 12-12-2021\r\n");
		f2.close();

		int sum = 0;
		Scanner sc = new Scanner(F);
		List<String> list3 = new ArrayList<>();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			List<String> list = new ArrayList<>(Arrays.asList(line.split(" ")));
			String a = list.get(5);
			list3.add(a);
			System.out.println(line);
		}
		sc.close();

		List<Integer> list2 = list3.stream().map(Integer::parseInt).collect(Collectors.toList());
		for (int i = 0; i < list2.size(); i++) {
			sum = sum + list2.get(i);
		}

		System.out.println("\nTotal Amount Paid by " + F.getName() + " : Rs. " + sum + "/- only");
	}
}