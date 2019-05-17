package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class Pepperoni extends ToppingsDecorator{

	private Pizza pizza;
	
	public Pepperoni(Pizza pizza) {
		
		this.pizza=pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + "pepperoni, ";
	}

	@Override
	public double getCost() {
		
		return 2.0 + pizza.getCost();
	}

	

}
