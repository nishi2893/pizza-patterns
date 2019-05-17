package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Pizza;

public class Cheese extends ToppingsDecorator{
	
	
	private Pizza pizza;
	
	public Cheese(Pizza pizza)
	{
		this.pizza=pizza;
	}

	

	@Override
	public String getDescription() {
		
		return pizza.getDescription() + "Extra Cheese, ";
	}

	@Override
	public double getCost() {
		
		return 1.85 + pizza.getCost();
	}

	
	

}
