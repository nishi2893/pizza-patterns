package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class Onions extends ToppingsDecorator{
	
	private Pizza pizza;

	public Onions(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "onions, ";
	}

	@Override
	public double getCost() {
		return 1.50 + pizza.getCost();
	}

	

}
