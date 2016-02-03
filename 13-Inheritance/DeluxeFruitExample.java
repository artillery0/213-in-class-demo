package ca.cmpt213.fruit;

public class DeluxeFruitExample {
	public static class Fruit {
		private String type;

		public Fruit(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}

		public String toString() {
			return getType() + " are great!";
		}
	}

	public static class DeluxeFruit extends Fruit {
		public DeluxeFruit(String type) {
			super(type);
		}

		@Override
		public String getType() {
			return "Deluxe " + super.getType();
		}
	}

	
	/**
	 * Main()
	 */
	public static void main(String[] args) {
		Fruit apple = new Fruit("Apple");
		display(apple);

		Fruit deluxApple = new DeluxeFruit("Apple");
		display(deluxApple);

	}

	private static void display(Fruit fruit) {
		System.out.println("Class: " + fruit.getClass());
		System.out.println("Type:  " + fruit.getType());
	}
	
	
	public class Pet {
		private String name;
	}
	public class PetRock extends Pet {
		private String name;
	}

}
