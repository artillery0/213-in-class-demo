/**
 * Exception class for a value being outside of the allowable range.
 */
class FailingException extends Exception {
	FailingException(String message) {
		super(message);
	}
}

/**
 * Simple program to show how exceptions or return values can be used for
 * program design.
 * 
 * @author Dr. B. Fraser
 * 
 */
public class ExceptionVsReturn {

	/**
	 * Check if the input percentage is a passing grade:
	 * 
	 * @param percent
	 *            The percentage to check.
	 * @return true if percent is between 50.0 and 100.0 inclusive.
	 */
	static boolean isPassingPercent(double percent) {
		return (percent >= 50.0) && (percent <= 100.0);
	}

	static void checkPassingPercent(double percent) throws FailingException {
		if ((percent < 50.0) || (percent > 100.0)) {
			FailingException bad = new FailingException("Invalid percentage.");
			throw bad;
		}
	}

	/**
	 * Return the letter grade for a percent.
	 * 
	 * @param percent
	 *            The percentage to check
	 * @return A letter grade, as a character.
	 * @throws FailingException
	 *             If percent is not a passing grade.
	 */
	static char getPassingGrade(double percent) throws FailingException {
		char retMe = '?';

		// Check if it's out of range.
		if ((percent < 50.0) || (percent > 100.0)) {
			FailingException bad = new FailingException("Invalid percentage.");
			throw bad;
		}
		// Check each of the grade ranges:
		else if (percent >= 80.0) {
			retMe = 'A';
		} else if (percent >= 70.0) {
			retMe = 'B';
		} else if (percent > 60.0) {
			retMe = 'C';
		} else {
			retMe = 'D';
		}
		return retMe;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double checkMe = 30.0;

		// Demonstration with a return type:
		System.out.println("---- Using return value ----");
		boolean isOK1 = isPassingPercent(checkMe);
		System.out.println("Value = " + checkMe + "\tReturned: " + isOK1);
		if (isOK1) {
			System.out.println("Congratulations! You passed Methods 101!");
		}

		// Demonstration with an exception.
		System.out.println("---- Using exception ----");
		try {
			checkPassingPercent(checkMe);
			System.out.println("Congratulations! You passed Exceptions 101!");
		} catch (FailingException range) {
			System.out.println("Must not be a good: " + range.getMessage());
		}

		// Demonstration with returning a value and using exceptions.
		System.out.println("---- Return with possible exception ----");
		try {
			char grade = getPassingGrade(checkMe);
			System.out.println(checkMe + "% gives a grade of " + grade);
		} catch (FailingException range) {
			System.out.println("Must not be a good: " + range.getMessage());
		}

	}

}
