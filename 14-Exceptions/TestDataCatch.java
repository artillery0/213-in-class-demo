import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class TestDataCatch {
	// -----------------------------------------------------------------
	// Creates a file of test data that consists of ten lines each
	// containing ten integer values in the range 10 to 99.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		final int MAX = 10;

		int value;
		String file = "test.dat";

		Random rand = new Random();

		FileWriter fw;
		try {
			// May throw exception.
			fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outFile = new PrintWriter(bw);

			for (int line = 1; line <= MAX; line++) {
				for (int num = 1; num <= MAX; num++) {
					value = rand.nextInt(90) + 10;
					outFile.print(value + "   ");
				}
				outFile.println();
			}

			outFile.close();
			System.out.println("Output file has been created: " + file);
		} catch (IOException e) {
			System.out.println("Error opening file:");
			e.printStackTrace();
		}

	}
}
