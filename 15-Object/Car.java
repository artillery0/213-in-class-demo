import java.util.Date;


public class Car implements Cloneable {
	private String make;
	private Date year;
	private double weight;
	
	@Override
	public boolean equals(Object otherObject) {
		if (otherObject == null) {
			return false;
		}
		if (otherObject == this) {
			return true;
		}
		if (otherObject.getClass() != this.getClass()) {
			return false;
		}
		
		Car other = (Car) otherObject;
		// Assumes make and year are not null!
		return (this.make.equals(other.make)
				&& this.year.equals(other.year)
				&& this.weight == other.weight);
	}

	
	@Override
	public int hashCode() {
		return make.hashCode() * 11
				+ year.hashCode() * 43
				+ new Double(weight).hashCode() * 13;
	}
	
	@Override 
	public Car clone() {
		try {
			Car cloned = (Car) super.clone();
			cloned.year = (Date) year.clone();
			return cloned;
		} catch (CloneNotSupportedException e) {
			// Impossible to trigger: we support cloneable!
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (!(obj instanceof Car)) {
//			return false;
//		}
//		Car other = (Car) obj;
//		if (make == null) {
//			if (other.make != null) {
//				return false;
//			}
//		} else if (!make.equals(other.make)) {
//			return false;
//		}
//		if (Double.doubleToLongBits(weight) != Double
//				.doubleToLongBits(other.weight)) {
//			return false;
//		}
//		if (year == null) {
//			if (other.year != null) {
//				return false;
//			}
//		} else if (!year.equals(other.year)) {
//			return false;
//		}
//		return true;
//	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", year=" + year + ", weight=" + weight
				+ "]";
	}

}
