package trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoTryWithResources {

	public static void main(String[] args) {
		try {
			readNumberFromFile_2("this_file_does_not_exist.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Doh! Seems not to have worked, eh!");
			e.printStackTrace();
		}
	}

	/**
	 * Read a number form a file with standard try-finally
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public static void readNumberFromFile_1(String fileName) 
			throws FileNotFoundException {
		Scanner scanner = null;
		File file = new File(fileName);

		try {
			scanner = new Scanner(file);
			if (scanner.hasNextInt()) {
				int num = scanner.nextInt();
				System.out.println("Read in # " + num);
			}
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	
	/**
	 * Read a number from a file using try-with-resources.
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public static void readNumberFromFile_2(String fileName) 
			throws FileNotFoundException {
		File file = new File(fileName);

		// Try-with-resources automatically closes the scanner.
		// (Scanner must support the AutoClosable interface, which it does).
		try (Scanner scanner = new Scanner(file)){
			if (scanner.hasNextInt()) {
				int num = scanner.nextInt();
				System.out.println("Read in # " + num);
			}
		}
	}
}
