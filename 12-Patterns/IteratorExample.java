import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class IteratorExample {
	public static void main(String[] args) {
		demoIterator();
	}


	private static void demoIterator() {
		List<String> words = new LinkedList<String>();
		words.add("Hello");
		words.add("world");
		words.add("today!");
		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String word = iterator.next();
			System.out.println("Word: " + word);
		}		
	}

}
