package ca.sfu.cmpt213;

public class Puppy {
	private int wagRate = 0;
	private String name;
	
	public Puppy(String name, int wagRate) {
		this.wagRate = wagRate;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getWagRate() {
		return wagRate;
	}
	
	public void setName(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}
	}
	
	public void setWagRate(int newWag) {
		if (newWag < 0) {
			throw new IllegalArgumentException("Wag rate must be >= 0");
		}
		wagRate = newWag;
	}
	
}
