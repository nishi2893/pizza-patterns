package Factory;

public abstract class PizzaStore {
	
	protected abstract Pizza createPizza(String item,Pizza pizza);
	
	public Pizza orderPizza(String type, Pizza pizza)                      //order pizza method where the choice of user is passed
	{
		
		pizza = createPizza(type,pizza);             //create pizza method
		
		return pizza;
	}

}
