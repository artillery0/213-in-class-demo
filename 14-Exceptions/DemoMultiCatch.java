package trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoMultiCatch {

	public static void main(String[] args) {
		DemoMultiCatch demo = new DemoMultiCatch();
		File file = new File("this_file_does_not_exist.txt");
		demo.readNumber_1(file);
		demo.readNumber_2(file);
	}


	
	// Handle multiple exceptions in separate blocks.
	void readNumber_1(File file) {
		try (Scanner scanner = new Scanner(file)){
			String str = scanner.next();
			int value = Integer.parseInt(str);
			System.out.println("Read in # " + value);
		} catch(FileNotFoundException e) {
			System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");
		} catch(NumberFormatException e) {
			System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");
		}
	}

	// Handle multiple exceptions with multi-catch.
	void readNumber_2(File file) {		
		try (Scanner scanner = new Scanner(file)){
			String str = scanner.next();
			int value = Integer.parseInt(str);
			System.out.println("Read in # " + value);
		} catch(FileNotFoundException | NumberFormatException e) {
			System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");
		}
	}
}
