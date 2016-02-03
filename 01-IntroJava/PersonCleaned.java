package cs.sfu.cmpt213.badcode;

/**
 * Class to store information about a person's name and age.
 * @author bfraser
 *
 */
public class PersonCleaned {
	// 42 is unforgivable because....????
	private static final int UNFORGIVABLE_AGE = 42;
	private static final int MIN_AGE = 0;
	private static final int MAX_AGE = 150;

	private int age;
	private String name;

	public PersonCleaned(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int newAge) {
		if (isInvalidAge(newAge)) {
			throw new RuntimeException("Invalid age");
		}
		age = newAge;
	}
	private boolean isInvalidAge(int newAge) {		
		boolean isTooOld = newAge > MAX_AGE;
		boolean isTooYoung = newAge < MIN_AGE;
		boolean isUnforgivableAge = newAge == UNFORGIVABLE_AGE;
		return isTooOld || isTooYoung || isUnforgivableAge;
	}

	@Override
	public String toString() {
		return getClass().getName() 
				+ "[name=" + name
				+ ", age=" + age
				+ "]";
//		return "Person '" + name + "' is " + age;
	}

}
