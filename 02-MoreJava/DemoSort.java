package ca.cmpt213.as1content;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * Demo sorting using a comparator.
 * @author Brian Fraser
 *
 */
public class DemoSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create the data
		ArrayList<Car> cars = new ArrayList<Car>();
		populateCars(cars);
		displayCars(cars);

		// Sort on Year
		System.out.println();
		System.out.println("Sorting by Year.");
		sortCarsByYear(cars);
		displayCars(cars);
		
		// Sort on Make
		System.out.println();
		System.out.println("Sorting by Make.");
		sortCarsByMake(cars);
		displayCars(cars);
	}

	private static void populateCars(ArrayList<Car> cars) {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			String model = "Car " + i; 
			int year = Math.abs(rand.nextInt()) % 100 + 1900;
			Car car = new Car(model, year);
			cars.add(car);
		}
	}

	private static void displayCars(ArrayList<Car> cars) {
		System.out.println();
		System.out.println("List of cars: ");
		for (Car car : cars) {
			System.out.println(car);
		}
	}

	private static void sortCarsByYear(ArrayList<Car> cars) {
		Comparator<Car> yearSorter = new Comparator<Car>() {
			@Override
			public int compare(Car car1, Car car2) {
				// REVISIT: How could we improve this code?
				// Hint: use Math.signum()
				if (car1.getYear() < car2.getYear()) {
					return -1;
				} else if (car1.getYear() == car2.getYear()) {
					return 0;
				} else {
					return 1;
				}
			}
		};
		
		java.util.Collections.sort(cars, yearSorter);
	}
	
	

	private static void sortCarsByMake(ArrayList<Car> cars) {
		Comparator<Car> makeSorter = new Comparator<Car>() {
			@Override
			public int compare(Car car1, Car car2) {
				return car1.getMake().compareTo(car2.getMake());
			}
		};
		
		java.util.Collections.sort(cars, makeSorter);
	}
}



