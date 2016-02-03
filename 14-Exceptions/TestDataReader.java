import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestDataReader {
	public static void main(String[] args) throws IOException {

		String fileName = "test.dat";

		FileReader fr = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(fr);
		String text = null;

		// Repeat until all lines are read
		while ((text = reader.readLine()) != null) {
			System.out.println(text);
		}

		// Close the file
		reader.close();

		System.out.println("Done reading file: " + fileName);
	}
}
