import java.util.Iterator;


public class CarManager {
	public class Car {}

	private Car[] cars = new Car[10];

	public Iterator<Car> iterator() {
		return new Iterator<Car>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				return index < cars.length;
			}

			@Override
			public Car next() {
				assert hasNext();
				return cars[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}


	public static void main(String[] args) {
		CarManager manager = new CarManager();
		Iterator<CarManager.Car> iterator = manager.iterator();
		while (iterator.hasNext()) {
			CarManager.Car car = iterator.next();
			System.out.println("Car: " + car);
		}

	}

}