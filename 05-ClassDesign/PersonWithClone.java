import java.util.Date;


/**
 * Demo to show how an immutable object is useful.
 * @author Brian Fraser
 *
 */
public class PersonWithClone {
	private Date birthDay;
	public PersonWithClone(Date birthDay) {
		this.birthDay = (Date) birthDay.clone();
	}
	
	public Date getBirthDay() {
		return (Date) birthDay.clone();
	}
	
	
	
	
	
	public static void main(String[] args) {
		exploitGetBirthDay();
		exploitConstructor();
	}

	private static void exploitGetBirthDay() {
		PersonWithClone george = new PersonWithClone(new Date());
		System.out.println("Before: " + george.getBirthDay());

		Date date = george.getBirthDay();
		date.setTime(0);
		System.out.println("After:  " + george.getBirthDay());
		System.out.println();
	}
	
	private static void exploitConstructor() {
		Date now = new Date();
		PersonWithClone george = new PersonWithClone(now);
		System.out.println("Before: " + george.getBirthDay());

		now.setTime(0);
		System.out.println("After:  " + george.getBirthDay());
		System.out.println();
	}
}

