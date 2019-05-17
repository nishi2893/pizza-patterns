package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class Mushrooms extends ToppingsDecorator{
	
	private Pizza pizza;

	public Mushrooms(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "Mushrooms, ";
	}

	@Override
	public double getCost() {
		return 1.75 + pizza.getCost();
	}

	
}
