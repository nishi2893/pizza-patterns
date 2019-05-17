package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class Beer extends ToppingsDecorator{

	private Pizza pizza;
	
	public Beer(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "beer, ";
	}

	@Override
	public double getCost() {
		return 3.25 + pizza.getCost();
	}

	

}
