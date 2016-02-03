package ca.cmpt213.classDemo.size;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaTest {
	private static final int MAX_NUMBER_PIZZAS = 10000;

	public static void main(String[] args) {
		Pizza pizza = new Pizza(2);
		System.out.println("Area is: " + pizza.calculateArea());
		
//		demoPassByValue();
//		doOrder();
//		demoOrder();
//		testPizzaOrder();
//		demoStrings();
//		demoObject();
		createPizzaFromKeyboard();
//		demoFiles();
		
	}

	private static void demoOrder() {
		PizzaOrder myOrder = new PizzaOrder();
		myOrder.printSizes();
	}

	private static void doOrder() {
		Pizza[] order = new Pizza[MAX_NUMBER_PIZZAS];
		order[0] = new Pizza(10);
//		order[MAX_NUMBER_PIZZAS] = new Pizza(0);
		order[MAX_NUMBER_PIZZAS-1] = new Pizza(0);
		
	}
	
	private static void demoPassByValue() {
		Pizza myPizza = new Pizza(100);
		changePizza(myPizza);
		System.out.println("Modified area is: " + myPizza.calculateArea());
		
		int myFavNum = 42;
		changeNumber(myFavNum);
		System.out.println("Modified number is: " + myFavNum);
	
		int doubledFavNum = actualllyChangeNumber(myFavNum);
		System.out.println("ActuallLy Modified number is: " + doubledFavNum);
	}

	
	private static void changeNumber(int daNum) {
		daNum = 0;
	}
	private static int actualllyChangeNumber(int daNum) {
		daNum *= 2;
		return daNum;
	}

	private static void changePizza(Pizza daPizza) {
		daPizza = new Pizza(5);
		daPizza.setSize(2);
	}
	


	private static void demoObject() {
		Object myPizza = new Pizza(10);
		
		System.out.println("The pizza is: " + myPizza);
	}

	private static void createPizzaFromKeyboard() {
		System.out.println("Please enter the pizza size:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// Option 0: (Runtime error on bad type)
//		int diameter = scanner.nextInt();

		// Option 1:
		int diameter = 0;
		try {
			diameter = scanner.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("I can't accept bad data.");
		}
		
		// Option 2:
//		int diameter = 0;
//		if (scanner.hasNextInt()) {
//			diameter = scanner.nextInt();
//		} else {
//			System.out.println("I can't accept bad data.");			
//		}
		
		Pizza pizza = new Pizza(diameter);
		System.out.println("Your pizza is area: " 
				+ pizza.calculateArea());
		
		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		System.out.print("Enter name: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Hello " + name + " of age " + age);
		
		// Don't close a scanner built from System.in 
		//(stream must remain open for later keyboard scanners in program)
		scanner.close();

		scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		scanner.nextLine();
		name = scanner.nextLine();
		System.out.println("Your name is: " + name);
		
		// Don't close a scanner built from System.in 
		//(stream must remain open for later keyboard scanners in program)
		scanner.close();
	}

	
	
//	private static void demoFiles() {
//		Pizza pizza = new Pizza(42);
//		File file = new File("C:\\t\\pizza.txt");
//		try {
//			pizza.writeToFile(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
	public static Pizza makePizzaFromFile(File file) throws Exception {
		Scanner scanner = null;
		Pizza newPizza = null;
		try {
			scanner = new Scanner(file);
			if (scanner.hasNextDouble()) {
				int readDiameter = scanner.nextInt();
				newPizza = new Pizza(readDiameter);
			} else {
				// Should create custom Exception type instead..
				throw new Exception("Invalid file format.");
			}
			
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		return newPizza;
	}
	
	
	private static void testPizzaOrder() {
		PizzaOrder order = new PizzaOrder();
		order.printSizes();
	}

	
	
	
}
