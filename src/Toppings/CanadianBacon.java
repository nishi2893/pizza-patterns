package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class CanadianBacon extends ToppingsDecorator{
	
	private Pizza pizza;

	public CanadianBacon(Pizza pizza) {
		
		this.pizza=pizza;
		
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "canadian bacon, ";
	}

	@Override
	public double getCost() {
		return 2.75 + pizza.getCost();
	}

	

}
