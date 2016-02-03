package ca.sfu.cmpt213;

public class AssertDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		assertRadius();
	}
	
	private static void assertRadius() {
		double rSquared = getCircleArea() / Math.PI;
		assert rSquared >= 0;
		double r = squareroot(rSquared);
		System.out.println("Answer: " + r);
	}

	private static double getCircleArea() {
		return -10;
	}
	
	private static double squareroot(double rSquared) {
		return Math.sqrt(rSquared);
	}
	

}
