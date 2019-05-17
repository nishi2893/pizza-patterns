package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class Sausage extends ToppingsDecorator{
	
	private Pizza pizza;
	
	public Sausage(Pizza pizza) {
		
		this.pizza=pizza;
		
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "sausage, ";
	}

	@Override
	public double getCost() {
		
		return 2.0 + pizza.getCost();
	}

	
}
