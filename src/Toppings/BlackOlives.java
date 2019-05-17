package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class BlackOlives extends ToppingsDecorator{
	
	private Pizza pizza;

	public BlackOlives(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "Black Olives, ";
	}

	@Override
	public double getCost() {
		return 1.50 + pizza.getCost();
	}

	

}
