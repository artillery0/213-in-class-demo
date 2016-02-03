
public class DuckExample {
	public static void main(String[] args) {
		displayDuck(new Duck());
		displayDuck(new ScroogeMcDuck());
	}
	private static void displayDuck(Duck duck) {
		System.out.println("Class: " + duck.getClass());
		duck.swim();
		duck.migrateSouth();
		duck.migrateSouth("Hello");
	}

}
