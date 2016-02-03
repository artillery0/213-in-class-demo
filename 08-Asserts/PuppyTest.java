package ca.sfu.cmpt213;

import junit.framework.TestCase;

public class PuppyTest extends TestCase {

	public void testCreate() {
		Puppy rover = new Puppy("Rover", 100);
		assertEquals("Rover", rover.getName());
		assertEquals(100, rover.getWagRate());
		System.out.println("Create");
	}
	
	public void testSetName() {
		Puppy rover = new Puppy("Rover", 100);
		rover.setName("Fluffy");
		assertEquals("Fluffy", rover.getName());
		System.out.println("Name");
	}

	public void testSetNameFail() {
		Puppy rover = new Puppy("Rover", 100);
		rover.setName("");
		assertEquals("Rover", rover.getName());
		
		rover.setName(null);
		assertEquals("Rover", rover.getName());
		System.out.println("NameFail");
	}
	
	public void testSetWagRate() {
		Puppy rover = new Puppy("Rover", 100);
		rover.setWagRate(1000);
		assertEquals(1000, rover.getWagRate());
		rover.setWagRate(0);
		assertEquals(0, rover.getWagRate());
		rover.setWagRate(1);
		assertEquals(1, rover.getWagRate());
		System.out.println("WagRate");
	}
	public void testSetWagRateFail() {
		Puppy rover = new Puppy("Rover", 100);
		try {
			rover.setWagRate(-1);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals(100, rover.getWagRate());
		}
		System.out.println("WagFail");
	}
}
