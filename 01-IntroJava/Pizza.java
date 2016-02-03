package ca.cmpt213.classDemo.size;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Pizza {
	private static final int SQUARED = 2;
	private int diameter = 0;
	public Pizza(int diameter) {
		this.diameter = diameter;
	}
	
	public double calculateArea() {
		double radius = (double)diameter/2;
		double area = Math.PI * Math.pow(radius, SQUARED);
		return area;
	}
	
	public void setSize(int diameter) {
		this.diameter = diameter;
	}

	// OVERRIDES!
	@Override
	public String toString() {
		return getClass().getName() 
				+ " [diameter=" + diameter + "]";
	}

	public void writeToFile(File file) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(file);
		writer.println(diameter);
		writer.close();
	}

	public static Pizza makePizzaFromFile(File file) throws Exception {
		Scanner scanner = null;
		Pizza newPizza = null;
		try {
			scanner = new Scanner(file);
			if (scanner.hasNextDouble()) {
				int readDiameter = scanner.nextInt();
				newPizza = new Pizza(readDiameter);
			} else {
				// Should create custom type!
				throw new Exception("Invalid file format.");
			}
			
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		return newPizza;
	}

	
	
}
