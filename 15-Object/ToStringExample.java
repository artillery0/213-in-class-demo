

public class ToStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ToStringExample();
	}
	public ToStringExample() {
		System.out.println(this);
		
		Employee bob = new Employee();
		System.out.println("Bob: " + bob);
		
		Manager sarah = new Manager();
		System.out.println("Sarah: " + sarah);
	}
	
	
	class Employee {
		private String name = "Bubba";
		private int salary = 50000;
		@Override
		public String toString() {
			return getClass().getName()
					+ "[name="+name
					+ ",salary="+salary
					+ "]";
		}
	}
	
	class Manager extends Employee {
		private int bonus = 200000;
		@Override
		public String toString() {
			return super.toString()
					+ "[bonus="+bonus
					+ "]";
		}
	}

}
