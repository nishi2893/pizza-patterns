package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class Hamburger extends ToppingsDecorator{

	private Pizza pizza;
	
	public Hamburger(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "hamburger, ";
	}

	@Override
	public double getCost() {
		return 2.0 + pizza.getCost();
	}

	

}
