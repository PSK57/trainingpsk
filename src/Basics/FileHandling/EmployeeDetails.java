package Basics.FileHandling;

import java.io.*;
import java.util.*;

public class EmployeeDetails {

	public static void main(String args[]) throws IOException {
		File F = new File("Capgemini");
		F.createNewFile();

		HashMap<Integer, ArrayList<Object>> input = new HashMap<>();
		Scanner inp = new Scanner(System.in);
		System.out.println("Number of Employees : ");
		int N = inp.nextInt();
		int sum = 0;
		for (int j = 0; j < N; j++) {

			ArrayList<Object> arr = new ArrayList<>();

			System.out.println("Employee ID of Employee No. " + (j + 1) + ": ");
			int i = inp.nextInt();

			if (input.containsKey(i) == false) {

				System.out.println("Employee Name of Employee No. " + (j + 1) + ": ");
				inp.nextLine();
				String empname = inp.nextLine();
				arr.add(empname);

				System.out.println("IFSC Code of the Bank of Employee No. " + (j + 1) + ": ");
				String ifsc = inp.nextLine();
				arr.add(ifsc);

				System.out.println("Account Number of the Bank Account of Employee No. " + (j + 1) + ": ");
				int accno = inp.nextInt();
				arr.add(accno);

				System.out.println("Country of Employee No. " + (j + 1) + ": ");
				inp.nextLine();
				String coun = inp.nextLine();
				arr.add(coun);

				System.out.println("Payment of Employee No. " + (j + 1) + ": ");
				int amount = inp.nextInt();
				arr.add(amount);

				System.out.println("Date of Payment for Employee No. " + (j + 1) + ": ");
				inp.nextLine();
				String date = inp.nextLine();
				arr.add(date);

				input.put(i, arr);
			} else {
				System.out.println("Error... Same Input.");
			}
		}

		BufferedWriter bf = new BufferedWriter(new FileWriter(F));

		for (Map.Entry<Integer, ArrayList<Object>> entry : input.entrySet()) {
			bf.write(entry.getKey() + ":" + entry.getValue());
			bf.newLine();
		}
		bf.flush();

		Scanner sc = new Scanner(F);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();

		bf.close();
		inp.close();

		System.out.println("\nTotal Amount Paid by " + F.getName() + " : Rs. " + sum + "/- only");
	}
}