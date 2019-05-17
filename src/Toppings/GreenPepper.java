package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class GreenPepper extends ToppingsDecorator{

	private Pizza pizza;

	public GreenPepper(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + "Green Pepper, ";
	}

	@Override
	public double getCost() {
		return 1.50 + pizza.getCost();
	}

	

}
