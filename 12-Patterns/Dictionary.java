import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Dictionary implements Iterable<String>{
	private List<String> words = new ArrayList<String>();

	public void addWord(String word) {
		words.add(word);
	}
	
	@Override
	public Iterator<String> iterator() {
		return Collections.unmodifiableCollection(words).iterator();
	}
	
	
	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		dict.addWord("Hello");
		dict.addWord("World!");
		
		for (String word : dict) {
			System.out.println("Word: " + word);
		}
	}
}
