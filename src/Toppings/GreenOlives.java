package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class GreenOlives extends ToppingsDecorator {

	private Pizza pizza;

	public GreenOlives(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "Green Olives, ";
	}

	@Override
	public double getCost() {
		return 1.35 + pizza.getCost();
	}

	
}
