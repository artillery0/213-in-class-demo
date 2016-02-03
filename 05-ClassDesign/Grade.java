import java.util.Date;
import java.util.ArrayList;


/**
 * Test final keyword
 * @author Brian Fraser
 *
 */
public class Grade {
	public final int MAXIMUM_PERCENTAGE = 100;
	private final ArrayList<Person> list;
	public Grade() {
		list = new ArrayList<Person>();
	}
	//...
	public void doSomething() {
		// Which of the following lines fail?
		// a: Read constant to variable & change?
		int w = MAXIMUM_PERCENTAGE;
		w++;

		// b: Change constant?
		//MAXIMUM_PERCENTAGE = 50;
		
		// c: Change which object?
		//list = new ArrayList<Person>();

		// d: Access from object?
		int x = list.size();
		x++;

		// e: Change object's state?
		list.add(new Person(new Date()));	
	}

	private class Car {
		final private String MAKE = "PORCHE";
	}
	private class Truck {
		final private String MAKE;
		public Truck() {
			MAKE = "Ford";
		}
	}
}

