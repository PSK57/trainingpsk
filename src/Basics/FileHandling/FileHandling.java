package Basics.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String args[]) throws IOException {
		File f = new File("PSK");
		f.createNewFile();

		FileWriter f2 = new FileWriter("PSK");
		f2.write("Hello, I am Sanjeet. Welcome to my File. ");
		f2.close();

		if (f.exists()) {
			// Getting file name
			System.out.println("The name of the file is : " + f.getName());
			// Getting path of the file
			System.out.println("The absolute path of the file is : " + f.getAbsolutePath());
			// Checking whether the file is writable or not
			System.out.println("Is file writeable? : " + f.canWrite());
			// Checking whether the file is readable or not
			System.out.println("Is file readable : " + f.canRead());
			// Getting the length of the file in bytes
			System.out.println("The size of the file in bytes is : " + f.length());
		} else {
			System.out.println("The file does not exist.");
		}

		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line + "File Name : " + f.getName() + ". ");
		}
		sc.close();

		/*
		 * if(f.delete()){ System.out.println("Your file " + f.getName() +
		 * " is successfully deleted."); } else {
		 * System.out.println("Some problems occured. Can't delete your file."); }
		 */
	}
}