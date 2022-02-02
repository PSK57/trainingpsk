package Basics.FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileOperationwithWriter {

	public static void main(String[] args) {
		int ch;
		try {
			FileWriter fwrite = new FileWriter("D:FileOperationExample.txt");

			// writing the content into the FileOperationExample.txt file
			fwrite.write("A named location used to store related information is referred to as a File.");

			// Closing the stream
			fwrite.close();

			FileReader readfl = new FileReader("D:FileOperationExample.txt");
			BufferedReader br = new BufferedReader(readfl); // creates a buffering character input stream
			StringBuffer sb = new StringBuffer(); // constructs a string buffer with no characters
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line); // appends line to string buffer
				sb.append("\n"); // line feed
			}
			System.out.println("Printing with reader " + sb.toString());
			while ((ch = readfl.read()) != -1) {
				System.out.println("Reading file " + (char) ch);
			}
			System.out.println("Content is successfully wrote to the file.");
			FileOperationwithWriter obj = new FileOperationwithWriter();
			obj.file_operation();
			br.close();
		} catch (IOException e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
		}
	}

	public void scannerfileprocessing() {
		try {
			// Create f1 object of the file to read data
			File f1 = new File("D:FileOperationExample.txt");
			Scanner dataReader = new Scanner(f1);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("Unexcpected error occurred!");
			exception.printStackTrace();
		}
	}

	public void file_operation() throws IOException {
		File f1 = new File("D:FileOperationExamplenext.txt");
		int ch;
		try {
			FileOutputStream fwrite = new FileOutputStream(f1);
			String str = "File Handling in Java using " + " FileWriter and FileReader";
			for (int i = 0; i < str.length(); i++) {
				fwrite.write(str.charAt(i));
			}
			FileInputStream fsi = new FileInputStream(f1);
			while ((ch = fsi.read()) != -1) {
				System.out.println("Inside with oputputStream" + (char) ch);
			}
			fwrite.close();
			fsi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}