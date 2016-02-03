import java.util.Date;


/**
 * Demo to show how a mutable object can be dangerous
 * @author Brian Fraser
 *
 */
public class Person {
	private Date birthDay;
	public Person(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	
	
	public static void main(String[] args) {
		exploitGetBirthDay();
		exploitConstructor();
	}


	private static void exploitGetBirthDay() {
		Person george = new Person(new Date());
		System.out.println("Before: " + george.getBirthDay());

		Date date = george.getBirthDay();
		date.setTime(0);
		System.out.println("After:  " + george.getBirthDay());
		System.out.println();
	}
	
	private static void exploitConstructor() {
		Date now = new Date();
		Person george = new Person(now);
		System.out.println("Before: " + george.getBirthDay());

		now.setTime(0);
		System.out.println("After:  " + george.getBirthDay());
		System.out.println();
	}
}

