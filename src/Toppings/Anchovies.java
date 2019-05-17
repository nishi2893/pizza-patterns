package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class Anchovies extends ToppingsDecorator{
	
	private Pizza pizza;

	public Anchovies(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "Anchovies, ";
	}

	@Override
	public double getCost() {
		return 0 + pizza.getCost();
	}
	

}
