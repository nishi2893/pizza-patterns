package Decorator;

import Factory.Pizza;

public abstract class ToppingsDecorator extends Pizza {
	
	public abstract String getDescription();
	
	public abstract double getCost();

}
