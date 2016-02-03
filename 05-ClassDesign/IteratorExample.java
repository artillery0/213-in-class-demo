import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;


public class IteratorExample {
	public static void main(String[] arg) {
		
		Date now = new Date();
		System.out.println(now);
		LinkedList<String> data = createData(10);
		displayWithLoop(data);
		displayWithIterator(data);
		displayWithForEach(data);
	}

	private static LinkedList<String> createData(int size) {
		LinkedList<String> result = new LinkedList<String>();
		for (int i=0; i < size; i++) {
			result.add("Value " + i);
		}
		return result;
	}

	private static void displayWithLoop(LinkedList<String> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.printf("%d = %s%n", i, array.get(i));
		}
	}

	private static void displayWithIterator(LinkedList<String> array) {
		Iterator<String> itr = array.iterator();
		while (itr.hasNext()) {
			System.out.printf("%s%n", itr.next());			
		}
	}
	
	private static void displayWithForEach(LinkedList<String> data) {
		for (String text : data) {
			System.out.printf("%s%n", text);
		}
	}
}
