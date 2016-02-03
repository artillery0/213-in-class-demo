package ca.cmpt213.classDemo.size;

import java.util.ArrayList;

public class PizzaOrder {
	private static final int ORDER_SIZE = 5;
//	Pizza[] pizzas;
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public PizzaOrder() {
//		pizzas = new Pizza[ORDER_SIZE];
//		pizzas = new ArrayList<Pizza>();
		
		for (int i = 0; i < ORDER_SIZE; i++) {
//			pizzas[i] = new Pizza(10+i);
			pizzas.add(new Pizza(10+i));
		}
		
		System.out.println("Number of pizzas is: " + pizzas.size());
//		pizzas[0].calculateArea();
//		pizzas[10].calculateArea();
		
	}
	
	public void printSizes() {
//		for (int i = 0; i < pizzas.size(); i++) {
//			Pizza currentPizza = pizzas.get(i);
//			System.out.println("Area is " + currentPizza.calculateArea());
//		}

		double minArea = Double.MAX_VALUE;
		for (Pizza pizza : pizzas) {
			System.out.println("Area is " + pizza.calculateArea());
			if (pizza.calculateArea() < minArea) {
				minArea = pizza.calculateArea();
			}
		}
		System.out.println("Min area: " + minArea);
	}
}
