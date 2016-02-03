public class ParseIntException {
	public static void main(String[] args) {
		String input = "123xxx";
		try {
			int num = Integer.parseInt(input);
			System.out.println("That's the number " + num);
		} catch (NumberFormatException e) {
			System.out.println("Bad input.");
		}
	}
}
