


/**
 * Demonstrate how to clean up exception handling.
 */
public class CleanTryCatch {
	public static void main(String[] args) {
		CleanTryCatch demo = new CleanTryCatch();
		demo.tryComputeAnswer("10", "50");
		demo.computeAnswerInOne("10", "50");
	}
	
	/*
	 * Exception handling mixed with logic.
	 */
		
	// Extract the file but letting exceptions propagate.
	void computeAnswerInOne(String numStr1, String numStr2) {
		
		int num1, num2;
		try {
			num1 = Integer.parseInt(numStr1);
			num2 = Integer.parseInt(numStr2);
		} catch(NumberFormatException exception) {
			System.out.println("The inputs must be integers.");
			return;
		}

		float answer;
		try {
			answer = calculateQuotient(num1, num2);
		} catch(IllegalArgumentException exception) {
			String message = exception.getMessage();
			System.out.println(message);
			return;
		}
		System.out.println("Answer: " + answer);
	}	

	
	/*
	 * Clean Approach: split try-catch into its own function.
	 */
	
	// Handle all expected exceptions.
	void tryComputeAnswer(String numStr1, String numStr2) {
		try {
			float answer = computeAnswer(numStr1, numStr2);
			System.out.println("Answer: " + answer);
		} catch(NumberFormatException exception) {
			System.out.println("The inputs must be integers.");
		} catch(IllegalArgumentException exception) {
			String message = exception.getMessage();
			System.out.println(message);
		}
	}
	
	// Compute the answer but let all exceptions propagate.
	float computeAnswer(String numStr1, String numStr2) {
		
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		
		float answer = calculateQuotient(num1, num2);
		return answer;		
	}
	
	private float calculateQuotient(int num1, int num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Divisor must be non zero.");
		}
		return (float) num1 / num2;
	}
}
