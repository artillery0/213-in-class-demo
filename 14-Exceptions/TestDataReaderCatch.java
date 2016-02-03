import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestDataReaderCatch {
	public static void main(String[] args) {

		String fileName = "test.dat3";
		long linesRead = 0;

		// Declare the reader outside of try so we can use
		// it in 'finally' if required.
		BufferedReader reader = null;

		try {
			// Can throw FileNotFoundException
			FileReader fr = new FileReader(fileName);
			reader = new BufferedReader(fr);
			String text = null;

			// Repeat until all lines are read
			// Note that reader.readLine() can throw IOException
			while ((text = reader.readLine()) != null) {
				linesRead++;
				System.out.println(text);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Ensure we safely close the file.
			try {
				if (reader != null) {
					// Can throw IOException.
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Done reading " + linesRead + " lines.");
	}
}
