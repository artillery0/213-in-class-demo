package ca.threads.boundedqueue;

/** 
   A first-in, first-out bounded collection of objects. 
   By Cay Horstmann, OOD&P 2nd ed.
 */ 
public class BoundedQueue<Type> { 
	private Object[] elements; 
	private int head = 0; 
	private int tail = 0; 
	private int size = 0;

	public BoundedQueue(int capacity) { 
		elements = new Object[capacity]; 
	} 

	/** 
       Removes the object at the head. 
       Precondition: !isEmpty()
	 */ 
	public Type remove() {
		Type result = (Type) elements[head]; 
		head = (head + 1) % elements.length;		
		size--;
		return result; 
	} 

	/** 
       Appends an object at the tail. 
       Precondition: !isFull();
	 */ 
	public void add(Type newValue) {
		elements[tail] = newValue; 
		tail++;
		size++;
		if (tail == elements.length) {
			tail = 0; 
		}
	} 

	public boolean isFull() { 
		return size == elements.length;
	} 

	public boolean isEmpty() { 
		return size == 0; 
	} 
}
