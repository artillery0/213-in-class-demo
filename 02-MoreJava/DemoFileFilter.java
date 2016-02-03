package ca.cmpt213.as1content;

import java.io.File;
import java.io.FileFilter;

/**
 * Demo how to filter files using either a full class, 
 * an inner class, and an anonymous inner class.
 * @author Brian Fraser
 *
 */
public class DemoFileFilter {
	public static void main(String[] args) {
		demoClassFilter();
		demoInnerFilter();
		demoAnonFilter();
	}

	// Filter using a full external class.
	private static void demoClassFilter() {
		FileFilter filter = new TxtFilter();
		findAndDumpFiles(filter, "Class Filter");
	}

	private static void findAndDumpFiles(FileFilter filter, String description) {
		// Use the filter (with callback) 
		File folder = new File("C:\\t\\");
		File[] fileList = folder.listFiles(filter);

		// Dump files found
		System.out.println(description + ": " + folder.getAbsolutePath());
		for (File subFile : fileList) {
			System.out.println("  file: " + subFile.getAbsolutePath());
		}
	}
	
	
	
	
	
	private static void demoInnerFilter() {
		// Create the inner class file filter.
		class DerInnerFilter implements FileFilter {
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".txt");
			}	
		}
		
		// Instantiate the inner class
		FileFilter filter = new DerInnerFilter();

		findAndDumpFiles(filter, "Inner Class Filter");
	}
	
	
	
	private static void demoAnonFilter() {
		// Create the filter (an anonymous class)
		FileFilter filter = new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".txt");
			}
			
		};

		findAndDumpFiles(filter, "Anon Class Filter");
	}
}
